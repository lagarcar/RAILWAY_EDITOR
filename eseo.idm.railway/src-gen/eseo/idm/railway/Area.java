/**
 */
package eseo.idm.railway;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.Area#getIdArea <em>Id Area</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getName <em>Name</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getColor <em>Color</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getPosX <em>Pos X</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getWidth <em>Width</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getHeight <em>Height</em>}</li>
 *   <li>{@link eseo.idm.railway.Area#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see eseo.idm.railway.RailwayPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Area</em>' attribute.
	 * @see #setIdArea(int)
	 * @see eseo.idm.railway.RailwayPackage#getArea_IdArea()
	 * @model unique="false"
	 * @generated
	 */
	int getIdArea();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getIdArea <em>Id Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Area</em>' attribute.
	 * @see #getIdArea()
	 * @generated
	 */
	void setIdArea(int value);

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
	 * @see eseo.idm.railway.RailwayPackage#getArea_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eseo.idm.railway.RailwayPackage#getArea_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

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
	 * @see eseo.idm.railway.RailwayPackage#getArea_PosX()
	 * @model unique="false"
	 * @generated
	 */
	double getPosX();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getPosX <em>Pos X</em>}' attribute.
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
	 * @see eseo.idm.railway.RailwayPackage#getArea_PosY()
	 * @model unique="false"
	 * @generated
	 */
	double getPosY();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see eseo.idm.railway.RailwayPackage#getArea_Width()
	 * @model unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see eseo.idm.railway.RailwayPackage#getArea_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link eseo.idm.railway.Area#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link eseo.idm.railway.Station}.
	 * It is bidirectional and its opposite is '{@link eseo.idm.railway.Station#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see eseo.idm.railway.RailwayPackage#getArea_Stations()
	 * @see eseo.idm.railway.Station#getArea
	 * @model opposite="area"
	 * @generated
	 */
	EList<Station> getStations();

} // Area
