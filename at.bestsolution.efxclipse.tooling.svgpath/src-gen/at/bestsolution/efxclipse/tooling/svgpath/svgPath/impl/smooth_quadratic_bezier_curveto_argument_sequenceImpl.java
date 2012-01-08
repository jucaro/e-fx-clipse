/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>smooth quadratic bezier curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curveto_argument_sequenceImpl#getCoordinate_pairs <em>Coordinate pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class smooth_quadratic_bezier_curveto_argument_sequenceImpl extends MinimalEObjectImpl.Container implements smooth_quadratic_bezier_curveto_argument_sequence
{
  /**
   * The cached value of the '{@link #getCoordinate_pairs() <em>Coordinate pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinate_pairs()
   * @generated
   * @ordered
   */
  protected EList<coordinate_pair> coordinate_pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected smooth_quadratic_bezier_curveto_argument_sequenceImpl()
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
    return SvgPathPackage.Literals.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<coordinate_pair> getCoordinate_pairs()
  {
    if (coordinate_pairs == null)
    {
      coordinate_pairs = new EObjectContainmentEList<coordinate_pair>(coordinate_pair.class, this, SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS);
    }
    return coordinate_pairs;
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS:
        return ((InternalEList<?>)getCoordinate_pairs()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS:
        return getCoordinate_pairs();
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS:
        getCoordinate_pairs().clear();
        getCoordinate_pairs().addAll((Collection<? extends coordinate_pair>)newValue);
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS:
        getCoordinate_pairs().clear();
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS:
        return coordinate_pairs != null && !coordinate_pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //smooth_quadratic_bezier_curveto_argument_sequenceImpl
