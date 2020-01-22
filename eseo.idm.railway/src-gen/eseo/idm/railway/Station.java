/**
 */
package eseo.idm.railway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.Station#getIdStation <em>Id Station</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getName <em>Name</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getPosX <em>Pos X</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getColor <em>Color</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getLines <em>Lines</em>}</li>
 *   <li>{@link eseo.idm.railway.Station#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see eseo.idm.railway.RailwayPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Station</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Station</em>' attribute.
	 * @see #setIdStation(String)
	 * @see eseo.idm.railway.RailwayPackage#getStation_IdStation()
	 * @model unique="false"
	 * @generated
	 */
	String getIdStation();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getIdStation <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Station</em>' attribute.
	 * @see #getIdStation()
	 * @generated
	 */
	void setIdStation(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eseo.idm.railway.RailwayPackage#getStation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(double)
	 * @see eseo.idm.railway.RailwayPackage#getStation_PosX()
	 * @model unique="false"
	 * @generated
	 */
	double getPosX();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(double value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(double)
	 * @see eseo.idm.railway.RailwayPackage#getStation_PosY()
	 * @model unique="false"
	 * @generated
	 */
	double getPosY();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see eseo.idm.railway.RailwayPackage#getStation_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link eseo.idm.railway.Line}.
	 * It is bidirectional and its opposite is '{@link eseo.idm.railway.Line#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see eseo.idm.railway.RailwayPackage#getStation_Lines()
	 * @see eseo.idm.railway.Line#getStations
	 * @model opposite="stations"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eseo.idm.railway.Area#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(Area)
	 * @see eseo.idm.railway.RailwayPackage#getStation_Area()
	 * @see eseo.idm.railway.Area#getStations
	 * @model opposite="stations"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Station#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

} // Station
