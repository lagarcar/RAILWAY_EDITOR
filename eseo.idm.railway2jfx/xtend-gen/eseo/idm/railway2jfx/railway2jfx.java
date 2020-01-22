package eseo.idm.railway2jfx;

import eseo.idm.railway.Area;
import eseo.idm.railway.Line;
import eseo.idm.railway.MetroMap;
import eseo.idm.railway.Station;
import eseo.idm.railway2jfx.JFX;
import eseo.idm.railway2jfx.Railway;
import fr.eseo.atlc.constraints.ArExp;
import fr.eseo.atlc.constraints.BinaryExp;
import fr.eseo.atlc.constraints.ConstantExp;
import fr.eseo.atlc.constraints.ConstraintGroup;
import fr.eseo.atlc.constraints.DoubleExp;
import fr.eseo.atlc.constraints.IntExp;
import fr.eseo.atlc.constraints.SimpleConstraint;
import fr.eseo.atlc.constraints.Strength;
import fr.eseo.atlc.constraints.StrengthLevel;
import fr.eseo.atlc.constraints.VariableExp;
import fr.eseo.atlc.constraints.VariableVectorExp;
import fr.eseo.atol.gen.ATOLGen;
import fr.eseo.atol.gen.AbstractRule;
import fr.eseo.atol.gen.TupleRule;
import fr.eseo.atol.gen.plugin.constraints.common.Constraints;
import java.util.Objects;
import java.util.function.Supplier;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import org.eclipse.papyrus.aof.core.AOFFactory;

@ATOLGen(transformation = "src/eseo/idm/railway2jfx/railway2jfx.atl", metamodels = { @ATOLGen.Metamodel(name = "Railway", impl = Railway.class), @ATOLGen.Metamodel(name = "JFX", impl = JFX.class), @ATOLGen.Metamodel(name = "Constraints", impl = Constraints.class) }, extensions = { Constraints.class })
@SuppressWarnings("all")
public class railway2jfx {
  public static class SourceTupleStation {
    public SourceTupleStation(final Station s) {
      super();
      this.s = s;
    }
    
