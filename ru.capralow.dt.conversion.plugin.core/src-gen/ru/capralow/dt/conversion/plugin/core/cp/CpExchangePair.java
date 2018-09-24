/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getConfigurationName1 <em>Configuration Name1</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getConfigurationName2 <em>Configuration Name2</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getCpExchangePair()
 * @model
 * @generated
 */
public interface CpExchangePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Name1</em>' attribute.
	 * @see #setConfigurationName1(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getCpExchangePair_ConfigurationName1()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName1();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getConfigurationName1 <em>Configuration Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name1</em>' attribute.
	 * @see #getConfigurationName1()
	 * @generated
	 */
	void setConfigurationName1(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Name2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Name2</em>' attribute.
	 * @see #setConfigurationName2(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getCpExchangePair_ConfigurationName2()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationName2();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getConfigurationName2 <em>Configuration Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name2</em>' attribute.
	 * @see #getConfigurationName2()
	 * @generated
	 */
	void setConfigurationName2(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePairStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpExchangePairStatus
	 * @see #setStatus(CpExchangePairStatus)
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getCpExchangePair_Status()
	 * @model unique="false"
	 * @generated
	 */
	CpExchangePairStatus getStatus();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cp.CpExchangePair#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpExchangePairStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CpExchangePairStatus value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getCpExchangePair_Versions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVersions();

} // CpExchangePair
