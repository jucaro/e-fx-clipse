/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearGradientImpl extends PaintImpl implements LinearGradient
{
  /**
   * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX1()
   * @generated
   * @ordered
   */
  protected static final String X1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX1()
   * @generated
   * @ordered
   */
  protected String x1 = X1_EDEFAULT;

  /**
   * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY1()
   * @generated
   * @ordered
   */
  protected static final String Y1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY1()
   * @generated
   * @ordered
   */
  protected String y1 = Y1_EDEFAULT;

  /**
   * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected static final String X2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected String x2 = X2_EDEFAULT;

  /**
   * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected static final String Y2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected String y2 = Y2_EDEFAULT;

  /**
   * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStops()
   * @generated
   * @ordered
   */
  protected EList<StopValue> stops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearGradientImpl()
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
    return CssDslPackage.Literals.LINEAR_GRADIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX1()
  {
    return x1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX1(String newX1)
  {
    String oldX1 = x1;
    x1 = newX1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.LINEAR_GRADIENT__X1, oldX1, x1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY1()
  {
    return y1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY1(String newY1)
  {
    String oldY1 = y1;
    y1 = newY1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.LINEAR_GRADIENT__Y1, oldY1, y1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX2()
  {
    return x2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX2(String newX2)
  {
    String oldX2 = x2;
    x2 = newX2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.LINEAR_GRADIENT__X2, oldX2, x2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY2()
  {
    return y2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY2(String newY2)
  {
    String oldY2 = y2;
    y2 = newY2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.LINEAR_GRADIENT__Y2, oldY2, y2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StopValue> getStops()
  {
    if (stops == null)
    {
      stops = new EObjectContainmentEList<StopValue>(StopValue.class, this, CssDslPackage.LINEAR_GRADIENT__STOPS);
    }
    return stops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssDslPackage.LINEAR_GRADIENT__STOPS:
        return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CssDslPackage.LINEAR_GRADIENT__X1:
        return getX1();
      case CssDslPackage.LINEAR_GRADIENT__Y1:
        return getY1();
      case CssDslPackage.LINEAR_GRADIENT__X2:
        return getX2();
      case CssDslPackage.LINEAR_GRADIENT__Y2:
        return getY2();
      case CssDslPackage.LINEAR_GRADIENT__STOPS:
        return getStops();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.LINEAR_GRADIENT__X1:
        setX1((String)newValue);
        return;
      case CssDslPackage.LINEAR_GRADIENT__Y1:
        setY1((String)newValue);
        return;
      case CssDslPackage.LINEAR_GRADIENT__X2:
        setX2((String)newValue);
        return;
      case CssDslPackage.LINEAR_GRADIENT__Y2:
        setY2((String)newValue);
        return;
      case CssDslPackage.LINEAR_GRADIENT__STOPS:
        getStops().clear();
        getStops().addAll((Collection<? extends StopValue>)newValue);
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
      case CssDslPackage.LINEAR_GRADIENT__X1:
        setX1(X1_EDEFAULT);
        return;
      case CssDslPackage.LINEAR_GRADIENT__Y1:
        setY1(Y1_EDEFAULT);
        return;
      case CssDslPackage.LINEAR_GRADIENT__X2:
        setX2(X2_EDEFAULT);
        return;
      case CssDslPackage.LINEAR_GRADIENT__Y2:
        setY2(Y2_EDEFAULT);
        return;
      case CssDslPackage.LINEAR_GRADIENT__STOPS:
        getStops().clear();
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
      case CssDslPackage.LINEAR_GRADIENT__X1:
        return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
      case CssDslPackage.LINEAR_GRADIENT__Y1:
        return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
      case CssDslPackage.LINEAR_GRADIENT__X2:
        return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
      case CssDslPackage.LINEAR_GRADIENT__Y2:
        return Y2_EDEFAULT == null ? y2 != null : !Y2_EDEFAULT.equals(y2);
      case CssDslPackage.LINEAR_GRADIENT__STOPS:
        return stops != null && !stops.isEmpty();
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
    result.append(" (x1: ");
    result.append(x1);
    result.append(", y1: ");
    result.append(y1);
    result.append(", x2: ");
    result.append(x2);
    result.append(", y2: ");
    result.append(y2);
    result.append(')');
    return result.toString();
  }

} //LinearGradientImpl
