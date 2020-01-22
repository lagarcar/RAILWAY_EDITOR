/**
 */
package eseo.idm.railway.impl;

import eseo.idm.railway.Area;
import eseo.idm.railway.Line;
import eseo.idm.railway.MetroMap;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metro Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eseo.idm.railway.impl.MetroMapImpl#getIdCurrentLine <em>Id Current Line</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.MetroMapImpl#getIdCurrentArea <em>Id Current Area</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.MetroMapImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.MetroMapImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link eseo.idm.railway.impl.MetroMapImpl#getAreas <em>Areas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroMapImpl extends MinimalEObjectImpl.Container implements MetroMap {
	/**
	 * The default value of the '{@link #getIdCurrentLine() <em>Id Current Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCurrentLine()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_CURRENT_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdCurrentLine() <em>Id Current Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCurrentLine()
	 * @generated
	 * @ordered
	 */
	protected int idCurrentLine = ID_CURRENT_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdCurrentArea() <em>Id Current Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCurrentArea()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_CURRENT_AREA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdCurrentArea() <em>Id Current Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCurrentArea()
	 * @generated
	 * @ordered
	 */
	protected int idCurrentArea = ID_CURRENT_AREA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> areas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.METRO_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdCurrentLine() {
		return idCurrentLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCurrentLine(int newIdCurrentLine) {
		int oldIdCurrentLine = idCurrentLine;
		idCurrentLine = newIdCurrentLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.METRO_MAP__ID_CURRENT_LINE, oldIdCurrentLine, idCurrentLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdCurrentArea() {
		return idCurrentArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCurrentArea(int newIdCurrentArea) {
		int oldIdCurrentArea = idCurrentArea;
		idCurrentArea = newIdCurrentArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwayPackage.METRO_MAP__ID_CURRENT_AREA, oldIdCurrentArea, idCurrentArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, RailwayPackage.METRO_MAP__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectContainmentEList<Station>(Station.class, this, RailwayPackage.METRO_MAP__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Area> getAreas() {
		if (areas == null) {
			areas = new EObjectContainmentEList<Area>(Area.class, this, RailwayPackage.METRO_MAP__AREAS);
		}
		return areas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailwayPackage.METRO_MAP__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case RailwayPackage.METRO_MAP__STATIONS:
				return ((InternalEList<?>)getStations()).basicRemove(otherEnd, msgs);
			case RailwayPackage.METRO_MAP__AREAS:
				return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
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
			case RailwayPackage.METRO_MAP__ID_CURRENT_LINE:
				return getIdCurrentLine();
			case RailwayPackage.METRO_MAP__ID_CURRENT_AREA:
				return getIdCurrentArea();
			case RailwayPackage.METRO_MAP__LINES:
				return getLines();
			case RailwayPackage.METRO_MAP__STATIONS:
				return getStations();
			case RailwayPackage.METRO_MAP__AREAS:
				return getAreas();
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
			case RailwayPackage.METRO_MAP__ID_CURRENT_LINE:
				setIdCurrentLine((Integer)newValue);
				return;
			case RailwayPackage.METRO_MAP__ID_CURRENT_AREA:
				setIdCurrentArea((Integer)newValue);
				return;
			case RailwayPackage.METRO_MAP__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case RailwayPackage.METRO_MAP__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
				return;
			case RailwayPackage.METRO_MAP__AREAS:
				getAreas().clear();
				getAreas().addAll((Collection<? extends Area>)newValue);
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
			case RailwayPackage.METRO_MAP__ID_CURRENT_LINE:
				setIdCurrentLine(ID_CURRENT_LINE_EDEFAULT);
				return;
			case RailwayPackage.METRO_MAP__ID_CURRENT_AREA:
				setIdCurrentArea(ID_CURRENT_AREA_EDEFAULT);
				return;
			case RailwayPackage.METRO_MAP__LINES:
				getLines().clear();
				return;
			case RailwayPackage.METRO_MAP__STATIONS:
				getStations().clear();
				return;
			case RailwayPackage.METRO_MAP__AREAS:
				getAreas().clear();
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
			case RailwayPackage.METRO_MAP__ID_CURRENT_LINE:
				return idCurrentLine != ID_CURRENT_LINE_EDEFAULT;
			case RailwayPackage.METRO_MAP__ID_CURRENT_AREA:
				return idCurrentArea != ID_CURRENT_AREA_EDEFAULT;
			case RailwayPackage.METRO_MAP__LINES:
				return lines != null && !lines.isEmpty();
			case RailwayPackage.METRO_MAP__STATIONS:
				return stations != null && !stations.isEmpty();
			case RailwayPackage.METRO_MAP__AREAS:
				return areas != null && !areas.isEmpty();
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
		result.append(" (idCurrentLine: ");
		result.append(idCurrentLine);
		result.append(", idCurrentArea: ");
		result.append(idCurrentArea);
		result.append(')');
		return result.toString();
	}

} //MetroMapImpl
