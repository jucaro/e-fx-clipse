/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl#getComponentDef <em>Component Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getComponentDef() <em>Component Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentDef()
   * @generated
   * @ordered
   */
  protected ComponentDefinition componentDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return FXGraphPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, FXGraphPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition getComponentDef()
  {
    return componentDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentDef(ComponentDefinition newComponentDef, NotificationChain msgs)
  {
    ComponentDefinition oldComponentDef = componentDef;
    componentDef = newComponentDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.MODEL__COMPONENT_DEF, oldComponentDef, newComponentDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentDef(ComponentDefinition newComponentDef)
  {
    if (newComponentDef != componentDef)
    {
      NotificationChain msgs = null;
      if (componentDef != null)
        msgs = ((InternalEObject)componentDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.MODEL__COMPONENT_DEF, null, msgs);
      if (newComponentDef != null)
        msgs = ((InternalEObject)newComponentDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.MODEL__COMPONENT_DEF, null, msgs);
      msgs = basicSetComponentDef(newComponentDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.MODEL__COMPONENT_DEF, newComponentDef, newComponentDef));
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
      case FXGraphPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.MODEL__COMPONENT_DEF:
        return basicSetComponentDef(null, msgs);
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
      case FXGraphPackage.MODEL__IMPORTS:
        return getImports();
      case FXGraphPackage.MODEL__COMPONENT_DEF:
        return getComponentDef();
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
      case FXGraphPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case FXGraphPackage.MODEL__COMPONENT_DEF:
        setComponentDef((ComponentDefinition)newValue);
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
      case FXGraphPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case FXGraphPackage.MODEL__COMPONENT_DEF:
        setComponentDef((ComponentDefinition)null);
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
      case FXGraphPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case FXGraphPackage.MODEL__COMPONENT_DEF:
        return componentDef != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
