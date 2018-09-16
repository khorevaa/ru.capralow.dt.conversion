/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import com._1c.g5.v8.bm.core.IBmObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled <em>Is Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant <em>Selection Variant</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getBeforeProcessingEvent <em>Before Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getObjectRules <em>Object Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface CmDataRule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disabled</em>' attribute.
	 * @see #setIsDisabled(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_IsDisabled()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsDisabled();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDisabled <em>Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disabled</em>' attribute.
	 * @see #getIsDisabled()
	 * @generated
	 */
	void setIsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' attribute.
	 * @see #setConfigurationObject(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getConfigurationObject <em>Configuration Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' attribute.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(Object value);

	/**
	 * Returns the value of the '<em><b>Format Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Object</em>' attribute.
	 * @see #setFormatObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_FormatObject()
	 * @model unique="false"
	 * @generated
	 */
	String getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getFormatObject <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Object</em>' attribute.
	 * @see #getFormatObject()
	 * @generated
	 */
	void setFormatObject(String value);

	/**
	 * Returns the value of the '<em><b>For Sending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Sending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Sending</em>' attribute.
	 * @see #setForSending(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ForSending()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForSending <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Sending</em>' attribute.
	 * @see #getForSending()
	 * @generated
	 */
	void setForSending(Boolean value);

	/**
	 * Returns the value of the '<em><b>For Receiving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Receiving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Receiving</em>' attribute.
	 * @see #setForReceiving(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ForReceiving()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getForReceiving <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Receiving</em>' attribute.
	 * @see #getForReceiving()
	 * @generated
	 */
	void setForReceiving(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Data Cleaning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Cleaning</em>' attribute.
	 * @see #setIsDataCleaning(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_IsDataCleaning()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsDataCleaning();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getIsDataCleaning <em>Is Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Cleaning</em>' attribute.
	 * @see #getIsDataCleaning()
	 * @generated
	 */
	void setIsDataCleaning(Boolean value);

	/**
	 * Returns the value of the '<em><b>Selection Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see #setSelectionVariant(CmSelectionVariant)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_SelectionVariant()
	 * @model unique="false"
	 * @generated
	 */
	CmSelectionVariant getSelectionVariant();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getSelectionVariant <em>Selection Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Variant</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant
	 * @see #getSelectionVariant()
	 * @generated
	 */
	void setSelectionVariant(CmSelectionVariant value);

	/**
	 * Returns the value of the '<em><b>Data Selection Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Selection Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Selection Event</em>' attribute.
	 * @see #setDataSelectionEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_DataSelectionEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getDataSelectionEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getDataSelectionEvent <em>Data Selection Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Selection Event</em>' attribute.
	 * @see #getDataSelectionEvent()
	 * @generated
	 */
	void setDataSelectionEvent(String value);

	/**
	 * Returns the value of the '<em><b>Before Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Processing Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Processing Event</em>' attribute.
	 * @see #setBeforeProcessingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_BeforeProcessingEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getBeforeProcessingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getBeforeProcessingEvent <em>Before Processing Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Processing Event</em>' attribute.
	 * @see #getBeforeProcessingEvent()
	 * @generated
	 */
	void setBeforeProcessingEvent(String value);

	/**
	 * Returns the value of the '<em><b>On Processing Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Processing Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Processing Event</em>' attribute.
	 * @see #setOnProcessingEvent(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_OnProcessingEvent()
	 * @model unique="false"
	 * @generated
	 */
	String getOnProcessingEvent();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmDataRule#getOnProcessingEvent <em>On Processing Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Processing Event</em>' attribute.
	 * @see #getOnProcessingEvent()
	 * @generated
	 */
	void setOnProcessingEvent(String value);

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmDataRule_ObjectRules()
	 * @model
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

} // CmDataRule
