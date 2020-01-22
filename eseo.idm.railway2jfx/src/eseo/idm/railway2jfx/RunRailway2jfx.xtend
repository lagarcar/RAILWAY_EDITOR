package eseo.idm.railway2jfx

import eseo.idm.railway.MetroMap
import eseo.idm.railway.RailwayFactory
import eseo.idm.railway.Station
import fr.eseo.atol.gen.AbstractRule
import fr.eseo.atol.gen.plugin.constraints.solvers.Constraints2Cassowary
import java.util.Collections
import java.util.HashMap
import java.util.Random
import javafx.application.Application
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType
import javafx.scene.input.KeyEvent
import javafx.scene.input.MouseButton
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle
import javafx.scene.text.Text
import javafx.stage.Stage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.papyrus.aof.core.AOFFactory
import org.eclipse.ui.internal.Model
import org.eclipse.xtend.lib.annotations.Data

import static extension fr.eseo.aof.exploration.OCLByEquivalence.*
import static extension fr.eseo.atol.gen.JFXUtils.*
import java.io.FileReader
import static extension com.google.common.io.CharStreams.*
import eseo.idm.railway.Line

class RunRailway2jfx extends Application {
	var Model source = null

	val left = new Pane
	var MetroMap map
	var Constraints2Cassowary c2cas

	var boolean isReadyToMerge = false
	var boolean hide = false
	
	var stationNames = new FileReader('stationNames').readLines
	val circle2Station = new HashMap<Circle, Station>
	val station2Circle = new HashMap<Station, Circle>
	val station2Txt = new HashMap<Station, Text>
	val transfo = new railway2jfx
	override start(Stage primaryStage) throws Exception {
//		val transfo2 = new railway2jfx
		
		transfo.Station.registerCustomTrace = [src, tgt |
			circle2Station.put(tgt.c, src.s)
			station2Circle.put(src.s, tgt.c)
			station2Txt.put(src.s, tgt.txt)
		]
		

		 

		extension val railways = transfo.RailwayMM
		extension val jfx = transfo.JFXMM

		try {
			val rs = new ResourceSetImpl
			rs.resourceFactoryRegistry.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
			var r = rs.getResource(URI.createFileURI("test.xmi"), true)
			map = r.contents.get(0) as MetroMap
		} catch(Exception e) {
			map = RailwayFactory.eINSTANCE.createMetroMap	
			/* 
			val line = RailwayFactory.eINSTANCE.createLine
			val station1 = RailwayFactory.eINSTANCE.createStation
			line.color= Color.getRandomColor()
			station1.idStation = "0L0"
			station1.color = line.color
			station1.posX = 100;
			station1.posY = 100;
	
			
			line.stations.add(station1)
			map.lines.add(line)
			map.stations.add(station1)
			//map.lines.add(line2)
			
			map.idCurrentLine = map.lines.length
			*/
			

		}		

		val f = transfo.MetroMap(map).t
		val figures = AOFFactory.INSTANCE.createSequence(f).concat(f._children.closure [
			it._children
		])

		val constraints = figures.collectMutable [
			it?._constraints ?: AbstractRule.emptySequence
		] // .inspect("constraints: ")
		val nodes = figures.collectMutable [
			it?._nodes ?: AbstractRule.emptySequence
		].inspect("nodes: ")

		c2cas = new Constraints2Cassowary(jfx, railways, Constraints2Cassowary.geometricAbstraction)
		// solverConstraints.set(0, constraints.collect[it as Constraint])
		transfo.MetroMap(map).rect.width = 1000
		transfo.MetroMap(map).rect.height = 1000
		c2cas.apply(constraints.collect[it])
		c2cas.solve

		nodes.select[_movable(it).get].collect [
			onPress
			onDrag

			null
		]

		nodes.select[_editable(it).get].collect [
			onClick
			null
		]

		left.children.toBox.bind(nodes)

		showEditor(primaryStage)
	}

	def static void main(String[] args) {
		launch(args)
	}

