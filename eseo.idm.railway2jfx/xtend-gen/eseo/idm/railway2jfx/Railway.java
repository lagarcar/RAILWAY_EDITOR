package eseo.idm.railway2jfx;

import eseo.idm.railway.Area;
import eseo.idm.railway.Line;
import eseo.idm.railway.MetroMap;
import eseo.idm.railway.RailwayPackage;
import eseo.idm.railway.Station;
import fr.eseo.aof.xtend.utils.AOFAccessors;
import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.IMetaClass;

@AOFAccessors(RailwayPackage.class)
@SuppressWarnings("all")
public class Railway {
  public static IMetaClass<Station> Station = org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.getMetaClass(eseo.idm.railway.RailwayPackage.eINSTANCE.getStation());
  
  public IBox<String> _idStation(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_IdStation());
  }
  
  public IBox<String> idStation(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_IdStation());
  }
  
  public IBox<String> _name(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Name());
  }
  
  public IBox<String> name(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Name());
  }
  
  public IBox<Double> _posX(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_PosX());
  }
  
  public IBox<Double> posX(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_PosX());
  }
  
  public IBox<Double> _posY(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_PosY());
  }
  
  public IBox<Double> posY(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_PosY());
  }
  
  public IBox<String> _color(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Color());
  }
  
  public IBox<String> color(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Color());
  }
  
  public IBox<Line> _lines(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Lines());
  }
  
  public IBox<Line> lines(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Lines());
  }
  
  public IBox<Area> _area(final Station o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Area());
  }
  
  public IBox<Area> area(final IBox<? extends Station> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getStation(), eseo.idm.railway.RailwayPackage.eINSTANCE.getStation_Area());
  }
  
  public static IMetaClass<Line> Line = org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.getMetaClass(eseo.idm.railway.RailwayPackage.eINSTANCE.getLine());
  
  public IBox<Integer> _idLine(final Line o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_IdLine());
  }
  
  public IBox<Integer> idLine(final IBox<? extends Line> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine(), eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_IdLine());
  }
  
  public IBox<String> _color(final Line o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_Color());
  }
  
  public IBox<String> color1(final IBox<? extends Line> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine(), eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_Color());
  }
  
  public IBox<Station> _stations(final Line o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_Stations());
  }
  
  public IBox<Station> stations(final IBox<? extends Line> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getLine(), eseo.idm.railway.RailwayPackage.eINSTANCE.getLine_Stations());
  }
  
  public static IMetaClass<MetroMap> MetroMap = org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.getMetaClass(eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap());
  
  public IBox<Integer> _idCurrentLine(final MetroMap o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_IdCurrentLine());
  }
  
  public IBox<Integer> idCurrentLine(final IBox<? extends MetroMap> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap(), eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_IdCurrentLine());
  }
  
  public IBox<Integer> _idCurrentArea(final MetroMap o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_IdCurrentArea());
  }
  
  public IBox<Integer> idCurrentArea(final IBox<? extends MetroMap> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap(), eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_IdCurrentArea());
  }
  
  public IBox<Line> _lines(final MetroMap o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Lines());
  }
  
  public IBox<Line> lines1(final IBox<? extends MetroMap> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap(), eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Lines());
  }
  
  public IBox<Station> _stations(final MetroMap o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Stations());
  }
  
  public IBox<Station> stations1(final IBox<? extends MetroMap> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap(), eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Stations());
  }
  
  public IBox<Area> _areas(final MetroMap o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Areas());
  }
  
  public IBox<Area> areas(final IBox<? extends MetroMap> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap(), eseo.idm.railway.RailwayPackage.eINSTANCE.getMetroMap_Areas());
  }
  
  public static IMetaClass<Area> Area = org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.getMetaClass(eseo.idm.railway.RailwayPackage.eINSTANCE.getArea());
  
  public IBox<Integer> _idArea(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_IdArea());
  }
  
  public IBox<Integer> idArea(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_IdArea());
  }
  
  public IBox<String> _name(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Name());
  }
  
  public IBox<String> name1(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Name());
  }
  
  public IBox<String> _color(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Color());
  }
  
  public IBox<String> color2(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Color());
  }
  
  public IBox<Double> _posX(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_PosX());
  }
  
  public IBox<Double> posX1(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_PosX());
  }
  
  public IBox<Double> _posY(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_PosY());
  }
  
  public IBox<Double> posY1(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_PosY());
  }
  
  public IBox<Double> _width(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Width());
  }
  
  public IBox<Double> width(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Width());
  }
  
  public IBox<Double> _height(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Height());
  }
  
  public IBox<Double> height(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Height());
  }
  
  public IBox<Station> _stations(final Area o) {
    return org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE.createPropertyBox(o, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Stations());
  }
  
  public IBox<Station> stations2(final IBox<? extends Area> b) {
    return b.collectMutable(org.eclipse.papyrus.aof.emf.EMFFactory.INSTANCE, eseo.idm.railway.RailwayPackage.eINSTANCE.getArea(), eseo.idm.railway.RailwayPackage.eINSTANCE.getArea_Stations());
  }
}
