/**
 */
package eseo.idm.railway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metro Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.MetroMap#getIdCurrentLine <em>Id Current Line</em>}</li>
 *   <li>{@link eseo.idm.railway.MetroMap#getIdCurrentArea <em>Id Current Area</em>}</li>
 *   <li>{@link eseo.idm.railway.MetroMap#getLines <em>Lines</em>}</li>
 *   <li>{@link eseo.idm.railway.MetroMap#getStations <em>Stations</em>}</li>
 *   <li>{@link eseo.idm.railway.MetroMap#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @see eseo.idm.railway.RailwayPackage#getMetroMap()
 * @model
 * @generated
 */
public interface MetroMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Current Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Current Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Current Line</em>' attribute.
	 * @see #setIdCurrentLine(int)
	 * @see eseo.idm.railway.RailwayPackage#getMetroMap_IdCurrentLine()
	 * @model unique="false"
	 * @generated
	 */
	int getIdCurrentLine();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.MetroMap#getIdCurrentLine <em>Id Current Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Current Line</em>' attribute.
	 * @see #getIdCurrentLine()
	 * @generated
	 */
	void setIdCurrentLine(int value);

	/**
	 * Returns the value of the '<em><b>Id Current Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Current Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Current Area</em>' attribute.
	 * @see #setIdCurrentArea(int)
	 * @see eseo.idm.railway.RailwayPackage#getMetroMap_IdCurrentArea()
	 * @model unique="false"
	 * @generated
	 */
	int getIdCurrentArea();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.MetroMap#getIdCurrentArea <em>Id Current Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Current Area</em>' attribute.
	 * @see #getIdCurrentArea()
	 * @generated
	 */
	void setIdCurrentArea(int value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link eseo.idm.railway.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see eseo.idm.railway.RailwayPackage#getMetroMap_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link eseo.idm.railway.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see eseo.idm.railway.RailwayPackage#getMetroMap_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link eseo.idm.railway.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see eseo.idm.railway.RailwayPackage#getMetroMap_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

} // MetroMap
