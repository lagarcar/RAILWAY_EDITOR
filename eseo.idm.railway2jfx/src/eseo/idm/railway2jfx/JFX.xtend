package eseo.idm.railway2jfx

import fr.eseo.atlc.constraints.ConstraintGroup
import fr.eseo.atol.gen.AbstractRule
import fr.eseo.atol.gen.Metaclass
import java.util.HashMap
import java.util.Map
import javafx.beans.property.ObjectProperty
import javafx.geometry.VPos
import javafx.scene.Node
import javafx.scene.paint.Paint
import javafx.scene.shape.Circle
import javafx.scene.shape.Line
import javafx.scene.shape.Polygon
import javafx.scene.shape.Polyline
import javafx.scene.shape.Rectangle
import javafx.scene.shape.Shape
import javafx.scene.text.Text
import org.eclipse.papyrus.aof.core.AOFFactory
import org.eclipse.papyrus.aof.core.IBox
import org.eclipse.papyrus.aof.core.IOne
import org.eclipse.papyrus.aof.core.IOption
import org.eclipse.xtend.lib.annotations.Data

import static fr.eseo.atol.gen.MetamodelUtils.*

import static extension fr.eseo.atol.gen.JFXUtils.*
import javafx.scene.shape.StrokeLineJoin

public class JFX {	
	public static val Metaclass<Text> Text = [new Text()]
	public static val Metaclass<Line> Line = [new Line()]
	public static val Metaclass<Circle> Circle = [new Circle()]
	public static val Metaclass<Rectangle> Rectangle = [new Rectangle()]
	public static val Metaclass<Polygon> Polygon = [new Polygon()]
	public static val Metaclass<Polyline> Polyline = [new Polyline()]
	public static val Metaclass<Figure> Figure = [new Figure()]
	public static val Metaclass<Node> Node = [throw new UnsupportedOperationException('''Cannot instantiate JavaFX abstract class Node''')]

	@Data
	static class Figure {
		val nodes = AOFFactory.INSTANCE.<Node>createSequence
		val constraints = AOFFactory.INSTANCE.<ConstraintGroup>createSequence
		val children = AOFFactory.INSTANCE.<Figure>createSequence
	}

	def _id(Node e) {
		e.idProperty
	}

	interface Addable<E> {
		def void add(E e)
	}
	public val __strokeLineJoin = [Shape e |
		new Addable<String> {
			override add(String it) {
				e.strokeLineJoin = StrokeLineJoin.valueOf(it)
			}
		}
	]
	


	def _text(Text e) {
		e.textProperty
	}

	def _width(Rectangle r) {
		r.widthProperty
		
	}

	def _height(Rectangle r) {
		r.heightProperty
	}

	def _nodes(Figure it) {
		nodes
	}

	def _constraints(Figure it) {
		constraints
	}

	def _children(Figure it) {
		children
	}

	def asMutableString(ObjectProperty<Paint> it) {
		toBox.collect([it?.toString], [Paint.valueOf(it)])
	}

	// specific property lambdas must return IBoxes (see ATOLGen)
	public val __stroke = [
		stroke_.asMutableString
//		_stroke.collectString([it?.toString], [Paint.valueOf(it)])
	]

	public val __fill = [_fill.asMutableString]

	dispatch def stroke_(Shape it) {
		it.strokeProperty
	}

	def _fill(Shape it) {
		it.fillProperty
	}

	public val __movable = [_movable]

	val movableNodes = new HashMap<Node, IOne<Boolean>>

	def <K, V> fluentPut(Map<K, V> it, K k, V v) {
		put(k, v)
		v
	}

	def _movable(Node it) {
		movableNodes.get(it) ?:
			movableNodes.fluentPut(it, AOFFactory.INSTANCE.createOne(false))
	}

	public val __hideable = [_hideable]

	val hideableNodes = new HashMap<Node, IOne<Boolean>>

	def _hideable(Node it) {
		hideableNodes.get(it) ?:
			hideableNodes.fluentPut(it, AOFFactory.INSTANCE.createOne(false))
	}

	public val __editable = [_editable]

	val editableNodes = new HashMap<Node, IOne<Boolean>>

	def _editable(Node it) {
		editableNodes.get(it) ?:
			editableNodes.fluentPut(it, AOFFactory.INSTANCE.createOne(false))
	}
	/* 
	val visibleNodes = new HashMap<Node, IOne<Boolean>>
	def _visible(Node it) {
		visibleNodes.get(it) ?:
			visibleNodes.fluentPut(it, AOFFactory.INSTANCE.createOne(false))
	}
	* 
	*/

	public val __textOrigin = <Text, VPos>enumConverterBuilder([textOriginProperty.toBox], VPos, "")

	// readonly
	def _height(Text it) {
		layoutBoundsProperty.collectDouble[height]
	}

	// Problem with this version: returns an IBox whereas Constraints2Cassowary:
	// - expects a DoubleProperty
	// - needs to know that it is read-only
//	def _height(Text it) {
//		layoutBoundsProperty.toBox.collect[height]
//	}

	// readonly
	def _width(Text it) {
		layoutBoundsProperty.collectDouble[width]
	}

	def _points(Polygon it) {
		points.toBox
	}

	def _points(Polyline it) {
		points.toBox
	}

	def _startX(Line it) {
		startXProperty.toBox as IOption<?> as IOption<Double>
	}

	def _startY(Line it) {
		startYProperty.toBox as IOption<?> as IOption<Double>
	}

	def _endX(Line it) {
		endXProperty.toBox as IOption<?> as IOption<Double>
	}

	def _endY(Line it) {
		endYProperty.toBox as IOption<?> as IOption<Double>
	}

	def _x(Rectangle it) {
		xProperty.toBox as IOption<?> as IOption<Double>
	}

	def _y(Rectangle it) {
		yProperty.toBox as IOption<?> as IOption<Double>
	}

	def x(IBox<Rectangle> it) {
		collectMutable[it?._x ?: AbstractRule.emptyOption]
	}

	def y(IBox<Rectangle> it) {
		collectMutable[it?._y ?: AbstractRule.emptyOption]
	}

	def _centerX(Circle it) {
		centerXProperty.toBox as IOption<?> as IOption<Double>
	}

	def _centerY(Circle it) {
		centerYProperty.toBox as IOption<?> as IOption<Double>
	}
	def _id(Circle it){
		idProperty.toBox as IOption<?> as IOption<String>
	}

	def _radius(Circle it) {
		radiusProperty.toBox as IOption<?> as IOption<String>
	}

	def centerX(IBox<Circle> it) {
		collectMutable[it?._centerX ?: AbstractRule.emptyOption]
	}

	def centerY(IBox<Circle> it) {
		collectMutable[it?._centerY ?: AbstractRule.emptyOption]
	}
}
