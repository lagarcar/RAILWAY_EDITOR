package eseo.idm.railway2jfx;

import fr.eseo.atlc.constraints.ConstraintGroup;
import fr.eseo.atol.gen.AbstractRule;
import fr.eseo.atol.gen.JFXUtils;
import fr.eseo.atol.gen.Metaclass;
import fr.eseo.atol.gen.MetamodelUtils;
import java.util.HashMap;
import java.util.Map;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Bounds;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Text;
import org.eclipse.papyrus.aof.core.AOFFactory;
import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.IOne;
import org.eclipse.papyrus.aof.core.IOption;
import org.eclipse.papyrus.aof.core.ISequence;
import org.eclipse.papyrus.aof.core.IUnaryFunction;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JFX {
  @Data
  public static class Figure {
    private final ISequence<Node> nodes = AOFFactory.INSTANCE.<Node>createSequence();
    
    private final ISequence<ConstraintGroup> constraints = AOFFactory.INSTANCE.<ConstraintGroup>createSequence();
    
    private final ISequence<JFX.Figure> children = AOFFactory.INSTANCE.<JFX.Figure>createSequence();
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.nodes== null) ? 0 : this.nodes.hashCode());
      result = prime * result + ((this.constraints== null) ? 0 : this.constraints.hashCode());
      return prime * result + ((this.children== null) ? 0 : this.children.hashCode());
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
      JFX.Figure other = (JFX.Figure) obj;
      if (this.nodes == null) {
        if (other.nodes != null)
          return false;
      } else if (!this.nodes.equals(other.nodes))
        return false;
      if (this.constraints == null) {
        if (other.constraints != null)
          return false;
      } else if (!this.constraints.equals(other.constraints))
        return false;
      if (this.children == null) {
        if (other.children != null)
          return false;
      } else if (!this.children.equals(other.children))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("nodes", this.nodes);
      b.add("constraints", this.constraints);
      b.add("children", this.children);
      return b.toString();
    }
    
    @Pure
    public ISequence<Node> getNodes() {
      return this.nodes;
    }
    
    @Pure
    public ISequence<ConstraintGroup> getConstraints() {
      return this.constraints;
    }
    
    @Pure
    public ISequence<JFX.Figure> getChildren() {
      return this.children;
    }
  }
  
  public interface Addable<E extends Object> {
    public abstract void add(final E e);
  }
  
  public static final Metaclass<Text> Text = ((Metaclass<javafx.scene.text.Text>) () -> {
    return new javafx.scene.text.Text();
  });
  
  public static final Metaclass<Line> Line = ((Metaclass<javafx.scene.shape.Line>) () -> {
    return new javafx.scene.shape.Line();
  });
  
  public static final Metaclass<Circle> Circle = ((Metaclass<javafx.scene.shape.Circle>) () -> {
    return new javafx.scene.shape.Circle();
  });
  
  public static final Metaclass<Rectangle> Rectangle = ((Metaclass<javafx.scene.shape.Rectangle>) () -> {
    return new javafx.scene.shape.Rectangle();
  });
  
  public static final Metaclass<Polygon> Polygon = ((Metaclass<javafx.scene.shape.Polygon>) () -> {
    return new javafx.scene.shape.Polygon();
  });
  
  public static final Metaclass<Polyline> Polyline = ((Metaclass<javafx.scene.shape.Polyline>) () -> {
    return new javafx.scene.shape.Polyline();
  });
  
  public static final Metaclass<JFX.Figure> Figure = ((Metaclass<eseo.idm.railway2jfx.JFX.Figure>) () -> {
    return new eseo.idm.railway2jfx.JFX.Figure();
  });
  
  public static final Metaclass<Node> Node = ((Metaclass<javafx.scene.Node>) () -> {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Cannot instantiate JavaFX abstract class Node");
    throw new UnsupportedOperationException(_builder.toString());
  });
  
  public StringProperty _id(final Node e) {
    return e.idProperty();
  }
  
  public final Function1<Shape, ? extends JFX.Addable<String>> __strokeLineJoin = ((Function1<Shape, JFX.Addable<String>>) (Shape e) -> {
    return new JFX.Addable<String>() {
      @Override
      public void add(final String it) {
        e.setStrokeLineJoin(StrokeLineJoin.valueOf(it));
      }
    };
  });
  
  public StringProperty _text(final Text e) {
    return e.textProperty();
  }
  
  public DoubleProperty _width(final Rectangle r) {
    return r.widthProperty();
  }
  
  public DoubleProperty _height(final Rectangle r) {
    return r.heightProperty();
  }
  
  public ISequence<Node> _nodes(final JFX.Figure it) {
    return it.nodes;
  }
  
  public ISequence<ConstraintGroup> _constraints(final JFX.Figure it) {
    return it.constraints;
  }
  
  public ISequence<JFX.Figure> _children(final JFX.Figure it) {
    return it.children;
  }
  
  public IBox<String> asMutableString(final ObjectProperty<Paint> it) {
    final IUnaryFunction<Paint, String> _function = (Paint it_1) -> {
      String _string = null;
      if (it_1!=null) {
        _string=it_1.toString();
      }
      return _string;
    };
    final IUnaryFunction<String, Paint> _function_1 = (String it_1) -> {
      return Paint.valueOf(it_1);
    };
    return JFXUtils.<Paint>toBox(it).<String>collect(_function, _function_1);
  }
  
  public final Function1<Shape, IBox<String>> __stroke = ((Function1<Shape, IBox<String>>) (Shape it) -> {
    return this.asMutableString(this.stroke_(it));
  });
  
  public final Function1<Shape, IBox<String>> __fill = ((Function1<Shape, IBox<String>>) (Shape it) -> {
    return this.asMutableString(this._fill(it));
  });
  
  protected ObjectProperty<Paint> _stroke_(final Shape it) {
    return it.strokeProperty();
  }
  
  public ObjectProperty<Paint> _fill(final Shape it) {
    return it.fillProperty();
  }
  
  public final Function1<Node, IOne<Boolean>> __movable = ((Function1<Node, IOne<Boolean>>) (Node it) -> {
    return this._movable(it);
  });
  
  private final HashMap<Node, IOne<Boolean>> movableNodes = new HashMap<Node, IOne<Boolean>>();
  
  public <K extends Object, V extends Object> V fluentPut(final Map<K, V> it, final K k, final V v) {
    V _xblockexpression = null;
    {
      it.put(k, v);
      _xblockexpression = v;
    }
    return _xblockexpression;
  }
  
  public IOne<Boolean> _movable(final Node it) {
    IOne<Boolean> _elvis = null;
    IOne<Boolean> _get = this.movableNodes.get(it);
    if (_get != null) {
      _elvis = _get;
    } else {
      IOne<Boolean> _fluentPut = this.<Node, IOne<Boolean>>fluentPut(this.movableNodes, it, AOFFactory.INSTANCE.<Boolean>createOne(Boolean.valueOf(false)));
      _elvis = _fluentPut;
    }
    return _elvis;
  }
  
  public final Function1<Node, IOne<Boolean>> __hideable = ((Function1<Node, IOne<Boolean>>) (Node it) -> {
    return this._hideable(it);
  });
  
  private final HashMap<Node, IOne<Boolean>> hideableNodes = new HashMap<Node, IOne<Boolean>>();
  
  public IOne<Boolean> _hideable(final Node it) {
    IOne<Boolean> _elvis = null;
    IOne<Boolean> _get = this.hideableNodes.get(it);
    if (_get != null) {
      _elvis = _get;
    } else {
      IOne<Boolean> _fluentPut = this.<Node, IOne<Boolean>>fluentPut(this.hideableNodes, it, AOFFactory.INSTANCE.<Boolean>createOne(Boolean.valueOf(false)));
      _elvis = _fluentPut;
    }
    return _elvis;
  }
  
  public final Function1<Node, IOne<Boolean>> __editable = ((Function1<Node, IOne<Boolean>>) (Node it) -> {
    return this._editable(it);
  });
  
  private final HashMap<Node, IOne<Boolean>> editableNodes = new HashMap<Node, IOne<Boolean>>();
  
  public IOne<Boolean> _editable(final Node it) {
    IOne<Boolean> _elvis = null;
    IOne<Boolean> _get = this.editableNodes.get(it);
    if (_get != null) {
      _elvis = _get;
    } else {
      IOne<Boolean> _fluentPut = this.<Node, IOne<Boolean>>fluentPut(this.editableNodes, it, AOFFactory.INSTANCE.<Boolean>createOne(Boolean.valueOf(false)));
      _elvis = _fluentPut;
    }
    return _elvis;
  }
  
  /**
   * val visibleNodes = new HashMap<Node, IOne<Boolean>>
   * def _visible(Node it) {
   * visibleNodes.get(it) ?:
   * visibleNodes.fluentPut(it, AOFFactory.INSTANCE.createOne(false))
   * }
   */
  public final Function1<Text, IBox<String>> __textOrigin = MetamodelUtils.<Text, VPos>enumConverterBuilder(((Function1<Text, IBox<VPos>>) (Text it) -> {
    return JFXUtils.<VPos>toBox(it.textOriginProperty());
  }), VPos.class, "");
  
  public JFXUtils.MyReadOnlyDoubleProperty _height(final Text it) {
    final Function1<Bounds, Double> _function = (Bounds it_1) -> {
      return Double.valueOf(it_1.getHeight());
    };
    return JFXUtils.<Bounds>collectDouble(it.layoutBoundsProperty(), _function);
  }
  
  public JFXUtils.MyReadOnlyDoubleProperty _width(final Text it) {
    final Function1<Bounds, Double> _function = (Bounds it_1) -> {
      return Double.valueOf(it_1.getWidth());
    };
    return JFXUtils.<Bounds>collectDouble(it.layoutBoundsProperty(), _function);
  }
  
  public ISequence<Double> _points(final Polygon it) {
    return JFXUtils.<Double>toBox(it.getPoints());
  }
  
  public ISequence<Double> _points(final Polyline it) {
    return JFXUtils.<Double>toBox(it.getPoints());
  }
  
  public IOption<Double> _startX(final Line it) {
    IOption<Number> _box = JFXUtils.toBox(it.startXProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _startY(final Line it) {
    IOption<Number> _box = JFXUtils.toBox(it.startYProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _endX(final Line it) {
    IOption<Number> _box = JFXUtils.toBox(it.endXProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _endY(final Line it) {
    IOption<Number> _box = JFXUtils.toBox(it.endYProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _x(final Rectangle it) {
    IOption<Number> _box = JFXUtils.toBox(it.xProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _y(final Rectangle it) {
    IOption<Number> _box = JFXUtils.toBox(it.yProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IBox<Double> x(final IBox<Rectangle> it) {
    final IUnaryFunction<Rectangle, IBox<Double>> _function = (Rectangle it_1) -> {
      IBox<Double> _elvis = null;
      IOption<Double> __x = null;
      if (it_1!=null) {
        __x=this._x(it_1);
      }
      if (__x != null) {
        _elvis = __x;
      } else {
        IBox<Double> _emptyOption = AbstractRule.<Double>emptyOption();
        _elvis = _emptyOption;
      }
      return _elvis;
    };
    return it.<Double>collectMutable(_function);
  }
  
  public IBox<Double> y(final IBox<Rectangle> it) {
    final IUnaryFunction<Rectangle, IBox<Double>> _function = (Rectangle it_1) -> {
      IBox<Double> _elvis = null;
      IOption<Double> __y = null;
      if (it_1!=null) {
        __y=this._y(it_1);
      }
      if (__y != null) {
        _elvis = __y;
      } else {
        IBox<Double> _emptyOption = AbstractRule.<Double>emptyOption();
        _elvis = _emptyOption;
      }
      return _elvis;
    };
    return it.<Double>collectMutable(_function);
  }
  
  public IOption<Double> _centerX(final Circle it) {
    IOption<Number> _box = JFXUtils.toBox(it.centerXProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<Double> _centerY(final Circle it) {
    IOption<Number> _box = JFXUtils.toBox(it.centerYProperty());
    return ((IOption<Double>) ((IOption<?>) _box));
  }
  
  public IOption<String> _id(final Circle it) {
    IOption<String> _box = JFXUtils.toBox(it.idProperty());
    return ((IOption<String>) ((IOption<?>) _box));
  }
  
  public IOption<String> _radius(final Circle it) {
    IOption<Number> _box = JFXUtils.toBox(it.radiusProperty());
    return ((IOption<String>) ((IOption<?>) _box));
  }
  
  public IBox<Double> centerX(final IBox<Circle> it) {
    final IUnaryFunction<Circle, IBox<Double>> _function = (Circle it_1) -> {
      IBox<Double> _elvis = null;
      IOption<Double> __centerX = null;
      if (it_1!=null) {
        __centerX=this._centerX(it_1);
      }
      if (__centerX != null) {
        _elvis = __centerX;
      } else {
        IBox<Double> _emptyOption = AbstractRule.<Double>emptyOption();
        _elvis = _emptyOption;
      }
      return _elvis;
    };
    return it.<Double>collectMutable(_function);
  }
  
  public IBox<Double> centerY(final IBox<Circle> it) {
    final IUnaryFunction<Circle, IBox<Double>> _function = (Circle it_1) -> {
      IBox<Double> _elvis = null;
      IOption<Double> __centerY = null;
      if (it_1!=null) {
        __centerY=this._centerY(it_1);
      }
      if (__centerY != null) {
        _elvis = __centerY;
      } else {
        IBox<Double> _emptyOption = AbstractRule.<Double>emptyOption();
        _elvis = _emptyOption;
      }
      return _elvis;
    };
    return it.<Double>collectMutable(_function);
  }
  
  public ObjectProperty<Paint> stroke_(final Shape it) {
    return _stroke_(it);
  }
}
