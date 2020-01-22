/**
 */
package eseo.idm.railway;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eseo.idm.railway.RailwayFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='eseo.idm'"
 * @generated
 */
public interface RailwayPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railway";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eseo.idm.railway";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railway";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailwayPackage eINSTANCE = eseo.idm.railway.impl.RailwayPackageImpl.init();

	/**
	 * The meta object id for the '{@link eseo.idm.railway.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eseo.idm.railway.impl.StationImpl
	 * @see eseo.idm.railway.impl.RailwayPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 0;

	/**
	 * The feature id for the '<em><b>Id Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID_STATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__POS_X = 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__POS_Y = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LINES = 5;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__AREA = 6;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eseo.idm.railway.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eseo.idm.railway.impl.LineImpl
	 * @see eseo.idm.railway.impl.RailwayPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 1;

	/**
	 * The feature id for the '<em><b>Id Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID_LINE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STATIONS = 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eseo.idm.railway.impl.MetroMapImpl <em>Metro Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eseo.idm.railway.impl.MetroMapImpl
	 * @see eseo.idm.railway.impl.RailwayPackageImpl#getMetroMap()
	 * @generated
	 */
	int METRO_MAP = 2;

	/**
	 * The feature id for the '<em><b>Id Current Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP__ID_CURRENT_LINE = 0;

	/**
	 * The feature id for the '<em><b>Id Current Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP__ID_CURRENT_AREA = 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP__LINES = 2;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP__STATIONS = 3;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP__AREAS = 4;

	/**
	 * The number of structural features of the '<em>Metro Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Metro Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eseo.idm.railway.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eseo.idm.railway.impl.AreaImpl
	 * @see eseo.idm.railway.impl.RailwayPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 3;

	/**
	 * The feature id for the '<em><b>Id Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID_AREA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__POS_X = 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__POS_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__STATIONS = 7;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eseo.idm.railway.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see eseo.idm.railway.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Station#getIdStation <em>Id Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Station</em>'.
	 * @see eseo.idm.railway.Station#getIdStation()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_IdStation();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eseo.idm.railway.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Station#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see eseo.idm.railway.Station#getPosX()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_PosX();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Station#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see eseo.idm.railway.Station#getPosY()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_PosY();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Station#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eseo.idm.railway.Station#getColor()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Color();

	/**
	 * Returns the meta object for the reference list '{@link eseo.idm.railway.Station#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see eseo.idm.railway.Station#getLines()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Lines();

	/**
	 * Returns the meta object for the reference '{@link eseo.idm.railway.Station#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see eseo.idm.railway.Station#getArea()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Area();

	/**
	 * Returns the meta object for class '{@link eseo.idm.railway.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see eseo.idm.railway.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Line#getIdLine <em>Id Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Line</em>'.
	 * @see eseo.idm.railway.Line#getIdLine()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_IdLine();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Line#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eseo.idm.railway.Line#getColor()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Color();

	/**
	 * Returns the meta object for the reference list '{@link eseo.idm.railway.Line#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see eseo.idm.railway.Line#getStations()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Stations();

	/**
	 * Returns the meta object for class '{@link eseo.idm.railway.MetroMap <em>Metro Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metro Map</em>'.
	 * @see eseo.idm.railway.MetroMap
	 * @generated
	 */
	EClass getMetroMap();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.MetroMap#getIdCurrentLine <em>Id Current Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Current Line</em>'.
	 * @see eseo.idm.railway.MetroMap#getIdCurrentLine()
	 * @see #getMetroMap()
	 * @generated
	 */
	EAttribute getMetroMap_IdCurrentLine();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.MetroMap#getIdCurrentArea <em>Id Current Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Current Area</em>'.
	 * @see eseo.idm.railway.MetroMap#getIdCurrentArea()
	 * @see #getMetroMap()
	 * @generated
	 */
	EAttribute getMetroMap_IdCurrentArea();

	/**
	 * Returns the meta object for the containment reference list '{@link eseo.idm.railway.MetroMap#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see eseo.idm.railway.MetroMap#getLines()
	 * @see #getMetroMap()
	 * @generated
	 */
	EReference getMetroMap_Lines();

	/**
	 * Returns the meta object for the containment reference list '{@link eseo.idm.railway.MetroMap#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see eseo.idm.railway.MetroMap#getStations()
	 * @see #getMetroMap()
	 * @generated
	 */
	EReference getMetroMap_Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link eseo.idm.railway.MetroMap#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see eseo.idm.railway.MetroMap#getAreas()
	 * @see #getMetroMap()
	 * @generated
	 */
	EReference getMetroMap_Areas();

	/**
	 * Returns the meta object for class '{@link eseo.idm.railway.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see eseo.idm.railway.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getIdArea <em>Id Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Area</em>'.
	 * @see eseo.idm.railway.Area#getIdArea()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_IdArea();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eseo.idm.railway.Area#getName()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Name();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eseo.idm.railway.Area#getColor()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Color();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see eseo.idm.railway.Area#getPosX()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_PosX();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see eseo.idm.railway.Area#getPosY()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_PosY();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eseo.idm.railway.Area#getWidth()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Width();

	/**
	 * Returns the meta object for the attribute '{@link eseo.idm.railway.Area#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see eseo.idm.railway.Area#getHeight()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Height();

	/**
	 * Returns the meta object for the reference list '{@link eseo.idm.railway.Area#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see eseo.idm.railway.Area#getStations()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Stations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailwayFactory getRailwayFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eseo.idm.railway.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eseo.idm.railway.impl.StationImpl
		 * @see eseo.idm.railway.impl.RailwayPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Id Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__ID_STATION = eINSTANCE.getStation_IdStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__POS_X = eINSTANCE.getStation_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__POS_Y = eINSTANCE.getStation_PosY();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__COLOR = eINSTANCE.getStation_Color();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__LINES = eINSTANCE.getStation_Lines();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__AREA = eINSTANCE.getStation_Area();

		/**
		 * The meta object literal for the '{@link eseo.idm.railway.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eseo.idm.railway.impl.LineImpl
		 * @see eseo.idm.railway.impl.RailwayPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Id Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ID_LINE = eINSTANCE.getLine_IdLine();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__COLOR = eINSTANCE.getLine_Color();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__STATIONS = eINSTANCE.getLine_Stations();

		/**
		 * The meta object literal for the '{@link eseo.idm.railway.impl.MetroMapImpl <em>Metro Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eseo.idm.railway.impl.MetroMapImpl
		 * @see eseo.idm.railway.impl.RailwayPackageImpl#getMetroMap()
		 * @generated
		 */
		EClass METRO_MAP = eINSTANCE.getMetroMap();

		/**
		 * The meta object literal for the '<em><b>Id Current Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_MAP__ID_CURRENT_LINE = eINSTANCE.getMetroMap_IdCurrentLine();

		/**
		 * The meta object literal for the '<em><b>Id Current Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_MAP__ID_CURRENT_AREA = eINSTANCE.getMetroMap_IdCurrentArea();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_MAP__LINES = eINSTANCE.getMetroMap_Lines();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_MAP__STATIONS = eINSTANCE.getMetroMap_Stations();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_MAP__AREAS = eINSTANCE.getMetroMap_Areas();

		/**
		 * The meta object literal for the '{@link eseo.idm.railway.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eseo.idm.railway.impl.AreaImpl
		 * @see eseo.idm.railway.impl.RailwayPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Id Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__ID_AREA = eINSTANCE.getArea_IdArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__NAME = eINSTANCE.getArea_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__COLOR = eINSTANCE.getArea_Color();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__POS_X = eINSTANCE.getArea_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__POS_Y = eINSTANCE.getArea_PosY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__WIDTH = eINSTANCE.getArea_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__HEIGHT = eINSTANCE.getArea_Height();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__STATIONS = eINSTANCE.getArea_Stations();

	}

} //RailwayPackage
