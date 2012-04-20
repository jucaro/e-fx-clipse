/**
 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec;

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
 * An implementation of the model object '<em><b>FXML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl#getXmlDec <em>Xml Dec</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl#getProcessingInstructions <em>Processing Instructions</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FXMLImpl extends MinimalEObjectImpl.Container implements FXML
{
  /**
   * The cached value of the '{@link #getXmlDec() <em>Xml Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmlDec()
   * @generated
   * @ordered
   */
  protected XMLDec xmlDec;

  /**
   * The cached value of the '{@link #getProcessingInstructions() <em>Processing Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingInstructions()
   * @generated
   * @ordered
   */
  protected EList<ProcessingInstruction> processingInstructions;

  /**
   * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootElement()
   * @generated
   * @ordered
   */
  protected ElementDefinition rootElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FXMLImpl()
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
    return FXMLDslPackage.Literals.FXML;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLDec getXmlDec()
  {
    return xmlDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXmlDec(XMLDec newXmlDec, NotificationChain msgs)
  {
    XMLDec oldXmlDec = xmlDec;
    xmlDec = newXmlDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXMLDslPackage.FXML__XML_DEC, oldXmlDec, newXmlDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXmlDec(XMLDec newXmlDec)
  {
    if (newXmlDec != xmlDec)
    {
      NotificationChain msgs = null;
      if (xmlDec != null)
        msgs = ((InternalEObject)xmlDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.FXML__XML_DEC, null, msgs);
      if (newXmlDec != null)
        msgs = ((InternalEObject)newXmlDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.FXML__XML_DEC, null, msgs);
      msgs = basicSetXmlDec(newXmlDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.FXML__XML_DEC, newXmlDec, newXmlDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessingInstruction> getProcessingInstructions()
  {
    if (processingInstructions == null)
    {
      processingInstructions = new EObjectContainmentEList<ProcessingInstruction>(ProcessingInstruction.class, this, FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS);
    }
    return processingInstructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition getRootElement()
  {
    return rootElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootElement(ElementDefinition newRootElement, NotificationChain msgs)
  {
    ElementDefinition oldRootElement = rootElement;
    rootElement = newRootElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXMLDslPackage.FXML__ROOT_ELEMENT, oldRootElement, newRootElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootElement(ElementDefinition newRootElement)
  {
    if (newRootElement != rootElement)
    {
      NotificationChain msgs = null;
      if (rootElement != null)
        msgs = ((InternalEObject)rootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.FXML__ROOT_ELEMENT, null, msgs);
      if (newRootElement != null)
        msgs = ((InternalEObject)newRootElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.FXML__ROOT_ELEMENT, null, msgs);
      msgs = basicSetRootElement(newRootElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.FXML__ROOT_ELEMENT, newRootElement, newRootElement));
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
      case FXMLDslPackage.FXML__XML_DEC:
        return basicSetXmlDec(null, msgs);
      case FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS:
        return ((InternalEList<?>)getProcessingInstructions()).basicRemove(otherEnd, msgs);
      case FXMLDslPackage.FXML__ROOT_ELEMENT:
        return basicSetRootElement(null, msgs);
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
      case FXMLDslPackage.FXML__XML_DEC:
        return getXmlDec();
      case FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS:
        return getProcessingInstructions();
      case FXMLDslPackage.FXML__ROOT_ELEMENT:
        return getRootElement();
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
      case FXMLDslPackage.FXML__XML_DEC:
        setXmlDec((XMLDec)newValue);
        return;
      case FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS:
        getProcessingInstructions().clear();
        getProcessingInstructions().addAll((Collection<? extends ProcessingInstruction>)newValue);
        return;
      case FXMLDslPackage.FXML__ROOT_ELEMENT:
        setRootElement((ElementDefinition)newValue);
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
      case FXMLDslPackage.FXML__XML_DEC:
        setXmlDec((XMLDec)null);
        return;
      case FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS:
        getProcessingInstructions().clear();
        return;
      case FXMLDslPackage.FXML__ROOT_ELEMENT:
        setRootElement((ElementDefinition)null);
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
      case FXMLDslPackage.FXML__XML_DEC:
        return xmlDec != null;
      case FXMLDslPackage.FXML__PROCESSING_INSTRUCTIONS:
        return processingInstructions != null && !processingInstructions.isEmpty();
      case FXMLDslPackage.FXML__ROOT_ELEMENT:
        return rootElement != null;
    }
    return super.eIsSet(featureID);
  }

} //FXMLImpl
