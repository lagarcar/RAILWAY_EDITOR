/**
 */
package eseo.idm.railway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.Line#getIdLine <em>Id Line</em>}</li>
 *   <li>{@link eseo.idm.railway.Line#getColor <em>Color</em>}</li>
 *   <li>{@link eseo.idm.railway.Line#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see eseo.idm.railway.RailwayPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Line</em>' attribute.
	 * @see #setIdLine(int)
	 * @see eseo.idm.railway.RailwayPackage#getLine_IdLine()
	 * @model unique="false"
	 * @generated
	 */
	int getIdLine();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Line#getIdLine <em>Id Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Line</em>' attribute.
	 * @see #getIdLine()
	 * @generated
	 */
	void setIdLine(int value);

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
	 * @see eseo.idm.railway.RailwayPackage#getLine_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Line#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link eseo.idm.railway.Station}.
	 * It is bidirectional and its opposite is '{@link eseo.idm.railway.Station#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see eseo.idm.railway.RailwayPackage#getLine_Stations()
	 * @see eseo.idm.railway.Station#getLines
	 * @model opposite="lines"
	 * @generated
	 */
	EList<Station> getStations();

} // Line