    public final Station s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleStation) {
      	SourceTupleStation o2 = (SourceTupleStation)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleStation {
    public TargetTupleStation(final JFX.Figure t, final Circle c, final Rectangle temp, final Text txt, final ConstraintGroup constraints) {
      super();
      this.t = t;
      this.c = c;
      this.temp = temp;
      this.txt = txt;
      this.constraints = constraints;
    }
    
    public TargetTupleStation() {
      super();
      this.t = JFX.Figure.newInstance();
      this.c = JFX.Circle.newInstance();
      this.temp = JFX.Rectangle.newInstance();
      this.txt = JFX.Text.newInstance();
      this.constraints = Constraints.ConstraintGroup.newInstance();
    }
    
    public final JFX.Figure t;
    
    public final Circle c;
    
    public final Rectangle temp;
    
    public final Text txt;
    
    public final ConstraintGroup constraints;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleStation) {
      	TargetTupleStation o2 = (TargetTupleStation)o;
      	return
      		Objects.equals(this.t, o2.t) &&
      		Objects.equals(this.c, o2.c) &&
      		Objects.equals(this.temp, o2.temp) &&
      		Objects.equals(this.txt, o2.txt) &&
      		Objects.equals(this.constraints, o2.constraints)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t, c, temp, txt, constraints);
    }
  }
  
  public static class SourceTupleLine {
    public SourceTupleLine(final Line s) {
      super();
      this.s = s;
    }
    
    public final Line s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleLine) {
      	SourceTupleLine o2 = (SourceTupleLine)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleLine {
    public TargetTupleLine(final JFX.Figure t, final Polyline pl, final Text txt) {
      super();
      this.t = t;
      this.pl = pl;
      this.txt = txt;
    }
    
    public TargetTupleLine() {
      super();
      this.t = JFX.Figure.newInstance();
      this.pl = JFX.Polyline.newInstance();
      this.txt = JFX.Text.newInstance();
    }
    
    public final JFX.Figure t;
    
    public final Polyline pl;
    
    public final Text txt;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleLine) {
      	TargetTupleLine o2 = (TargetTupleLine)o;
      	return
      		Objects.equals(this.t, o2.t) &&
      		Objects.equals(this.pl, o2.pl) &&
      		Objects.equals(this.txt, o2.txt)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t, pl, txt);
    }
  }
  
  public static class SourceTupleMetroMap {
    public SourceTupleMetroMap(final MetroMap s) {
      super();
      this.s = s;
    }
    
    public final MetroMap s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleMetroMap) {
      	SourceTupleMetroMap o2 = (SourceTupleMetroMap)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleMetroMap {
    public TargetTupleMetroMap(final JFX.Figure t, final Rectangle rect, final ConstraintGroup constraints) {
      super();
      this.t = t;
      this.rect = rect;
      this.constraints = constraints;
    }
    
    public TargetTupleMetroMap() {
      super();
      this.t = JFX.Figure.newInstance();
      this.rect = JFX.Rectangle.newInstance();
      this.constraints = Constraints.ConstraintGroup.newInstance();
    }
    
    public final JFX.Figure t;
    
    public final Rectangle rect;
    
    public final ConstraintGroup constraints;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleMetroMap) {
      	TargetTupleMetroMap o2 = (TargetTupleMetroMap)o;
      	return
      		Objects.equals(this.t, o2.t) &&
      		Objects.equals(this.rect, o2.rect) &&
      		Objects.equals(this.constraints, o2.constraints)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t, rect, constraints);
    }
  }
  
  public static class SourceTupleArea {
    public SourceTupleArea(final Area s) {
      super();
      this.s = s;
    }
    
    public final Area s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleArea) {
      	SourceTupleArea o2 = (SourceTupleArea)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleArea {
    public TargetTupleArea(final JFX.Figure t, final Rectangle rect, final Text txt, final ConstraintGroup constraints) {
      super();
      this.t = t;
      this.rect = rect;
      this.txt = txt;
      this.constraints = constraints;
    }
    
    public TargetTupleArea() {
      super();
      this.t = JFX.Figure.newInstance();
      this.rect = JFX.Rectangle.newInstance();
      this.txt = JFX.Text.newInstance();
      this.constraints = Constraints.ConstraintGroup.newInstance();
    }
    
    public final JFX.Figure t;
    
    public final Rectangle rect;
    
    public final Text txt;
    
    public final ConstraintGroup constraints;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleArea) {
      	TargetTupleArea o2 = (TargetTupleArea)o;
      	return
      		Objects.equals(this.t, o2.t) &&
      		Objects.equals(this.rect, o2.rect) &&
      		Objects.equals(this.txt, o2.txt) &&
      		Objects.equals(this.constraints, o2.constraints)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t, rect, txt, constraints);
    }
  }
  
  public final Railway RailwayMM = new Railway();
  
  public final JFX JFXMM = new JFX();
  
  public final Constraints ConstraintsMM = new Constraints();
  
  private Double STATION_RADIUS = 20.0;
  
  private Double STATION_STROKE_WIDTH = 10.0;
  
  public railway2jfx.TargetTupleStation Station(final Station s) {
    return
    	Station.apply(new railway2jfx.SourceTupleStation(s))
    ;
  }
  
  public railway2jfx.TargetTupleLine Line(final Line s) {
    return
    	Line.apply(new railway2jfx.SourceTupleLine(s))
    ;
  }
  
  public railway2jfx.TargetTupleMetroMap MetroMap(final MetroMap s) {
    return
    	MetroMap.apply(new railway2jfx.SourceTupleMetroMap(s))
    ;
  }
  
  public railway2jfx.TargetTupleArea Area(final Area s) {
    return
    	Area.apply(new railway2jfx.SourceTupleArea(s))
    ;
  }
  
  public final TupleRule<railway2jfx.SourceTupleStation, railway2jfx.TargetTupleStation> Station = 	new TupleRule<railway2jfx.SourceTupleStation, railway2jfx.TargetTupleStation>(
    	SourceTupleStation.class,
    	TargetTupleStation.class,
    	(in, out) -> {
    		Station s = in.s;
    		JFX.Figure t = out.t;
    		Circle c = out.c;
    		Rectangle temp = out.temp;
    		Text txt = out.txt;
    		ConstraintGroup constraints = out.constraints;
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#15:4-16:11
    	TupleRule.operator_spaceship(JFXMM._nodes(t),
    		AOFFactory.INSTANCE.createSequence(
    			c,
    			txt
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#17:4-17:26
    	TupleRule.operator_spaceship(JFXMM._children(t),
    		AOFFactory.INSTANCE.createSequence(
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#18:4-18:40
    	TupleRule.operator_spaceship(JFXMM._constraints(t),
    		AOFFactory.INSTANCE.createSequence(
    			constraints
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#21:4-21:16
    	c.setRadius(
    		15
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#22:4-22:24
    	JFXMM.__fill.apply(c).add(
    		"0xffffffff"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#23:4-23:21
    	TupleRule.operator_spaceship(JFXMM._centerX(c),
    		RailwayMM._posX(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#24:4-24:21
    	TupleRule.operator_spaceship(JFXMM._centerY(c),
    		RailwayMM._posY(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#25:4-25:21
    	TupleRule.operator_spaceship(JFXMM.__stroke.apply(c),
    		RailwayMM._color(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#26:4-26:50
    	c.setStrokeWidth(
    		STATION_STROKE_WIDTH
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#27:4-27:19
    	JFXMM.__movable.apply(c).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#28:4-28:19
    	JFXMM.__editable.apply(c).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#29:4-29:32
    	TupleRule.operator_spaceship(JFXMM._id(c),
    		RailwayMM._idStation(s).collect((e876435) ->
    			e876435 == null ?
    				null
    			:
    				e876435.toString()
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#34:4-34:18
    	TupleRule.operator_spaceship(JFXMM._text(txt),
    		RailwayMM._name(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#35:4-35:19
    	JFXMM.__movable.apply(txt).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#36:4-36:19
    	txt.setVisible(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#39:4-39:25
    	constraints.setSolver(
    		"cassowary"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#40:4-63:5
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_234149332 = Constraints.SimpleConstraint.newInstance();
    			c_234149332.setPredicate("suggest");
    			c_234149332.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_234149332 = Constraints.Strength.newInstance();
    				s_c_234149332.setStrength(StrengthLevel.WEAK);
    				s_c_234149332.setWeight(1.0);
    				return s_c_234149332;
    			}));
    			c_234149332.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1441636950 = Constraints.VariableExp.newInstance();
    				c_1441636950.setSource(c);
    				c_1441636950.setPropertyName("centerX");
    				return c_1441636950;
    			}));
    			c_234149332.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_201632281 = Constraints.VariableExp.newInstance();
    				c_201632281.setSource(s);
    				c_201632281.setPropertyName("posX");
    				return c_201632281;
    			}));
    			return c_234149332;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_815671449 = Constraints.SimpleConstraint.newInstance();
    			c_815671449.setPredicate("suggest");
    			c_815671449.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_815671449 = Constraints.Strength.newInstance();
    				s_c_815671449.setStrength(StrengthLevel.WEAK);
    				s_c_815671449.setWeight(1.0);
    				return s_c_815671449;
    			}));
    			c_815671449.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_516199554 = Constraints.VariableExp.newInstance();
    				c_516199554.setSource(c);
    				c_516199554.setPropertyName("centerY");
    				return c_516199554;
    			}));
    			c_815671449.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_482904183 = Constraints.VariableExp.newInstance();
    				c_482904183.setSource(s);
    				c_482904183.setPropertyName("posY");
    				return c_482904183;
    			}));
    			return c_815671449;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_603808907 = Constraints.SimpleConstraint.newInstance();
    			c_603808907.setPredicate("=");
    			c_603808907.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1888408156 = Constraints.VariableExp.newInstance();
    				c_1888408156.setSource(temp);
    				c_1888408156.setPropertyName("x");
    				return c_1888408156;
    			}));
    			c_603808907.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_940504442 = Constraints.BinaryExp.newInstance();
    				c_940504442.setOperator("-");
    				c_940504442.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_1774606456 = Constraints.VariableExp.newInstance();
    					c_1774606456.setSource(c);
    					c_1774606456.setPropertyName("centerX");
    					return c_1774606456;
    				}));
    				c_940504442.setRight(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableVectorExp c_216239795 = Constraints.VariableVectorExp.newInstance();
    					c_216239795.setSource(RailwayMM._area(s).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							this.Area(
    								e876435
    							)
    					).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							e876435.rect
    					));
    					c_216239795.setPropertyName("x");
    					return c_216239795;
    				}));
    				return c_940504442;
    			}));
    			if (c_603808907.getStrength() == null) {
    				c_603808907.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_603808907 = Constraints.Strength.newInstance();
    					s_c_603808907.setStrength(StrengthLevel.REQUIRED);
    					s_c_603808907.setWeight(1.0);
    					return s_c_603808907;
    				}));
    			}
    			return c_603808907;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_578906029 = Constraints.SimpleConstraint.newInstance();
    			c_578906029.setPredicate("=");
    			c_578906029.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_607997177 = Constraints.VariableExp.newInstance();
    				c_607997177.setSource(temp);
    				c_607997177.setPropertyName("y");
    				return c_607997177;
    			}));
    			c_578906029.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_1277237741 = Constraints.BinaryExp.newInstance();
    				c_1277237741.setOperator("-");
    				c_1277237741.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_591802620 = Constraints.VariableExp.newInstance();
    					c_591802620.setSource(c);
    					c_591802620.setPropertyName("centerY");
    					return c_591802620;
    				}));
    				c_1277237741.setRight(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableVectorExp c_679712956 = Constraints.VariableVectorExp.newInstance();
    					c_679712956.setSource(RailwayMM._area(s).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							this.Area(
    								e876435
    							)
    					).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							e876435.rect
    					));
    					c_679712956.setPropertyName("y");
    					return c_679712956;
    				}));
    				return c_1277237741;
    			}));
    			if (c_578906029.getStrength() == null) {
    				c_578906029.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_578906029 = Constraints.Strength.newInstance();
    					s_c_578906029.setStrength(StrengthLevel.REQUIRED);
    					s_c_578906029.setWeight(1.0);
    					return s_c_578906029;
    				}));
    			}
    			return c_578906029;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_322263295 = Constraints.SimpleConstraint.newInstance();
    			c_322263295.setPredicate("stay");
    			c_322263295.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_322263295 = Constraints.Strength.newInstance();
    				s_c_322263295.setStrength(StrengthLevel.MEDIUM);
    				s_c_322263295.setWeight(1.0);
    				return s_c_322263295;
    			}));
    			c_322263295.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_2114612292 = Constraints.VariableExp.newInstance();
    				c_2114612292.setSource(temp);
    				c_2114612292.setPropertyName("x");
    				return c_2114612292;
    			}));
    			return c_322263295;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_854120787 = Constraints.SimpleConstraint.newInstance();
    			c_854120787.setPredicate("stay");
    			c_854120787.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_854120787 = Constraints.Strength.newInstance();
    				s_c_854120787.setStrength(StrengthLevel.MEDIUM);
    				s_c_854120787.setWeight(1.0);
    				return s_c_854120787;
    			}));
    			c_854120787.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_912189598 = Constraints.VariableExp.newInstance();
    				c_912189598.setSource(temp);
    				c_912189598.setPropertyName("y");
    				return c_912189598;
    			}));
    			return c_854120787;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1823708219 = Constraints.SimpleConstraint.newInstance();
    			c_1823708219.setPredicate("=");
    			c_1823708219.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_915587187 = Constraints.VariableExp.newInstance();
    				c_915587187.setSource(c);
    				c_915587187.setPropertyName("radius");
    				return c_915587187;
    			}));
    			c_1823708219.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				DoubleExp c_1428396863 = Constraints.DoubleExp.newInstance();
    				c_1428396863.setValue(STATION_RADIUS);
    				return c_1428396863;
    			}));
    			if (c_1823708219.getStrength() == null) {
    				c_1823708219.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_1823708219 = Constraints.Strength.newInstance();
    					s_c_1823708219.setStrength(StrengthLevel.REQUIRED);
    					s_c_1823708219.setWeight(1.0);
    					return s_c_1823708219;
    				}));
    			}
    			return c_1823708219;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1815867190 = Constraints.SimpleConstraint.newInstance();
    			c_1815867190.setPredicate(">=");
    			c_1815867190.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1108977777 = Constraints.VariableExp.newInstance();
    				c_1108977777.setSource(c);
    				c_1108977777.setPropertyName("centerY");
    				return c_1108977777;
    			}));
    			c_1815867190.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_1836535545 = Constraints.BinaryExp.newInstance();
    				c_1836535545.setOperator("+");
    				c_1836535545.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_2068342380 = Constraints.VariableExp.newInstance();
    					c_2068342380.setSource(c);
    					c_2068342380.setPropertyName("radius");
    					return c_2068342380;
    				}));
    				c_1836535545.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    					BinaryExp c_1220394778 = Constraints.BinaryExp.newInstance();
    					c_1220394778.setOperator("/");
    					c_1220394778.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    						DoubleExp c_717578496 = Constraints.DoubleExp.newInstance();
    						c_717578496.setValue(STATION_STROKE_WIDTH);
    						return c_717578496;
    					}));
    					c_1220394778.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    						IntExp c_1895746671 = Constraints.IntExp.newInstance();
    						c_1895746671.setValue(2);
    						return c_1895746671;
    					}));
    					return c_1220394778;
    				}));
    				return c_1836535545;
    			}));
    			if (c_1815867190.getStrength() == null) {
    				c_1815867190.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_1815867190 = Constraints.Strength.newInstance();
    					s_c_1815867190.setStrength(StrengthLevel.REQUIRED);
    					s_c_1815867190.setWeight(1.0);
    					return s_c_1815867190;
    				}));
    			}
    			return c_1815867190;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_740579211 = Constraints.SimpleConstraint.newInstance();
    			c_740579211.setPredicate(">=");
    			c_740579211.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1338047579 = Constraints.VariableExp.newInstance();
    				c_1338047579.setSource(c);
    				c_1338047579.setPropertyName("centerX");
    				return c_1338047579;
    			}));
    			c_740579211.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_2069739653 = Constraints.BinaryExp.newInstance();
    				c_2069739653.setOperator("+");
    				c_2069739653.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_728137143 = Constraints.VariableExp.newInstance();
    					c_728137143.setSource(c);
    					c_728137143.setPropertyName("radius");
    					return c_728137143;
    				}));
    				c_2069739653.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    					BinaryExp c_874698467 = Constraints.BinaryExp.newInstance();
    					c_874698467.setOperator("/");
    					c_874698467.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    						DoubleExp c_253429435 = Constraints.DoubleExp.newInstance();
    						c_253429435.setValue(STATION_STROKE_WIDTH);
    						return c_253429435;
    					}));
    					c_874698467.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    						IntExp c_749837575 = Constraints.IntExp.newInstance();
    						c_749837575.setValue(2);
    						return c_749837575;
    					}));
    					return c_874698467;
    				}));
    				return c_2069739653;
    			}));
    			if (c_740579211.getStrength() == null) {
    				c_740579211.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_740579211 = Constraints.Strength.newInstance();
    					s_c_740579211.setStrength(StrengthLevel.REQUIRED);
    					s_c_740579211.setWeight(1.0);
    					return s_c_740579211;
    				}));
    			}
    			return c_740579211;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_573127199 = Constraints.SimpleConstraint.newInstance();
    			c_573127199.setPredicate("=");
    			c_573127199.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_778757147 = Constraints.VariableExp.newInstance();
    				c_778757147.setSource(txt);
    				c_778757147.setPropertyName("x");
    				return c_778757147;
    			}));
    			c_573127199.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_1989580251 = Constraints.BinaryExp.newInstance();
    				c_1989580251.setOperator("-");
    				c_1989580251.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_921925723 = Constraints.VariableExp.newInstance();
    					c_921925723.setSource(c);
    					c_921925723.setPropertyName("centerX");
    					return c_921925723;
    				}));
    				c_1989580251.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    					BinaryExp c_396358410 = Constraints.BinaryExp.newInstance();
    					c_396358410.setOperator("/");
    					c_396358410.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    						ConstantExp c_968735436 = Constraints.ConstantExp.newInstance();
    						c_968735436.setSource(txt);
    						c_968735436.setPropertyName("width");
    						return c_968735436;
    					}));
    					c_396358410.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    						IntExp c_346106880 = Constraints.IntExp.newInstance();
    						c_346106880.setValue(2);
    						return c_346106880;
    					}));
    					return c_396358410;
    				}));
    				return c_1989580251;
    			}));
    			if (c_573127199.getStrength() == null) {
    				c_573127199.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_573127199 = Constraints.Strength.newInstance();
    					s_c_573127199.setStrength(StrengthLevel.REQUIRED);
    					s_c_573127199.setWeight(1.0);
    					return s_c_573127199;
    				}));
    			}
    			return c_573127199;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_2124280415 = Constraints.SimpleConstraint.newInstance();
    			c_2124280415.setPredicate("=");
    			c_2124280415.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1469739041 = Constraints.VariableExp.newInstance();
    				c_1469739041.setSource(txt);
    				c_1469739041.setPropertyName("y");
    				return c_1469739041;
    			}));
    			c_2124280415.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_1796360790 = Constraints.BinaryExp.newInstance();
    				c_1796360790.setOperator("+");
    				c_1796360790.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableExp c_2121414181 = Constraints.VariableExp.newInstance();
    					c_2121414181.setSource(c);
    					c_2121414181.setPropertyName("centerY");
    					return c_2121414181;
    				}));
    				c_1796360790.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    					IntExp c_1871525118 = Constraints.IntExp.newInstance();
    					c_1871525118.setValue(40);
    					return c_1871525118;
    				}));
    				return c_1796360790;
    			}));
    			if (c_2124280415.getStrength() == null) {
    				c_2124280415.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_2124280415 = Constraints.Strength.newInstance();
    					s_c_2124280415.setStrength(StrengthLevel.REQUIRED);
    					s_c_2124280415.setWeight(1.0);
    					return s_c_2124280415;
    				}));
    			}
    			return c_2124280415;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_2134539381 = Constraints.SimpleConstraint.newInstance();
    			c_2134539381.setPredicate(">=");
    			c_2134539381.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_387833019 = Constraints.VariableExp.newInstance();
    				c_387833019.setSource(temp);
    				c_387833019.setPropertyName("x");
    				return c_387833019;
    			}));
    			c_2134539381.getArguments().add(AbstractRule.wrap((Supplier<DoubleExp>) () -> {
    				DoubleExp c_1856267508 = Constraints.DoubleExp.newInstance();
    				c_1856267508.setValue(0.0);
    				return c_1856267508;
    			}));
    			if (c_2134539381.getStrength() == null) {
    				c_2134539381.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_2134539381 = Constraints.Strength.newInstance();
    					s_c_2134539381.setStrength(StrengthLevel.REQUIRED);
    					s_c_2134539381.setWeight(1.0);
    					return s_c_2134539381;
    				}));
    			}
    			return c_2134539381;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_2142043336 = Constraints.SimpleConstraint.newInstance();
    			c_2142043336.setPredicate(">=");
    			c_2142043336.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_513257456 = Constraints.VariableExp.newInstance();
    				c_513257456.setSource(temp);
    				c_513257456.setPropertyName("y");
    				return c_513257456;
    			}));
    			c_2142043336.getArguments().add(AbstractRule.wrap((Supplier<DoubleExp>) () -> {
    				DoubleExp c_1406794514 = Constraints.DoubleExp.newInstance();
    				c_1406794514.setValue(0.0);
    				return c_1406794514;
    			}));
    			if (c_2142043336.getStrength() == null) {
    				c_2142043336.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_2142043336 = Constraints.Strength.newInstance();
    					s_c_2142043336.setStrength(StrengthLevel.REQUIRED);
    					s_c_2142043336.setWeight(1.0);
    					return s_c_2142043336;
    				}));
    			}
    			return c_2142043336;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_2037836153 = Constraints.SimpleConstraint.newInstance();
    			c_2037836153.setPredicate("<=");
    			c_2037836153.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_165281194 = Constraints.VariableExp.newInstance();
    				c_165281194.setSource(temp);
    				c_165281194.setPropertyName("x");
    				return c_165281194;
    			}));
    			c_2037836153.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableVectorExp c_2144302617 = Constraints.VariableVectorExp.newInstance();
    				c_2144302617.setSource(RailwayMM._area(s).collect((e876435) ->
    					e876435 == null ?
    						null
    					:
    						this.Area(
    							e876435
    						)
    				).collect((e876435) ->
    					e876435 == null ?
    						null
    					:
    						e876435.rect
    				));
    				c_2144302617.setPropertyName("width");
    				return c_2144302617;
    			}));
    			if (c_2037836153.getStrength() == null) {
    				c_2037836153.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_2037836153 = Constraints.Strength.newInstance();
    					s_c_2037836153.setStrength(StrengthLevel.REQUIRED);
    					s_c_2037836153.setWeight(1.0);
    					return s_c_2037836153;
    				}));
    			}
    			return c_2037836153;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_333882530 = Constraints.SimpleConstraint.newInstance();
    			c_333882530.setPredicate("<=");
    			c_333882530.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1506607910 = Constraints.VariableExp.newInstance();
    				c_1506607910.setSource(temp);
    				c_1506607910.setPropertyName("y");
    				return c_1506607910;
    			}));
    			c_333882530.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableVectorExp c_1432472648 = Constraints.VariableVectorExp.newInstance();
    				c_1432472648.setSource(RailwayMM._area(s).collect((e876435) ->
    					e876435 == null ?
    						null
    					:
    						this.Area(
    							e876435
    						)
    				).collect((e876435) ->
    					e876435 == null ?
    						null
    					:
    						e876435.rect
    				));
    				c_1432472648.setPropertyName("height");
    				return c_1432472648;
    			}));
    			if (c_333882530.getStrength() == null) {
    				c_333882530.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_333882530 = Constraints.Strength.newInstance();
    					s_c_333882530.setStrength(StrengthLevel.REQUIRED);
    					s_c_333882530.setWeight(1.0);
    					return s_c_333882530;
    				}));
    			}
    			return c_333882530;
    		}));
    	}
    });
  
  public final TupleRule<railway2jfx.SourceTupleLine, railway2jfx.TargetTupleLine> Line = 	new TupleRule<railway2jfx.SourceTupleLine, railway2jfx.TargetTupleLine>(
    	SourceTupleLine.class,
    	TargetTupleLine.class,
    	(in, out) -> {
    		Line s = in.s;
    		JFX.Figure t = out.t;
    		Polyline pl = out.pl;
    		Text txt = out.txt;
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#75:4-76:11
    	TupleRule.operator_spaceship(JFXMM._nodes(t),
    		AOFFactory.INSTANCE.createSequence(
    			pl,
    			txt
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#77:4-77:27
    	TupleRule.operator_spaceship(JFXMM._children(t),
    		AOFFactory.INSTANCE.createSequence(
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#78:4-78:29
    	TupleRule.operator_spaceship(JFXMM._constraints(t),
    		AOFFactory.INSTANCE.createSequence(
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#81:4-81:21
    	TupleRule.operator_spaceship(JFXMM.__stroke.apply(pl),
    		RailwayMM._color(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#82:4-82:23
    	pl.setStrokeWidth(
    		10.0
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#83:4-83:28
    	JFXMM.__strokeLineJoin.apply(pl).add(
    		"ROUND"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#84:4-84:23
    	JFXMM.__fill.apply(pl).add(
    		"0xffffff00"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#85:4-85:75
    	TupleRule.operator_spaceship(JFXMM._points(pl),
    		RailwayMM._stations(s).collectMutable((e_1) ->
    			e_1 == null ?
    				AbstractRule.emptySequence()
    			:
    				AOFFactory.INSTANCE.createSequence(
    					RailwayMM._posX(e_1),
    					RailwayMM._posY(e_1)
    				)
    		).collectMutable((e876435) ->
    			e876435 == null ?
    				AbstractRule.emptySequence()
    			:
    				e876435
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#88:4-88:20
    	JFXMM.__editable.apply(txt).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#89:4-89:19
    	JFXMM.__movable.apply(txt).add(
    		true
    	);
    });
  
  public final TupleRule<railway2jfx.SourceTupleMetroMap, railway2jfx.TargetTupleMetroMap> MetroMap = 	new TupleRule<railway2jfx.SourceTupleMetroMap, railway2jfx.TargetTupleMetroMap>(
    	SourceTupleMetroMap.class,
    	TargetTupleMetroMap.class,
    	(in, out) -> {
    		MetroMap s = in.s;
    		JFX.Figure t = out.t;
    		Rectangle rect = out.rect;
    		ConstraintGroup constraints = out.constraints;
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#98:3-110:7
    	TupleRule.operator_spaceship(JFXMM._children(t),
    		RailwayMM._areas(s).collect((e_2) ->
    			e_2 == null ?
    				null
    			:
    				this.Area(
    					e_2
    				).t
    		).concat(
    			RailwayMM._lines(s).collect((e_3) ->
    				e_3 == null ?
    					null
    				:
    					this.Line(
    						e_3
    					).t
    			)
    		).concat(
    			RailwayMM._stations(s).collect((e_4) ->
    				e_4 == null ?
    					null
    				:
    					this.Station(
    						e_4
    					).t
    			)
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#111:3-111:39
    	TupleRule.operator_spaceship(JFXMM._constraints(t),
    		AOFFactory.INSTANCE.createSequence(
    			constraints
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#115:4-115:25
    	constraints.setSolver(
    		"cassowary"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#116:4-123:5
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1085889621 = Constraints.SimpleConstraint.newInstance();
    			c_1085889621.setPredicate(".<=");
    			c_1085889621.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_1890404985 = Constraints.BinaryExp.newInstance();
    				c_1890404985.setOperator(".+");
    				c_1890404985.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableVectorExp c_2075185766 = Constraints.VariableVectorExp.newInstance();
    					c_2075185766.setSource(RailwayMM._stations(s).collect((e_5) ->
    						e_5 == null ?
    							null
    						:
    							this.Station(
    								e_5
    							)
    					).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							e876435.c
    					));
    					c_2075185766.setPropertyName("centerY");
    					return c_2075185766;
    				}));
    				c_1890404985.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    					BinaryExp c_1871045046 = Constraints.BinaryExp.newInstance();
    					c_1871045046.setOperator("+");
    					c_1871045046.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    						DoubleExp c_2109104053 = Constraints.DoubleExp.newInstance();
    						c_2109104053.setValue(STATION_RADIUS);
    						return c_2109104053;
    					}));
    					c_1871045046.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    						BinaryExp c_2067900638 = Constraints.BinaryExp.newInstance();
    						c_2067900638.setOperator("/");
    						c_2067900638.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    							DoubleExp c_1211818414 = Constraints.DoubleExp.newInstance();
    							c_1211818414.setValue(STATION_STROKE_WIDTH);
    							return c_1211818414;
    						}));
    						c_2067900638.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    							IntExp c_885326340 = Constraints.IntExp.newInstance();
    							c_885326340.setValue(2);
    							return c_885326340;
    						}));
    						return c_2067900638;
    					}));
    					return c_1871045046;
    				}));
    				return c_1890404985;
    			}));
    			c_1085889621.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				ConstantExp c_1516059621 = Constraints.ConstantExp.newInstance();
    				c_1516059621.setSource(rect);
    				c_1516059621.setPropertyName("height");
    				return c_1516059621;
    			}));
    			if (c_1085889621.getStrength() == null) {
    				c_1085889621.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_1085889621 = Constraints.Strength.newInstance();
    					s_c_1085889621.setStrength(StrengthLevel.REQUIRED);
    					s_c_1085889621.setWeight(1.0);
    					return s_c_1085889621;
    				}));
    			}
    			return c_1085889621;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_869998651 = Constraints.SimpleConstraint.newInstance();
    			c_869998651.setPredicate(".<=");
    			c_869998651.getArguments().add(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    				BinaryExp c_2050190295 = Constraints.BinaryExp.newInstance();
    				c_2050190295.setOperator(".+");
    				c_2050190295.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    					VariableVectorExp c_1223861613 = Constraints.VariableVectorExp.newInstance();
    					c_1223861613.setSource(RailwayMM._stations(s).collect((e_6) ->
    						e_6 == null ?
    							null
    						:
    							this.Station(
    								e_6
    							)
    					).collect((e876435) ->
    						e876435 == null ?
    							null
    						:
    							e876435.c
    					));
    					c_1223861613.setPropertyName("centerX");
    					return c_1223861613;
    				}));
    				c_2050190295.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    					BinaryExp c_1187961613 = Constraints.BinaryExp.newInstance();
    					c_1187961613.setOperator("+");
    					c_1187961613.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    						DoubleExp c_1433414577 = Constraints.DoubleExp.newInstance();
    						c_1433414577.setValue(STATION_RADIUS);
    						return c_1433414577;
    					}));
    					c_1187961613.setRight(AbstractRule.wrap((Supplier<BinaryExp>) () -> {
    						BinaryExp c_125519950 = Constraints.BinaryExp.newInstance();
    						c_125519950.setOperator("/");
    						c_125519950.setLeft(AbstractRule.wrap((Supplier<ArExp>) () -> {
    							DoubleExp c_1234090474 = Constraints.DoubleExp.newInstance();
    							c_1234090474.setValue(STATION_STROKE_WIDTH);
    							return c_1234090474;
    						}));
    						c_125519950.setRight(AbstractRule.wrap((Supplier<IntExp>) () -> {
    							IntExp c_1401080876 = Constraints.IntExp.newInstance();
    							c_1401080876.setValue(2);
    							return c_1401080876;
    						}));
    						return c_125519950;
    					}));
    					return c_1187961613;
    				}));
    				return c_2050190295;
    			}));
    			c_869998651.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				ConstantExp c_1381467253 = Constraints.ConstantExp.newInstance();
    				c_1381467253.setSource(rect);
    				c_1381467253.setPropertyName("width");
    				return c_1381467253;
    			}));
    			if (c_869998651.getStrength() == null) {
    				c_869998651.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_869998651 = Constraints.Strength.newInstance();
    					s_c_869998651.setStrength(StrengthLevel.REQUIRED);
    					s_c_869998651.setWeight(1.0);
    					return s_c_869998651;
    				}));
    			}
    			return c_869998651;
    		}));
    	}
    });
  
  public final TupleRule<railway2jfx.SourceTupleArea, railway2jfx.TargetTupleArea> Area = 	new TupleRule<railway2jfx.SourceTupleArea, railway2jfx.TargetTupleArea>(
    	SourceTupleArea.class,
    	TargetTupleArea.class,
    	(in, out) -> {
    		Area s = in.s;
    		JFX.Figure t = out.t;
    		Rectangle rect = out.rect;
    		Text txt = out.txt;
    		ConstraintGroup constraints = out.constraints;
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#133:4-134:11
    	TupleRule.operator_spaceship(JFXMM._nodes(t),
    		AOFFactory.INSTANCE.createSequence(
    			rect,
    			txt
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#135:4-135:26
    	TupleRule.operator_spaceship(JFXMM._children(t),
    		AOFFactory.INSTANCE.createSequence(
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#136:4-136:40
    	TupleRule.operator_spaceship(JFXMM._constraints(t),
    		AOFFactory.INSTANCE.createSequence(
    			constraints
    		)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#139:4-139:14
    	TupleRule.operator_spaceship(JFXMM._x(rect),
    		RailwayMM._posX(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#140:4-140:14
    	TupleRule.operator_spaceship(JFXMM._y(rect),
    		RailwayMM._posY(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#141:4-141:18
    	TupleRule.operator_spaceship(JFXMM.__fill.apply(rect),
    		RailwayMM._color(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#142:4-142:19
    	TupleRule.operator_spaceship(JFXMM._width(rect),
    		RailwayMM._width(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#143:4-143:22
    	TupleRule.operator_spaceship(JFXMM._height(rect),
    		RailwayMM._height(s)
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#144:4-144:19
    	JFXMM.__movable.apply(rect).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#145:4-145:18
    	rect.setOpacity(
    		0.5
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#151:4-151:20
    	JFXMM.__editable.apply(txt).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#152:4-152:19
    	JFXMM.__movable.apply(txt).add(
    		true
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#155:4-155:25
    	constraints.setSolver(
    		"cassowary"
    	);
    	// src/eseo/idm/railway2jfx/railway2jfx.atl#156:4-174:7
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1980405531 = Constraints.SimpleConstraint.newInstance();
    			c_1980405531.setPredicate(">=");
    			c_1980405531.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1447825703 = Constraints.VariableExp.newInstance();
    				c_1447825703.setSource(rect);
    				c_1447825703.setPropertyName("width");
    				return c_1447825703;
    			}));
    			c_1980405531.getArguments().add(AbstractRule.wrap((Supplier<IntExp>) () -> {
    				IntExp c_1333023506 = Constraints.IntExp.newInstance();
    				c_1333023506.setValue(50);
    				return c_1333023506;
    			}));
    			if (c_1980405531.getStrength() == null) {
    				c_1980405531.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_1980405531 = Constraints.Strength.newInstance();
    					s_c_1980405531.setStrength(StrengthLevel.REQUIRED);
    					s_c_1980405531.setWeight(1.0);
    					return s_c_1980405531;
    				}));
    			}
    			return c_1980405531;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_590521468 = Constraints.SimpleConstraint.newInstance();
    			c_590521468.setPredicate(">=");
    			c_590521468.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1814260569 = Constraints.VariableExp.newInstance();
    				c_1814260569.setSource(rect);
    				c_1814260569.setPropertyName("height");
    				return c_1814260569;
    			}));
    			c_590521468.getArguments().add(AbstractRule.wrap((Supplier<IntExp>) () -> {
    				IntExp c_19028236 = Constraints.IntExp.newInstance();
    				c_19028236.setValue(50);
    				return c_19028236;
    			}));
    			if (c_590521468.getStrength() == null) {
    				c_590521468.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    					Strength s_c_590521468 = Constraints.Strength.newInstance();
    					s_c_590521468.setStrength(StrengthLevel.REQUIRED);
    					s_c_590521468.setWeight(1.0);
    					return s_c_590521468;
    				}));
    			}
    			return c_590521468;
    		}));
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_904504126 = Constraints.SimpleConstraint.newInstance();
    			c_904504126.setPredicate("suggest");
    			c_904504126.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_904504126 = Constraints.Strength.newInstance();
    				s_c_904504126.setStrength(StrengthLevel.WEAK);
    				s_c_904504126.setWeight(1.0);
    				return s_c_904504126;
    			}));
    			c_904504126.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_173158690 = Constraints.VariableExp.newInstance();
    				c_173158690.setSource(rect);
    				c_173158690.setPropertyName("x");
    				return c_173158690;
    			}));
    			c_904504126.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_797750608 = Constraints.VariableExp.newInstance();
    				c_797750608.setSource(s);
    				c_797750608.setPropertyName("posX");
    				return c_797750608;
    			}));
    			return c_904504126;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1040931038 = Constraints.SimpleConstraint.newInstance();
    			c_1040931038.setPredicate("suggest");
    			c_1040931038.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_1040931038 = Constraints.Strength.newInstance();
    				s_c_1040931038.setStrength(StrengthLevel.WEAK);
    				s_c_1040931038.setWeight(1.0);
    				return s_c_1040931038;
    			}));
    			c_1040931038.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1759408131 = Constraints.VariableExp.newInstance();
    				c_1759408131.setSource(rect);
    				c_1759408131.setPropertyName("y");
    				return c_1759408131;
    			}));
    			c_1040931038.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1522194774 = Constraints.VariableExp.newInstance();
    				c_1522194774.setSource(s);
    				c_1522194774.setPropertyName("posY");
    				return c_1522194774;
    			}));
    			return c_1040931038;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_2087409632 = Constraints.SimpleConstraint.newInstance();
    			c_2087409632.setPredicate("stay");
    			c_2087409632.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_2087409632 = Constraints.Strength.newInstance();
    				s_c_2087409632.setStrength(StrengthLevel.STRONG);
    				s_c_2087409632.setWeight(1.0);
    				return s_c_2087409632;
    			}));
    			c_2087409632.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_339622454 = Constraints.VariableExp.newInstance();
    				c_339622454.setSource(rect);
    				c_339622454.setPropertyName("x");
    				return c_339622454;
    			}));
    			return c_2087409632;
    		})
    		);
    	}
    	{
    		constraints.getConstraints().add(AbstractRule.wrap((Supplier<SimpleConstraint>) () -> {
    			SimpleConstraint c_1611102587 = Constraints.SimpleConstraint.newInstance();
    			c_1611102587.setPredicate("stay");
    			c_1611102587.setStrength(AbstractRule.wrap((Supplier<Strength>) () -> {
    				Strength s_c_1611102587 = Constraints.Strength.newInstance();
    				s_c_1611102587.setStrength(StrengthLevel.STRONG);
    				s_c_1611102587.setWeight(1.0);
    				return s_c_1611102587;
    			}));
    			c_1611102587.getArguments().add(AbstractRule.wrap((Supplier<ArExp>) () -> {
    				VariableExp c_1337127979 = Constraints.VariableExp.newInstance();
    				c_1337127979.setSource(rect);
    				c_1337127979.setPropertyName("y");
    				return c_1337127979;
    			}));
    			return c_1611102587;
    		})
    		);
    	}
    });
}
