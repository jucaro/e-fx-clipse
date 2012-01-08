/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence;

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
 * An implementation of the model object '<em><b>smooth curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argument_sequenceImpl#getSmooth_curveto_arguments <em>Smooth curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class smooth_curveto_argument_sequenceImpl extends MinimalEObjectImpl.Container implements smooth_curveto_argument_sequence
{
  /**
   * The cached value of the '{@link #getSmooth_curveto_arguments() <em>Smooth curveto arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmooth_curveto_arguments()
   * @generated
   * @ordered
   */
  protected EList<smooth_curveto_argument> smooth_curveto_arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected smooth_curveto_argument_sequenceImpl()
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
    return SvgPathPackage.Literals.SMOOTH_CURVETO_ARGUMENT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<smooth_curveto_argument> getSmooth_curveto_arguments()
  {
    if (smooth_curveto_arguments == null)
    {
      smooth_curveto_arguments = new EObjectContainmentEList<smooth_curveto_argument>(smooth_curveto_argument.class, this, SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS);
    }
    return smooth_curveto_arguments;
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
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS:
        return ((InternalEList<?>)getSmooth_curveto_arguments()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS:
        return getSmooth_curveto_arguments();
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
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS:
        getSmooth_curveto_arguments().clear();
        getSmooth_curveto_arguments().addAll((Collection<? extends smooth_curveto_argument>)newValue);
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
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS:
        getSmooth_curveto_arguments().clear();
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
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS:
        return smooth_curveto_arguments != null && !smooth_curveto_arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //smooth_curveto_argument_sequenceImpl
