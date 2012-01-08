/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>svg path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.svg_pathImpl#getMoveto_drawto_command_groups <em>Moveto drawto command groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class svg_pathImpl extends MinimalEObjectImpl.Container implements svg_path
{
  /**
   * The cached value of the '{@link #getMoveto_drawto_command_groups() <em>Moveto drawto command groups</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveto_drawto_command_groups()
   * @generated
   * @ordered
   */
  protected moveto_drawto_command_groups moveto_drawto_command_groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected svg_pathImpl()
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
    return SvgPathPackage.Literals.SVG_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public moveto_drawto_command_groups getMoveto_drawto_command_groups()
  {
    return moveto_drawto_command_groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoveto_drawto_command_groups(moveto_drawto_command_groups newMoveto_drawto_command_groups, NotificationChain msgs)
  {
    moveto_drawto_command_groups oldMoveto_drawto_command_groups = moveto_drawto_command_groups;
    moveto_drawto_command_groups = newMoveto_drawto_command_groups;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS, oldMoveto_drawto_command_groups, newMoveto_drawto_command_groups);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoveto_drawto_command_groups(moveto_drawto_command_groups newMoveto_drawto_command_groups)
  {
    if (newMoveto_drawto_command_groups != moveto_drawto_command_groups)
    {
      NotificationChain msgs = null;
      if (moveto_drawto_command_groups != null)
        msgs = ((InternalEObject)moveto_drawto_command_groups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS, null, msgs);
      if (newMoveto_drawto_command_groups != null)
        msgs = ((InternalEObject)newMoveto_drawto_command_groups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS, null, msgs);
      msgs = basicSetMoveto_drawto_command_groups(newMoveto_drawto_command_groups, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS, newMoveto_drawto_command_groups, newMoveto_drawto_command_groups));
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
      case SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS:
        return basicSetMoveto_drawto_command_groups(null, msgs);
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
      case SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS:
        return getMoveto_drawto_command_groups();
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
      case SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS:
        setMoveto_drawto_command_groups((moveto_drawto_command_groups)newValue);
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
      case SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS:
        setMoveto_drawto_command_groups((moveto_drawto_command_groups)null);
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
      case SvgPathPackage.SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS:
        return moveto_drawto_command_groups != null;
    }
    return super.eIsSet(featureID);
  }

} //svg_pathImpl
