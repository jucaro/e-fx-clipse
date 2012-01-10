/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg.impl;

import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.LightSourceElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpotLight;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fe Spot Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getXml__base <em>Xml base</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getXml__lang <em>Xml lang</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getXml__space <em>Xml space</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getZ <em>Z</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getPointsAtX <em>Points At X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getPointsAtY <em>Points At Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getPointsAtZ <em>Points At Z</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getSpecularExponent <em>Specular Exponent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgFeSpotLightImpl#getLimitingConeAngle <em>Limiting Cone Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvgFeSpotLightImpl extends EObjectImpl implements SvgFeSpotLight {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__base() <em>Xml base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__base()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__base() <em>Xml base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__base()
	 * @generated
	 * @ordered
	 */
	protected String xml__base = XML_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__lang()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__lang()
	 * @generated
	 * @ordered
	 */
	protected String xml__lang = XML_LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__space() <em>Xml space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__space()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__space() <em>Xml space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__space()
	 * @generated
	 * @ordered
	 */
	protected String xml__space = XML_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected Double z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsAtX() <em>Points At X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtX()
	 * @generated
	 * @ordered
	 */
	protected static final Double POINTS_AT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsAtX() <em>Points At X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtX()
	 * @generated
	 * @ordered
	 */
	protected Double pointsAtX = POINTS_AT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsAtY() <em>Points At Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtY()
	 * @generated
	 * @ordered
	 */
	protected static final Double POINTS_AT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsAtY() <em>Points At Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtY()
	 * @generated
	 * @ordered
	 */
	protected Double pointsAtY = POINTS_AT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsAtZ() <em>Points At Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double POINTS_AT_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsAtZ() <em>Points At Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAtZ()
	 * @generated
	 * @ordered
	 */
	protected Double pointsAtZ = POINTS_AT_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecularExponent() <em>Specular Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularExponent()
	 * @generated
	 * @ordered
	 */
	protected static final Double SPECULAR_EXPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecularExponent() <em>Specular Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularExponent()
	 * @generated
	 * @ordered
	 */
	protected Double specularExponent = SPECULAR_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitingConeAngle() <em>Limiting Cone Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitingConeAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Double LIMITING_CONE_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimitingConeAngle() <em>Limiting Cone Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitingConeAngle()
	 * @generated
	 * @ordered
	 */
	protected Double limitingConeAngle = LIMITING_CONE_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvgFeSpotLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.SVG_FE_SPOT_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__base() {
		return xml__base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__base(String newXml__base) {
		String oldXml__base = xml__base;
		xml__base = newXml__base;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE, oldXml__base, xml__base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__lang() {
		return xml__lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__lang(String newXml__lang) {
		String oldXml__lang = xml__lang;
		xml__lang = newXml__lang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG, oldXml__lang, xml__lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__space() {
		return xml__space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__space(String newXml__space) {
		String oldXml__space = xml__space;
		xml__space = newXml__space;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE, oldXml__space, xml__space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(Double newZ) {
		Double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPointsAtX() {
		return pointsAtX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsAtX(Double newPointsAtX) {
		Double oldPointsAtX = pointsAtX;
		pointsAtX = newPointsAtX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_X, oldPointsAtX, pointsAtX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPointsAtY() {
		return pointsAtY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsAtY(Double newPointsAtY) {
		Double oldPointsAtY = pointsAtY;
		pointsAtY = newPointsAtY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Y, oldPointsAtY, pointsAtY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPointsAtZ() {
		return pointsAtZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsAtZ(Double newPointsAtZ) {
		Double oldPointsAtZ = pointsAtZ;
		pointsAtZ = newPointsAtZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Z, oldPointsAtZ, pointsAtZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpecularExponent() {
		return specularExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularExponent(Double newSpecularExponent) {
		Double oldSpecularExponent = specularExponent;
		specularExponent = newSpecularExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT, oldSpecularExponent, specularExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLimitingConeAngle() {
		return limitingConeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitingConeAngle(Double newLimitingConeAngle) {
		Double oldLimitingConeAngle = limitingConeAngle;
		limitingConeAngle = newLimitingConeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE, oldLimitingConeAngle, limitingConeAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.SVG_FE_SPOT_LIGHT__ID:
				return getId();
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE:
				return getXml__base();
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG:
				return getXml__lang();
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE:
				return getXml__space();
			case SvgPackage.SVG_FE_SPOT_LIGHT__X:
				return getX();
			case SvgPackage.SVG_FE_SPOT_LIGHT__Y:
				return getY();
			case SvgPackage.SVG_FE_SPOT_LIGHT__Z:
				return getZ();
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_X:
				return getPointsAtX();
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Y:
				return getPointsAtY();
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Z:
				return getPointsAtZ();
			case SvgPackage.SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT:
				return getSpecularExponent();
			case SvgPackage.SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE:
				return getLimitingConeAngle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SvgPackage.SVG_FE_SPOT_LIGHT__ID:
				setId((String)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE:
				setXml__base((String)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG:
				setXml__lang((String)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE:
				setXml__space((String)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__X:
				setX((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__Y:
				setY((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__Z:
				setZ((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_X:
				setPointsAtX((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Y:
				setPointsAtY((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Z:
				setPointsAtZ((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT:
				setSpecularExponent((Double)newValue);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE:
				setLimitingConeAngle((Double)newValue);
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
			case SvgPackage.SVG_FE_SPOT_LIGHT__ID:
				setId(ID_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE:
				setXml__base(XML_BASE_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG:
				setXml__lang(XML_LANG_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE:
				setXml__space(XML_SPACE_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__X:
				setX(X_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__Y:
				setY(Y_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__Z:
				setZ(Z_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_X:
				setPointsAtX(POINTS_AT_X_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Y:
				setPointsAtY(POINTS_AT_Y_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Z:
				setPointsAtZ(POINTS_AT_Z_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT:
				setSpecularExponent(SPECULAR_EXPONENT_EDEFAULT);
				return;
			case SvgPackage.SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE:
				setLimitingConeAngle(LIMITING_CONE_ANGLE_EDEFAULT);
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
			case SvgPackage.SVG_FE_SPOT_LIGHT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE:
				return XML_BASE_EDEFAULT == null ? xml__base != null : !XML_BASE_EDEFAULT.equals(xml__base);
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG:
				return XML_LANG_EDEFAULT == null ? xml__lang != null : !XML_LANG_EDEFAULT.equals(xml__lang);
			case SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE:
				return XML_SPACE_EDEFAULT == null ? xml__space != null : !XML_SPACE_EDEFAULT.equals(xml__space);
			case SvgPackage.SVG_FE_SPOT_LIGHT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case SvgPackage.SVG_FE_SPOT_LIGHT__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case SvgPackage.SVG_FE_SPOT_LIGHT__Z:
				return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_X:
				return POINTS_AT_X_EDEFAULT == null ? pointsAtX != null : !POINTS_AT_X_EDEFAULT.equals(pointsAtX);
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Y:
				return POINTS_AT_Y_EDEFAULT == null ? pointsAtY != null : !POINTS_AT_Y_EDEFAULT.equals(pointsAtY);
			case SvgPackage.SVG_FE_SPOT_LIGHT__POINTS_AT_Z:
				return POINTS_AT_Z_EDEFAULT == null ? pointsAtZ != null : !POINTS_AT_Z_EDEFAULT.equals(pointsAtZ);
			case SvgPackage.SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT:
				return SPECULAR_EXPONENT_EDEFAULT == null ? specularExponent != null : !SPECULAR_EXPONENT_EDEFAULT.equals(specularExponent);
			case SvgPackage.SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE:
				return LIMITING_CONE_ANGLE_EDEFAULT == null ? limitingConeAngle != null : !LIMITING_CONE_ANGLE_EDEFAULT.equals(limitingConeAngle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CoreAttributes.class) {
			switch (derivedFeatureID) {
				case SvgPackage.SVG_FE_SPOT_LIGHT__ID: return SvgPackage.CORE_ATTRIBUTES__ID;
				case SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE: return SvgPackage.CORE_ATTRIBUTES__XML_BASE;
				case SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG: return SvgPackage.CORE_ATTRIBUTES__XML_LANG;
				case SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE: return SvgPackage.CORE_ATTRIBUTES__XML_SPACE;
				default: return -1;
			}
		}
		if (baseClass == LightSourceElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CoreAttributes.class) {
			switch (baseFeatureID) {
				case SvgPackage.CORE_ATTRIBUTES__ID: return SvgPackage.SVG_FE_SPOT_LIGHT__ID;
				case SvgPackage.CORE_ATTRIBUTES__XML_BASE: return SvgPackage.SVG_FE_SPOT_LIGHT__XML_BASE;
				case SvgPackage.CORE_ATTRIBUTES__XML_LANG: return SvgPackage.SVG_FE_SPOT_LIGHT__XML_LANG;
				case SvgPackage.CORE_ATTRIBUTES__XML_SPACE: return SvgPackage.SVG_FE_SPOT_LIGHT__XML_SPACE;
				default: return -1;
			}
		}
		if (baseClass == LightSourceElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", xml__base: ");
		result.append(xml__base);
		result.append(", xml__lang: ");
		result.append(xml__lang);
		result.append(", xml__space: ");
		result.append(xml__space);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", pointsAtX: ");
		result.append(pointsAtX);
		result.append(", pointsAtY: ");
		result.append(pointsAtY);
		result.append(", pointsAtZ: ");
		result.append(pointsAtZ);
		result.append(", specularExponent: ");
		result.append(specularExponent);
		result.append(", limitingConeAngle: ");
		result.append(limitingConeAngle);
		result.append(')');
		return result.toString();
	}

} //SvgFeSpotLightImpl
