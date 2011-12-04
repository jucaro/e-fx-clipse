/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxml2.fXML.impl;

import at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.Model;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl#getXmlDec <em>Xml Dec</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getXmlDec() <em>Xml Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmlDec()
   * @generated
   * @ordered
   */
  protected static final String XML_DEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXmlDec() <em>Xml Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmlDec()
   * @generated
   * @ordered
   */
  protected String xmlDec = XML_DEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected EList<String> comments;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ProcessingInstruction> imports;

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected ClassDefinition root;

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
    return FXMLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXmlDec()
  {
    return xmlDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXmlDec(String newXmlDec)
  {
    String oldXmlDec = xmlDec;
    xmlDec = newXmlDec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLPackage.MODEL__XML_DEC, oldXmlDec, xmlDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComments()
  {
    if (comments == null)
    {
      comments = new EDataTypeEList<String>(String.class, this, FXMLPackage.MODEL__COMMENTS);
    }
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessingInstruction> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ProcessingInstruction>(ProcessingInstruction.class, this, FXMLPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(ClassDefinition newRoot, NotificationChain msgs)
  {
    ClassDefinition oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXMLPackage.MODEL__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(ClassDefinition newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXMLPackage.MODEL__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXMLPackage.MODEL__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLPackage.MODEL__ROOT, newRoot, newRoot));
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
      case FXMLPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case FXMLPackage.MODEL__ROOT:
        return basicSetRoot(null, msgs);
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
      case FXMLPackage.MODEL__XML_DEC:
        return getXmlDec();
      case FXMLPackage.MODEL__COMMENTS:
        return getComments();
      case FXMLPackage.MODEL__IMPORTS:
        return getImports();
      case FXMLPackage.MODEL__ROOT:
        return getRoot();
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
      case FXMLPackage.MODEL__XML_DEC:
        setXmlDec((String)newValue);
        return;
      case FXMLPackage.MODEL__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection<? extends String>)newValue);
        return;
      case FXMLPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ProcessingInstruction>)newValue);
        return;
      case FXMLPackage.MODEL__ROOT:
        setRoot((ClassDefinition)newValue);
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
      case FXMLPackage.MODEL__XML_DEC:
        setXmlDec(XML_DEC_EDEFAULT);
        return;
      case FXMLPackage.MODEL__COMMENTS:
        getComments().clear();
        return;
      case FXMLPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case FXMLPackage.MODEL__ROOT:
        setRoot((ClassDefinition)null);
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
      case FXMLPackage.MODEL__XML_DEC:
        return XML_DEC_EDEFAULT == null ? xmlDec != null : !XML_DEC_EDEFAULT.equals(xmlDec);
      case FXMLPackage.MODEL__COMMENTS:
        return comments != null && !comments.isEmpty();
      case FXMLPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case FXMLPackage.MODEL__ROOT:
        return root != null;
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
    result.append(" (xmlDec: ");
    result.append(xmlDec);
    result.append(", comments: ");
    result.append(comments);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
