/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands;

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
 * An implementation of the model object '<em><b>drawto commands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandsImpl#getDrawto_commands <em>Drawto commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class drawto_commandsImpl extends MinimalEObjectImpl.Container implements drawto_commands
{
  /**
   * The cached value of the '{@link #getDrawto_commands() <em>Drawto commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrawto_commands()
   * @generated
   * @ordered
   */
  protected EList<drawto_command> drawto_commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected drawto_commandsImpl()
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
    return SvgPathPackage.Literals.DRAWTO_COMMANDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<drawto_command> getDrawto_commands()
  {
    if (drawto_commands == null)
    {
      drawto_commands = new EObjectContainmentEList<drawto_command>(drawto_command.class, this, SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS);
    }
    return drawto_commands;
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
      case SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS:
        return ((InternalEList<?>)getDrawto_commands()).basicRemove(otherEnd, msgs);
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
      case SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS:
        return getDrawto_commands();
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
      case SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS:
        getDrawto_commands().clear();
        getDrawto_commands().addAll((Collection<? extends drawto_command>)newValue);
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
      case SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS:
        getDrawto_commands().clear();
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
      case SvgPathPackage.DRAWTO_COMMANDS__DRAWTO_COMMANDS:
        return drawto_commands != null && !drawto_commands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //drawto_commandsImpl
