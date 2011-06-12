/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FONT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FONT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl#getStyleOrWeightString <em>Style Or Weight String</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl#getSize <em>Size</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FONTImpl extends MinimalEObjectImpl.Container implements FONT
{
  /**
   * The default value of the '{@link #getStyleOrWeightString() <em>Style Or Weight String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeightString()
   * @generated
   * @ordered
   */
  protected static final String STYLE_OR_WEIGHT_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyleOrWeightString() <em>Style Or Weight String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleOrWeightString()
   * @generated
   * @ordered
   */
  protected String styleOrWeightString = STYLE_OR_WEIGHT_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final String WEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected String weight = WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected static final String FAMILY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected String family = FAMILY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FONTImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssDslPackage.Literals.FONT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyleOrWeightString()
  {
    return styleOrWeightString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleOrWeightString(String newStyleOrWeightString)
  {
    String oldStyleOrWeightString = styleOrWeightString;
    styleOrWeightString = newStyleOrWeightString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONT__STYLE_OR_WEIGHT_STRING, oldStyleOrWeightString, styleOrWeightString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(String newWeight)
  {
    String oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONT__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONT__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFamily()
  {
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFamily(String newFamily)
  {
    String oldFamily = family;
    family = newFamily;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONT__FAMILY, oldFamily, family));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssDslPackage.FONT__STYLE_OR_WEIGHT_STRING:
        return getStyleOrWeightString();
      case CssDslPackage.FONT__WEIGHT:
        return getWeight();
      case CssDslPackage.FONT__SIZE:
        return getSize();
      case CssDslPackage.FONT__FAMILY:
        return getFamily();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.FONT__STYLE_OR_WEIGHT_STRING:
        setStyleOrWeightString((String)newValue);
        return;
      case CssDslPackage.FONT__WEIGHT:
        setWeight((String)newValue);
        return;
      case CssDslPackage.FONT__SIZE:
        setSize((String)newValue);
        return;
      case CssDslPackage.FONT__FAMILY:
        setFamily((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.FONT__STYLE_OR_WEIGHT_STRING:
        setStyleOrWeightString(STYLE_OR_WEIGHT_STRING_EDEFAULT);
        return;
      case CssDslPackage.FONT__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case CssDslPackage.FONT__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case CssDslPackage.FONT__FAMILY:
        setFamily(FAMILY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.FONT__STYLE_OR_WEIGHT_STRING:
        return STYLE_OR_WEIGHT_STRING_EDEFAULT == null ? styleOrWeightString != null : !STYLE_OR_WEIGHT_STRING_EDEFAULT.equals(styleOrWeightString);
      case CssDslPackage.FONT__WEIGHT:
        return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
      case CssDslPackage.FONT__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case CssDslPackage.FONT__FAMILY:
        return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (styleOrWeightString: ");
    result.append(styleOrWeightString);
    result.append(", weight: ");
    result.append(weight);
    result.append(", size: ");
    result.append(size);
    result.append(", family: ");
    result.append(family);
    result.append(')');
    return result.toString();
  }

} //FONTImpl
