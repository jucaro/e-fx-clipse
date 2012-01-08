/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence;

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
 * An implementation of the model object '<em><b>curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argument_sequenceImpl#getCurveto_arguments <em>Curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class curveto_argument_sequenceImpl extends MinimalEObjectImpl.Container implements curveto_argument_sequence
{
  /**
   * The cached value of the '{@link #getCurveto_arguments() <em>Curveto arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveto_arguments()
   * @generated
   * @ordered
   */
  protected EList<curveto_argument> curveto_arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected curveto_argument_sequenceImpl()
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
    return SvgPathPackage.Literals.CURVETO_ARGUMENT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<curveto_argument> getCurveto_arguments()
  {
    if (curveto_arguments == null)
    {
      curveto_arguments = new EObjectContainmentEList<curveto_argument>(curveto_argument.class, this, SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS);
    }
    return curveto_arguments;
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
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS:
        return ((InternalEList<?>)getCurveto_arguments()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS:
        return getCurveto_arguments();
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
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS:
        getCurveto_arguments().clear();
        getCurveto_arguments().addAll((Collection<? extends curveto_argument>)newValue);
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
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS:
        getCurveto_arguments().clear();
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
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS:
        return curveto_arguments != null && !curveto_arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //curveto_argument_sequenceImpl
