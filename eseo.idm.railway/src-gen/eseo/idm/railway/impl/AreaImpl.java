/**
 */
package eseo.idm.railway.impl;

import eseo.idm.railway.Area;
import eseo.idm.railway.RailwayPackage;
import eseo.idm.railway.Station;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getIdArea <em>Id Area</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getColor <em>Color</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.AreaImpl#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends MinimalEObjectImpl.Container implements Area {
	/**
	 * The default value of the '{@link #getIdArea() <em>Id Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdArea()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_AREA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdArea() <em>Id Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdArea()
	 * @generated
	 * @ordered
	 */
	protected int idArea = ID_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected double posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected double posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdArea() {
		return idArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdArea(int newIdArea) {
		int oldIdArea = idArea;
		idArea = newIdArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__ID_AREA, oldIdArea, idArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosX(double newPosX) {
		double oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosY(double newPosY) {
		double oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.AREA__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectWithInverseResolvingEList<Station>(Station.class, this, RailwayPackage.AREA__STATIONS, RailwayPackage.STATION__AREA);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailwayPackage.AREA__STATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailwayPackage.AREA__STATIONS:
				return ((InternalEList<?>)getStations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailwayPackage.AREA__ID_AREA:
				return getIdArea();
			case RailwayPackage.AREA__NAME:
				return getName();
			case RailwayPackage.AREA__COLOR:
				return getColor();
			case RailwayPackage.AREA__POS_X:
				return getPosX();
			case RailwayPackage.AREA__POS_Y:
				return getPosY();
			case RailwayPackage.AREA__WIDTH:
				return getWidth();
			case RailwayPackage.AREA__HEIGHT:
				return getHeight();
			case RailwayPackage.AREA__STATIONS:
				return getStations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailwayPackage.AREA__ID_AREA:
				setIdArea((Integer)newValue);
				return;
			case RailwayPackage.AREA__NAME:
				setName((String)newValue);
				return;
			case RailwayPackage.AREA__COLOR:
				setColor((String)newValue);
				return;
			case RailwayPackage.AREA__POS_X:
				setPosX((Double)newValue);
				return;
			case RailwayPackage.AREA__POS_Y:
				setPosY((Double)newValue);
				return;
			case RailwayPackage.AREA__WIDTH:
				setWidth((Double)newValue);
				return;
			case RailwayPackage.AREA__HEIGHT:
				setHeight((Double)newValue);
				return;
			case RailwayPackage.AREA__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RailwayPackage.AREA__ID_AREA:
				setIdArea(ID_AREA_EDEFAULT);
				return;
			case RailwayPackage.AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RailwayPackage.AREA__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case RailwayPackage.AREA__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case RailwayPackage.AREA__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case RailwayPackage.AREA__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case RailwayPackage.AREA__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case RailwayPackage.AREA__STATIONS:
				getStations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RailwayPackage.AREA__ID_AREA:
				return idArea != ID_AREA_EDEFAULT;
			case RailwayPackage.AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RailwayPackage.AREA__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case RailwayPackage.AREA__POS_X:
				return posX != POS_X_EDEFAULT;
			case RailwayPackage.AREA__POS_Y:
				return posY != POS_Y_EDEFAULT;
			case RailwayPackage.AREA__WIDTH:
				return width != WIDTH_EDEFAULT;
			case RailwayPackage.AREA__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case RailwayPackage.AREA__STATIONS:
				return stations != null && !stations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idArea: ");
		result.append(idArea);
		result.append(", name: ");
		result.append(name);
		result.append(", color: ");
		result.append(color);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //AreaImpl