	def showEditor(Stage stage) {
		val root = new HBox
		root.children.addAll(left)
		val scene = new Scene(root, 2000, 520);
		transfo.MetroMap(map).rect.widthProperty.bind(scene.widthProperty)
		transfo.MetroMap(map).rect.heightProperty.bind(scene.heightProperty)
		stage.setScene(scene);
		stage.setTitle("Railway Editor");
		stage.show();
		//Quit app on escape keypress
		scene.addEventFilter(KeyEvent.KEY_PRESSED, [KeyEvent t |
			switch t.getCode {
				case ESCAPE: {
					val rs = new ResourceSetImpl
					rs.resourceFactoryRegistry.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
					var r = rs.createResource(URI.createFileURI("test.xmi"))
					r.contents.add(map);
					r.save(Collections.emptyMap)
					stage.close
				}
				case L: {
					var r = new Random();
					print("addLine")
					val line = RailwayFactory.eINSTANCE.createLine
					line.color= Color.getRandomColor()
					line.idLine = map.lines.size()					
					val station = RailwayFactory.eINSTANCE.createStation
					map.stations.add(station)
					station.idStation = "0L"+map.idCurrentLine
					station.color = line.color
					station.posX = r.nextInt(1500);
					station.posY = r.nextInt(scene.height as int - 50);
					var name = stationNames.get(r.nextInt(518))
					station.name = name.substring(5
						,name.length-2
					)
					if (!map.areas.isEmpty()){	
						map.areas.get(map.idCurrentArea-1).stations.add(station)
					}
					
					var Constraints2Cassowary solver = c2cas
					println(station2Circle)
					solver.suggestValue(station2Circle.get(station).xProp, station.posX)
					solver.suggestValue(station2Circle.get(station).yProp, station.posY)

					map.lines.add(line)
					line.stations.add(station)
					map.idCurrentLine = map.lines.length
					
					
					println(map.idCurrentLine)
					
				}
				case S:{
					print("addStation")
					val rand = new Random();
					val station = RailwayFactory.eINSTANCE.createStation
					map.stations.add(station)
					station.idStation= Integer.toString(map.lines.get(map.idCurrentLine-1).stations.length)+"L"+map.idCurrentLine
					station.color = map.lines.get(map.idCurrentLine-1).color
					station.posX = map.lines.get(map.idCurrentLine-1).stations.get(map.lines.get(map.idCurrentLine-1).stations.length-1).posX+60
					station.posY = map.lines.get(map.idCurrentLine-1).stations.get(map.lines.get(map.idCurrentLine-1).stations.length-1).posY+60
					var name = stationNames.get(rand.nextInt(518))
					station.name = name.substring(5,name.length-2)
					if(!map.areas.isEmpty()){
						map.areas.get(map.idCurrentArea-1).stations.add(station)
					}
					var Constraints2Cassowary solver = c2cas
					solver.suggestValue(station2Circle.get(station).xProp, station.posX)
					solver.suggestValue(station2Circle.get(station).yProp, station.posY)

					map.lines.get(map.idCurrentLine-1).stations.add(station)
					
					//map.lines.get(0).getStations.add(station)
					//map.lines.get(1).getStations.add(station)
					

					
				}
				case A:{
					var area = RailwayFactory.eINSTANCE.createArea
					area.idArea = map.areas.size();
					area.color = Color.getRandomColor();
					map.areas.add(area)
					map.idCurrentArea = map.areas.length
				}
				case UP:{
					print("increment line")
					val index = map.idCurrentLine
					if(index<map.lines.length){
						map.idCurrentLine = map.idCurrentLine+1
					} 
				}
				case DOWN:{
					print ("decrement line")
					val index = map.idCurrentLine
					if(index>1){
						map.idCurrentLine = map.idCurrentLine-1
					}
					
					}
					
				case RIGHT:{
					print("increment Area")
					val index = map.idCurrentArea
					if(index<map.lines.length){
						map.idCurrentArea = map.idCurrentArea+1
					} 
				}
				case LEFT:{
					print ("decrement Area")
					val index = map.idCurrentArea
					if(index>1){
						map.idCurrentArea = map.idCurrentArea-1
					}
				}
				case H:{
					for(Station station : map.stations){
					var Constraints2Cassowary solver = c2cas
					station2Txt.get(station).setVisible(hide)
					}
					hide = !hide
					
				}
				default: {
					return	// not clearing toucheElements if key not supported
				}
			}
		]);
				
	}

	static dispatch def xProp(Rectangle it) {
		xProperty
	}

	static dispatch def xProp(Text it) {
		xProperty
	}

	static dispatch def xProp(Circle it) {
		centerXProperty
	}

	static dispatch def yProp(Rectangle it) {
		yProperty
	}


		static dispatch def yProp(Text it) {
		yProperty
	}

	static dispatch def yProp(Circle it) {
		centerYProperty
	}


	var dx = 0.0
	var dy = 0.0

//	val touchedElements = new Stack<Pair<Node, Element>>
	def onPress(Node it) {
		onMousePressed = [ e |
			val t = e.target
			switch t {
				Text,
				Rectangle,
				Circle: {
					dx = e.x - t.xProp.get
					dy = e.y - t.yProp.get
					e.consume

				}
			}

		]
	}

	def onDrag(Node it) {
		onMouseDragged = [ e |
			val t = e.target
			switch t {
				Text,
				Rectangle,
				Circle:
					switch (e.button) {
						case MouseButton.PRIMARY: {
							var Constraints2Cassowary solver = c2cas
							if (solver.hasVariable(t.xProp) && solver.hasVariable(t.yProp)) {
								solver.suggestValue(t.xProp, e.x - dx)
								solver.suggestValue(t.yProp, e.y - dy)
							}
							e.consume
						}
						default: {
						}
					}
			}
		]
	}

	var Station station2Merge
	var Station station2Merge2
	def onClick(Node it) {
		onMouseClicked = [ e |
			val t = e.target
			switch t {
				Text,
				Rectangle,
				Circle:
					switch (e.button) {
						case MouseButton.PRIMARY: {

								if (isReadyToMerge){
									station2Merge2 = circle2Station.get(t)
									var line1Stations = station2Merge.lines.get(0).stations
									line1Stations.set(line1Stations.indexOf(station2Merge), station2Merge2)
									map.stations.remove(station2Merge)

									isReadyToMerge = false
								}else if (e.getClickCount() == 2){
								station2Merge = circle2Station.get(t)
									isReadyToMerge = true
								}
								
							e.consume
						}
						case MouseButton.SECONDARY:{
							var station2Delete = circle2Station.get(t)
							var line1Stations = station2Delete.lines.get(0).stations
							line1Stations.remove(station2Delete)							
							map.stations.remove(station2Delete)
						}
						case MouseButton.MIDDLE:{
							val Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("Information Dialog");
							alert.setHeaderText(null);
							var desc = "Station: "+ circle2Station.get(t).name
							println (circle2Station.get(t).lines)
							for (Line line : circle2Station.get(t).lines ){
								desc = desc + "\n On Line n° "+line.idLine;
								
							}
							alert.setContentText(desc);
							
							alert.showAndWait();
						}
						default: {
						}
					}
			}
		]
	}
	



@Data static class Color {
	static Random obj = new Random();

	def static String  getRandomColor() {
	// create object of Random class
	var rand_num = obj.nextInt(0xffffff + 1);
	// format it as hexadecimal string and print
	var colorCode = String.format("0x%06xff", rand_num);
	return colorCode
	}

}
}
