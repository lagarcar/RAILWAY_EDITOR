package eseo.idm.railway2jfx;

import com.google.common.io.CharStreams;
import eseo.idm.railway.Area;
import eseo.idm.railway.Line;
import eseo.idm.railway.MetroMap;
import eseo.idm.railway.RailwayFactory;
import eseo.idm.railway.Station;
import eseo.idm.railway2jfx.JFX;
import eseo.idm.railway2jfx.Railway;
import eseo.idm.railway2jfx.railway2jfx;
import fr.eseo.aof.exploration.OCLByEquivalence;
import fr.eseo.atlc.constraints.Constraint;
import fr.eseo.atlc.constraints.ConstraintGroup;
import fr.eseo.atol.gen.AbstractRule;
import fr.eseo.atol.gen.JFXUtils;
import fr.eseo.atol.gen.plugin.constraints.solvers.Constraints2Cassowary;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.papyrus.aof.core.AOFFactory;
import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.ISequence;
import org.eclipse.papyrus.aof.core.IUnaryFunction;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class RunRailway2jfx extends Application {
  @Data
  public static class Color {
    private static Random obj = new Random();
    
    public static String getRandomColor() {
      int rand_num = RunRailway2jfx.Color.obj.nextInt((0xffffff + 1));
      String colorCode = String.format("0x%06xff", Integer.valueOf(rand_num));
      return colorCode;
    }
    
    @Override
    @Pure
    public int hashCode() {
      return 1;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      return b.toString();
    }
  }
  
  private Model source = null;
  
  private final Pane left = new Pane();
  
  private MetroMap map;
  
  private Constraints2Cassowary c2cas;
  
  private boolean isReadyToMerge = false;
  
  private boolean hide = false;
  
  private List<String> stationNames = new Function0<List<String>>() {
    public List<String> apply() {
      try {
        List<String> _readLines = CharStreams.readLines(new FileReader("stationNames"));
        return _readLines;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final HashMap<Circle, Station> circle2Station = new HashMap<Circle, Station>();
  
  private final HashMap<Station, Circle> station2Circle = new HashMap<Station, Circle>();
  
  private final HashMap<Station, Text> station2Txt = new HashMap<Station, Text>();
  
  private final railway2jfx transfo = new railway2jfx();
  
  @Override
  public void start(final Stage primaryStage) throws Exception {
    final BiConsumer<railway2jfx.SourceTupleStation, railway2jfx.TargetTupleStation> _function = (railway2jfx.SourceTupleStation src, railway2jfx.TargetTupleStation tgt) -> {
      this.circle2Station.put(tgt.c, src.s);
      this.station2Circle.put(src.s, tgt.c);
      this.station2Txt.put(src.s, tgt.txt);
    };
    this.transfo.Station.registerCustomTrace = _function;
    @Extension
    final Railway railways = this.transfo.RailwayMM;
    @Extension
    final JFX jfx = this.transfo.JFXMM;
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      Map<String, Object> _extensionToFactoryMap = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Resource r = rs.getResource(URI.createFileURI("test.xmi"), true);
      EObject _get = r.getContents().get(0);
      this.map = ((MetroMap) _get);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        this.map = RailwayFactory.eINSTANCE.createMetroMap();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final JFX.Figure f = this.transfo.MetroMap(this.map).t;
    final Function1<JFX.Figure, IBox<JFX.Figure>> _function_1 = (JFX.Figure it) -> {
      return jfx._children(it);
    };
    final IBox<JFX.Figure> figures = AOFFactory.INSTANCE.<JFX.Figure>createSequence(f).concat(OCLByEquivalence.<JFX.Figure>closure(jfx._children(f), _function_1));
    final IUnaryFunction<JFX.Figure, IBox<ConstraintGroup>> _function_2 = (JFX.Figure it) -> {
      IBox<ConstraintGroup> _elvis = null;
      ISequence<ConstraintGroup> __constraints = null;
      if (it!=null) {
        __constraints=jfx._constraints(it);
      }
      if (__constraints != null) {
        _elvis = __constraints;
      } else {
        IBox<ConstraintGroup> _emptySequence = AbstractRule.<ConstraintGroup>emptySequence();
        _elvis = _emptySequence;
      }
      return _elvis;
    };
    final IBox<ConstraintGroup> constraints = figures.<ConstraintGroup>collectMutable(_function_2);
    final IUnaryFunction<JFX.Figure, IBox<Node>> _function_3 = (JFX.Figure it) -> {
      IBox<Node> _elvis = null;
      ISequence<Node> __nodes = null;
      if (it!=null) {
        __nodes=jfx._nodes(it);
      }
      if (__nodes != null) {
        _elvis = __nodes;
      } else {
        IBox<Node> _emptySequence = AbstractRule.<Node>emptySequence();
        _elvis = _emptySequence;
      }
      return _elvis;
    };
    final IBox<Node> nodes = figures.<Node>collectMutable(_function_3).inspect("nodes: ");
    Constraints2Cassowary _constraints2Cassowary = new Constraints2Cassowary(jfx, railways, Constraints2Cassowary.geometricAbstraction);
    this.c2cas = _constraints2Cassowary;
    this.transfo.MetroMap(this.map).rect.setWidth(1000);
    this.transfo.MetroMap(this.map).rect.setHeight(1000);
    final IUnaryFunction<ConstraintGroup, Constraint> _function_4 = (ConstraintGroup it) -> {
      return it;
    };
    this.c2cas.apply(constraints.<Constraint>collect(_function_4));
    this.c2cas.solve();
    final IUnaryFunction<Node, Boolean> _function_5 = (Node it) -> {
      return jfx._movable(it).get();
    };
    final IUnaryFunction<Node, Object> _function_6 = (Node it) -> {
      Object _xblockexpression = null;
      {
        this.onPress(it);
        this.onDrag(it);
        _xblockexpression = null;
      }
      return _xblockexpression;
    };
    nodes.select(_function_5).<Object>collect(_function_6);
    final IUnaryFunction<Node, Boolean> _function_7 = (Node it) -> {
      return jfx._editable(it).get();
    };
    final IUnaryFunction<Node, Object> _function_8 = (Node it) -> {
      Object _xblockexpression = null;
      {
        this.onClick(it);
        _xblockexpression = null;
      }
      return _xblockexpression;
    };
    nodes.select(_function_7).<Object>collect(_function_8);
    JFXUtils.<Node>toBox(this.left.getChildren()).bind(nodes);
    this.showEditor(primaryStage);
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
  
  public void showEditor(final Stage stage) {
    final HBox root = new HBox();
    root.getChildren().addAll(this.left);
    final Scene scene = new Scene(root, 2000, 520);
    this.transfo.MetroMap(this.map).rect.widthProperty().bind(scene.widthProperty());
    this.transfo.MetroMap(this.map).rect.heightProperty().bind(scene.heightProperty());
    stage.setScene(scene);
    stage.setTitle("Railway Editor");
    stage.show();
    final EventHandler<KeyEvent> _function = (KeyEvent t) -> {
      try {
        KeyCode _code = t.getCode();
        if (_code != null) {
          switch (_code) {
            case ESCAPE:
              final ResourceSetImpl rs = new ResourceSetImpl();
              Map<String, Object> _extensionToFactoryMap = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
              XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
              _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
              Resource r = rs.createResource(URI.createFileURI("test.xmi"));
              r.getContents().add(this.map);
              r.save(Collections.<Object, Object>emptyMap());
              stage.close();
              break;
            case L:
              Random r_1 = new Random();
              InputOutput.<String>print("addLine");
              final Line line = RailwayFactory.eINSTANCE.createLine();
              line.setColor(RunRailway2jfx.Color.getRandomColor());
              line.setIdLine(this.map.getLines().size());
              final Station station = RailwayFactory.eINSTANCE.createStation();
              this.map.getStations().add(station);
              int _idCurrentLine = this.map.getIdCurrentLine();
              String _plus = ("0L" + Integer.valueOf(_idCurrentLine));
              station.setIdStation(_plus);
              station.setColor(line.getColor());
              station.setPosX(r_1.nextInt(1500));
              double _height = scene.getHeight();
              int _minus = (((int) _height) - 50);
              station.setPosY(r_1.nextInt(_minus));
              String name = this.stationNames.get(r_1.nextInt(518));
              int _length = name.length();
              int _minus_1 = (_length - 2);
              station.setName(name.substring(5, _minus_1));
              boolean _isEmpty = this.map.getAreas().isEmpty();
              boolean _not = (!_isEmpty);
              if (_not) {
                EList<Area> _areas = this.map.getAreas();
                int _idCurrentArea = this.map.getIdCurrentArea();
                int _minus_2 = (_idCurrentArea - 1);
                _areas.get(_minus_2).getStations().add(station);
              }
              Constraints2Cassowary solver = this.c2cas;
              InputOutput.<HashMap<Station, Circle>>println(this.station2Circle);
              solver.suggestValue(RunRailway2jfx.xProp(this.station2Circle.get(station)), station.getPosX());
              solver.suggestValue(RunRailway2jfx.yProp(this.station2Circle.get(station)), station.getPosY());
              this.map.getLines().add(line);
              line.getStations().add(station);
              this.map.setIdCurrentLine(((Object[])Conversions.unwrapArray(this.map.getLines(), Object.class)).length);
              InputOutput.<Integer>println(Integer.valueOf(this.map.getIdCurrentLine()));
              break;
            case S:
              InputOutput.<String>print("addStation");
              final Random rand = new Random();
              final Station station_1 = RailwayFactory.eINSTANCE.createStation();
              this.map.getStations().add(station_1);
              EList<Line> _lines = this.map.getLines();
              int _idCurrentLine_1 = this.map.getIdCurrentLine();
              int _minus_3 = (_idCurrentLine_1 - 1);
              String _string = Integer.toString(((Object[])Conversions.unwrapArray(_lines.get(_minus_3).getStations(), Object.class)).length);
              String _plus_1 = (_string + "L");
              int _idCurrentLine_2 = this.map.getIdCurrentLine();
              String _plus_2 = (_plus_1 + Integer.valueOf(_idCurrentLine_2));
              station_1.setIdStation(_plus_2);
              EList<Line> _lines_1 = this.map.getLines();
              int _idCurrentLine_3 = this.map.getIdCurrentLine();
              int _minus_4 = (_idCurrentLine_3 - 1);
              station_1.setColor(_lines_1.get(_minus_4).getColor());
              EList<Line> _lines_2 = this.map.getLines();
              int _idCurrentLine_4 = this.map.getIdCurrentLine();
              int _minus_5 = (_idCurrentLine_4 - 1);
              EList<Station> _stations = _lines_2.get(_minus_5).getStations();
              EList<Line> _lines_3 = this.map.getLines();
              int _idCurrentLine_5 = this.map.getIdCurrentLine();
              int _minus_6 = (_idCurrentLine_5 - 1);
              int _length_1 = ((Object[])Conversions.unwrapArray(_lines_3.get(_minus_6).getStations(), Object.class)).length;
              int _minus_7 = (_length_1 - 1);
              double _posX = _stations.get(_minus_7).getPosX();
              double _plus_3 = (_posX + 60);
              station_1.setPosX(_plus_3);
              EList<Line> _lines_4 = this.map.getLines();
              int _idCurrentLine_6 = this.map.getIdCurrentLine();
              int _minus_8 = (_idCurrentLine_6 - 1);
              EList<Station> _stations_1 = _lines_4.get(_minus_8).getStations();
              EList<Line> _lines_5 = this.map.getLines();
              int _idCurrentLine_7 = this.map.getIdCurrentLine();
              int _minus_9 = (_idCurrentLine_7 - 1);
              int _length_2 = ((Object[])Conversions.unwrapArray(_lines_5.get(_minus_9).getStations(), Object.class)).length;
              int _minus_10 = (_length_2 - 1);
              double _posY = _stations_1.get(_minus_10).getPosY();
              double _plus_4 = (_posY + 60);
              station_1.setPosY(_plus_4);
              String name_1 = this.stationNames.get(rand.nextInt(518));
              int _length_3 = name_1.length();
              int _minus_11 = (_length_3 - 2);
              station_1.setName(name_1.substring(5, _minus_11));
              boolean _isEmpty_1 = this.map.getAreas().isEmpty();
              boolean _not_1 = (!_isEmpty_1);
              if (_not_1) {
                EList<Area> _areas_1 = this.map.getAreas();
                int _idCurrentArea_1 = this.map.getIdCurrentArea();
                int _minus_12 = (_idCurrentArea_1 - 1);
                _areas_1.get(_minus_12).getStations().add(station_1);
              }
              Constraints2Cassowary solver_1 = this.c2cas;
              solver_1.suggestValue(RunRailway2jfx.xProp(this.station2Circle.get(station_1)), station_1.getPosX());
              solver_1.suggestValue(RunRailway2jfx.yProp(this.station2Circle.get(station_1)), station_1.getPosY());
              EList<Line> _lines_6 = this.map.getLines();
              int _idCurrentLine_8 = this.map.getIdCurrentLine();
              int _minus_13 = (_idCurrentLine_8 - 1);
              _lines_6.get(_minus_13).getStations().add(station_1);
              break;
            case A:
              Area area = RailwayFactory.eINSTANCE.createArea();
              area.setIdArea(this.map.getAreas().size());
              area.setColor(RunRailway2jfx.Color.getRandomColor());
              this.map.getAreas().add(area);
              this.map.setIdCurrentArea(((Object[])Conversions.unwrapArray(this.map.getAreas(), Object.class)).length);
              break;
            case UP:
              InputOutput.<String>print("increment line");
              final int index = this.map.getIdCurrentLine();
              int _length_4 = ((Object[])Conversions.unwrapArray(this.map.getLines(), Object.class)).length;
              boolean _lessThan = (index < _length_4);
              if (_lessThan) {
                int _idCurrentLine_9 = this.map.getIdCurrentLine();
                int _plus_5 = (_idCurrentLine_9 + 1);
                this.map.setIdCurrentLine(_plus_5);
              }
              break;
            case DOWN:
              InputOutput.<String>print("decrement line");
              final int index_1 = this.map.getIdCurrentLine();
              if ((index_1 > 1)) {
                int _idCurrentLine_10 = this.map.getIdCurrentLine();
                int _minus_14 = (_idCurrentLine_10 - 1);
                this.map.setIdCurrentLine(_minus_14);
              }
              break;
            case RIGHT:
              InputOutput.<String>print("increment Area");
              final int index_2 = this.map.getIdCurrentArea();
              int _length_5 = ((Object[])Conversions.unwrapArray(this.map.getLines(), Object.class)).length;
              boolean _lessThan_1 = (index_2 < _length_5);
              if (_lessThan_1) {
                int _idCurrentArea_2 = this.map.getIdCurrentArea();
                int _plus_6 = (_idCurrentArea_2 + 1);
                this.map.setIdCurrentArea(_plus_6);
              }
              break;
            case LEFT:
              InputOutput.<String>print("decrement Area");
              final int index_3 = this.map.getIdCurrentArea();
              if ((index_3 > 1)) {
                int _idCurrentArea_3 = this.map.getIdCurrentArea();
                int _minus_15 = (_idCurrentArea_3 - 1);
                this.map.setIdCurrentArea(_minus_15);
              }
              break;
            case H:
              EList<Station> _stations_2 = this.map.getStations();
              for (final Station station_2 : _stations_2) {
                {
                  Constraints2Cassowary solver_2 = this.c2cas;
                  this.station2Txt.get(station_2).setVisible(this.hide);
                }
              }
              this.hide = (!this.hide);
              break;
            default:
              return;
          }
        } else {
          return;
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    scene.<KeyEvent>addEventFilter(KeyEvent.KEY_PRESSED, _function);
  }
  
  protected static DoubleProperty _xProp(final Rectangle it) {
    return it.xProperty();
  }
  
  protected static DoubleProperty _xProp(final Text it) {
    return it.xProperty();
  }
  
  protected static DoubleProperty _xProp(final Circle it) {
    return it.centerXProperty();
  }
  
  protected static DoubleProperty _yProp(final Rectangle it) {
    return it.yProperty();
  }
  
  protected static DoubleProperty _yProp(final Text it) {
    return it.yProperty();
  }
  
  protected static DoubleProperty _yProp(final Circle it) {
    return it.centerYProperty();
  }
  
  private double dx = 0.0;
  
  private double dy = 0.0;
  
  public void onPress(final Node it) {
    final EventHandler<MouseEvent> _function = (MouseEvent e) -> {
      final EventTarget t = e.getTarget();
      boolean _matched = false;
      if (t instanceof Text) {
        _matched=true;
      }
      if (!_matched) {
        if (t instanceof Rectangle) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (t instanceof Circle) {
          _matched=true;
        }
      }
      if (_matched) {
        double _x = e.getX();
        double _get = RunRailway2jfx.xProp(((Shape)t)).get();
        double _minus = (_x - _get);
        this.dx = _minus;
        double _y = e.getY();
        double _get_1 = RunRailway2jfx.yProp(((Shape)t)).get();
        double _minus_1 = (_y - _get_1);
        this.dy = _minus_1;
        e.consume();
      }
    };
    it.setOnMousePressed(_function);
  }
  
  public void onDrag(final Node it) {
    final EventHandler<MouseEvent> _function = (MouseEvent e) -> {
      final EventTarget t = e.getTarget();
      boolean _matched = false;
      if (t instanceof Text) {
        _matched=true;
      }
      if (!_matched) {
        if (t instanceof Rectangle) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (t instanceof Circle) {
          _matched=true;
        }
      }
      if (_matched) {
        MouseButton _button = e.getButton();
        if (_button != null) {
          switch (_button) {
            case PRIMARY:
              Constraints2Cassowary solver = this.c2cas;
              if ((solver.hasVariable(RunRailway2jfx.xProp(((Shape)t))) && solver.hasVariable(RunRailway2jfx.yProp(((Shape)t))))) {
                DoubleProperty _xProp = RunRailway2jfx.xProp(((Shape)t));
                double _x = e.getX();
                double _minus = (_x - this.dx);
                solver.suggestValue(_xProp, _minus);
                DoubleProperty _yProp = RunRailway2jfx.yProp(((Shape)t));
                double _y = e.getY();
                double _minus_1 = (_y - this.dy);
                solver.suggestValue(_yProp, _minus_1);
              }
              e.consume();
              break;
            default:
              break;
          }
        } else {
        }
      }
    };
    it.setOnMouseDragged(_function);
  }
  
  private Station station2Merge;
  
  private Station station2Merge2;
  
  public void onClick(final Node it) {
    final EventHandler<MouseEvent> _function = (MouseEvent e) -> {
      final EventTarget t = e.getTarget();
      boolean _matched = false;
      if (t instanceof Text) {
        _matched=true;
      }
      if (!_matched) {
        if (t instanceof Rectangle) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (t instanceof Circle) {
          _matched=true;
        }
      }
      if (_matched) {
        MouseButton _button = e.getButton();
        if (_button != null) {
          switch (_button) {
            case PRIMARY:
              if (this.isReadyToMerge) {
                this.station2Merge2 = this.circle2Station.get(t);
                EList<Station> line1Stations = this.station2Merge.getLines().get(0).getStations();
                line1Stations.set(line1Stations.indexOf(this.station2Merge), this.station2Merge2);
                this.map.getStations().remove(this.station2Merge);
                this.isReadyToMerge = false;
              } else {
                int _clickCount = e.getClickCount();
                boolean _equals = (_clickCount == 2);
                if (_equals) {
                  this.station2Merge = this.circle2Station.get(t);
                  this.isReadyToMerge = true;
                }
              }
              e.consume();
              break;
            case SECONDARY:
              Station station2Delete = this.circle2Station.get(t);
              EList<Station> line1Stations_1 = station2Delete.getLines().get(0).getStations();
              line1Stations_1.remove(station2Delete);
              this.map.getStations().remove(station2Delete);
              break;
            case MIDDLE:
              final Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setTitle("Information Dialog");
              alert.setHeaderText(null);
              String _name = this.circle2Station.get(t).getName();
              String desc = ("Station: " + _name);
              InputOutput.<EList<Line>>println(this.circle2Station.get(t).getLines());
              EList<Line> _lines = this.circle2Station.get(t).getLines();
              for (final Line line : _lines) {
                int _idLine = line.getIdLine();
                String _plus = ((desc + "\n On Line n° ") + Integer.valueOf(_idLine));
                desc = _plus;
              }
              alert.setContentText(desc);
              alert.showAndWait();
              break;
            default:
              break;
          }
        } else {
        }
      }
    };
    it.setOnMouseClicked(_function);
  }
  
  public static DoubleProperty xProp(final Shape it) {
    if (it instanceof Circle) {
      return _xProp((Circle)it);
    } else if (it instanceof Rectangle) {
      return _xProp((Rectangle)it);
    } else if (it instanceof Text) {
      return _xProp((Text)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static DoubleProperty yProp(final Shape it) {
    if (it instanceof Circle) {
      return _yProp((Circle)it);
    } else if (it instanceof Rectangle) {
      return _yProp((Rectangle)it);
    } else if (it instanceof Text) {
      return _yProp((Text)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
