/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>quadratic bezier curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argument_sequenceImpl#getQuadratic_bezier_curveto_arguments <em>Quadratic bezier curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class quadratic_bezier_curveto_argument_sequenceImpl extends quadratic_bezier_curvetoImpl implements quadratic_bezier_curveto_argument_sequence
{
  /**
   * The cached value of the '{@link #getQuadratic_bezier_curveto_arguments() <em>Quadratic bezier curveto arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuadratic_bezier_curveto_arguments()
   * @generated
   * @ordered
   */
  protected EList<quadratic_bezier_curveto_argument> quadratic_bezier_curveto_arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected quadratic_bezier_curveto_argument_sequenceImpl()
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
    return SvgPathPackage.Literals.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<quadratic_bezier_curveto_argument> getQuadratic_bezier_curveto_arguments()
  {
    if (quadratic_bezier_curveto_arguments == null)
    {
      quadratic_bezier_curveto_arguments = new EObjectContainmentEList<quadratic_bezier_curveto_argument>(quadratic_bezier_curveto_argument.class, this, SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS);
    }
    return quadratic_bezier_curveto_arguments;
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
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS:
        return ((InternalEList<?>)getQuadratic_bezier_curveto_arguments()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS:
        return getQuadratic_bezier_curveto_arguments();
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
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS:
        getQuadratic_bezier_curveto_arguments().clear();
        getQuadratic_bezier_curveto_arguments().addAll((Collection<? extends quadratic_bezier_curveto_argument>)newValue);
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
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS:
        getQuadratic_bezier_curveto_arguments().clear();
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
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS:
        return quadratic_bezier_curveto_arguments != null && !quadratic_bezier_curveto_arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //quadratic_bezier_curveto_argument_sequenceImpl
