/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData;

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
 * An implementation of the model object '<em><b>Container Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl#getEndnamespace <em>Endnamespace</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl#getEndname <em>Endname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerElementDefinitionImpl extends ElementDefinitionImpl implements ContainerElementDefinition
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<AttributePropertyDefinition> properties;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected PCData content;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ElementDefinition> children;

  /**
   * The default value of the '{@link #getEndnamespace() <em>Endnamespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndnamespace()
   * @generated
   * @ordered
   */
  protected static final String ENDNAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndnamespace() <em>Endnamespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndnamespace()
   * @generated
   * @ordered
   */
  protected String endnamespace = ENDNAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected static final String ENDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected String endname = ENDNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerElementDefinitionImpl()
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
    return FXMLDslPackage.Literals.CONTAINER_ELEMENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributePropertyDefinition> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<AttributePropertyDefinition>(AttributePropertyDefinition.class, this, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCData getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(PCData newContent, NotificationChain msgs)
  {
    PCData oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(PCData newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementDefinition> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<ElementDefinition>(ElementDefinition.class, this, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndnamespace()
  {
    return endnamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndnamespace(String newEndnamespace)
  {
    String oldEndnamespace = endnamespace;
    endnamespace = newEndnamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE, oldEndnamespace, endnamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndname()
  {
    return endname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndname(String newEndname)
  {
    String oldEndname = endname;
    endname = newEndname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAME, oldEndname, endname));
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
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT:
        return basicSetContent(null, msgs);
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES:
        return getProperties();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT:
        return getContent();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN:
        return getChildren();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE:
        return getEndnamespace();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAME:
        return getEndname();
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
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends AttributePropertyDefinition>)newValue);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT:
        setContent((PCData)newValue);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ElementDefinition>)newValue);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE:
        setEndnamespace((String)newValue);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAME:
        setEndname((String)newValue);
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
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT:
        setContent((PCData)null);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN:
        getChildren().clear();
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE:
        setEndnamespace(ENDNAMESPACE_EDEFAULT);
        return;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAME:
        setEndname(ENDNAME_EDEFAULT);
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
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CONTENT:
        return content != null;
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__CHILDREN:
        return children != null && !children.isEmpty();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE:
        return ENDNAMESPACE_EDEFAULT == null ? endnamespace != null : !ENDNAMESPACE_EDEFAULT.equals(endnamespace);
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION__ENDNAME:
        return ENDNAME_EDEFAULT == null ? endname != null : !ENDNAME_EDEFAULT.equals(endname);
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
    result.append(" (endnamespace: ");
    result.append(endnamespace);
    result.append(", endname: ");
    result.append(endname);
    result.append(')');
    return result.toString();
  }

} //ContainerElementDefinitionImpl
