/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>moveto drawto command group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl#getDrawto_commands <em>Drawto commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class moveto_drawto_command_groupImpl extends MinimalEObjectImpl.Container implements moveto_drawto_command_group
{
  /**
   * The cached value of the '{@link #getMoveto() <em>Moveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveto()
   * @generated
   * @ordered
   */
  protected moveto moveto;

  /**
   * The cached value of the '{@link #getDrawto_commands() <em>Drawto commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrawto_commands()
   * @generated
   * @ordered
   */
  protected drawto_commands drawto_commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected moveto_drawto_command_groupImpl()
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
    return SvgPathPackage.Literals.MOVETO_DRAWTO_COMMAND_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public moveto getMoveto()
  {
    return moveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoveto(moveto newMoveto, NotificationChain msgs)
  {
    moveto oldMoveto = moveto;
    moveto = newMoveto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO, oldMoveto, newMoveto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoveto(moveto newMoveto)
  {
    if (newMoveto != moveto)
    {
      NotificationChain msgs = null;
      if (moveto != null)
        msgs = ((InternalEObject)moveto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO, null, msgs);
      if (newMoveto != null)
        msgs = ((InternalEObject)newMoveto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO, null, msgs);
      msgs = basicSetMoveto(newMoveto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO, newMoveto, newMoveto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public drawto_commands getDrawto_commands()
  {
    return drawto_commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDrawto_commands(drawto_commands newDrawto_commands, NotificationChain msgs)
  {
    drawto_commands oldDrawto_commands = drawto_commands;
    drawto_commands = newDrawto_commands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS, oldDrawto_commands, newDrawto_commands);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDrawto_commands(drawto_commands newDrawto_commands)
  {
    if (newDrawto_commands != drawto_commands)
    {
      NotificationChain msgs = null;
      if (drawto_commands != null)
        msgs = ((InternalEObject)drawto_commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS, null, msgs);
      if (newDrawto_commands != null)
        msgs = ((InternalEObject)newDrawto_commands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS, null, msgs);
      msgs = basicSetDrawto_commands(newDrawto_commands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS, newDrawto_commands, newDrawto_commands));
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
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO:
        return basicSetMoveto(null, msgs);
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS:
        return basicSetDrawto_commands(null, msgs);
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
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO:
        return getMoveto();
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS:
        return getDrawto_commands();
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
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO:
        setMoveto((moveto)newValue);
        return;
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS:
        setDrawto_commands((drawto_commands)newValue);
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
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO:
        setMoveto((moveto)null);
        return;
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS:
        setDrawto_commands((drawto_commands)null);
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
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__MOVETO:
        return moveto != null;
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS:
        return drawto_commands != null;
    }
    return super.eIsSet(featureID);
  }

} //moveto_drawto_command_groupImpl
