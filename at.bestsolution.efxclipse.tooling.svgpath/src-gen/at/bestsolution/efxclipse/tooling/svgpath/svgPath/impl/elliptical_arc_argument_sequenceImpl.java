/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence;

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
 * An implementation of the model object '<em><b>elliptical arc argument sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argument_sequenceImpl#getElliptical_arc_arguments <em>Elliptical arc arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elliptical_arc_argument_sequenceImpl extends MinimalEObjectImpl.Container implements elliptical_arc_argument_sequence
{
  /**
   * The cached value of the '{@link #getElliptical_arc_arguments() <em>Elliptical arc arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElliptical_arc_arguments()
   * @generated
   * @ordered
   */
  protected EList<elliptical_arc_argument> elliptical_arc_arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elliptical_arc_argument_sequenceImpl()
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
    return SvgPathPackage.Literals.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<elliptical_arc_argument> getElliptical_arc_arguments()
  {
    if (elliptical_arc_arguments == null)
    {
      elliptical_arc_arguments = new EObjectContainmentEList<elliptical_arc_argument>(elliptical_arc_argument.class, this, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS);
    }
    return elliptical_arc_arguments;
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS:
        return ((InternalEList<?>)getElliptical_arc_arguments()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS:
        return getElliptical_arc_arguments();
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS:
        getElliptical_arc_arguments().clear();
        getElliptical_arc_arguments().addAll((Collection<? extends elliptical_arc_argument>)newValue);
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS:
        getElliptical_arc_arguments().clear();
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS:
        return elliptical_arc_arguments != null && !elliptical_arc_arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //elliptical_arc_argument_sequenceImpl
