/**
 */
package eseo.idm.railway.impl;

import eseo.idm.railway.Area;
import eseo.idm.railway.Line;
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
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getIdStation <em>Id Station</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.StationImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends MinimalEObjectImpl.Container implements Station {
	/**
	 * The default value of the '{@link #getIdStation() <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStation()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_STATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdStation() <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStation()
	 * @generated
	 * @ordered
	 */
	protected String idStation = ID_STATION_EDEFAULT;

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
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected Area area;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdStation() {
		return idStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdStation(String newIdStation) {
		String oldIdStation = idStation;
		idStation = newIdStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__ID_STATION, oldIdStation, idStation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__POS_X, oldPosX, posX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__POS_Y, oldPosY, posY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectWithInverseResolvingEList.ManyInverse<Line>(Line.class, this, RailwayPackage.STATION__LINES, RailwayPackage.LINE__STATIONS);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Area getArea() {
		if (area != null && area.eIsProxy()) {
			InternalEObject oldArea = (InternalEObject)area;
			area = (Area)eResolveProxy(oldArea);
			if (area != oldArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailwayPackage.STATION__AREA, oldArea, area));
			}
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area basicGetArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(Area newArea, NotificationChain msgs) {
		Area oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__AREA, oldArea, newArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(Area newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject)area).eInverseRemove(this, RailwayPackage.AREA__STATIONS, Area.class, msgs);
			if (newArea != null)
				msgs = ((InternalEObject)newArea).eInverseAdd(this, RailwayPackage.AREA__STATIONS, Area.class, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.STATION__AREA, newArea, newArea));
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
			case RailwayPackage.STATION__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
			case RailwayPackage.STATION__AREA:
				if (area != null)
					msgs = ((InternalEObject)area).eInverseRemove(this, RailwayPackage.AREA__STATIONS, Area.class, msgs);
				return basicSetArea((Area)otherEnd, msgs);
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
			case RailwayPackage.STATION__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case RailwayPackage.STATION__AREA:
				return basicSetArea(null, msgs);
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
			case RailwayPackage.STATION__ID_STATION:
				return getIdStation();
			case RailwayPackage.STATION__NAME:
				return getName();
			case RailwayPackage.STATION__POS_X:
				return getPosX();
			case RailwayPackage.STATION__POS_Y:
				return getPosY();
			case RailwayPackage.STATION__COLOR:
				return getColor();
			case RailwayPackage.STATION__LINES:
				return getLines();
			case RailwayPackage.STATION__AREA:
				if (resolve) return getArea();
				return basicGetArea();
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
			case RailwayPackage.STATION__ID_STATION:
				setIdStation((String)newValue);
				return;
			case RailwayPackage.STATION__NAME:
				setName((String)newValue);
				return;
			case RailwayPackage.STATION__POS_X:
				setPosX((Double)newValue);
				return;
			case RailwayPackage.STATION__POS_Y:
				setPosY((Double)newValue);
				return;
			case RailwayPackage.STATION__COLOR:
				setColor((String)newValue);
				return;
			case RailwayPackage.STATION__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case RailwayPackage.STATION__AREA:
				setArea((Area)newValue);
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
			case RailwayPackage.STATION__ID_STATION:
				setIdStation(ID_STATION_EDEFAULT);
				return;
			case RailwayPackage.STATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RailwayPackage.STATION__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case RailwayPackage.STATION__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case RailwayPackage.STATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case RailwayPackage.STATION__LINES:
				getLines().clear();
				return;
			case RailwayPackage.STATION__AREA:
				setArea((Area)null);
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
			case RailwayPackage.STATION__ID_STATION:
				return ID_STATION_EDEFAULT == null ? idStation != null : !ID_STATION_EDEFAULT.equals(idStation);
			case RailwayPackage.STATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RailwayPackage.STATION__POS_X:
				return posX != POS_X_EDEFAULT;
			case RailwayPackage.STATION__POS_Y:
				return posY != POS_Y_EDEFAULT;
			case RailwayPackage.STATION__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case RailwayPackage.STATION__LINES:
				return lines != null && !lines.isEmpty();
			case RailwayPackage.STATION__AREA:
				return area != null;
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
		result.append(" (idStation: ");
		result.append(idStation);
		result.append(", name: ");
		result.append(name);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //StationImpl
