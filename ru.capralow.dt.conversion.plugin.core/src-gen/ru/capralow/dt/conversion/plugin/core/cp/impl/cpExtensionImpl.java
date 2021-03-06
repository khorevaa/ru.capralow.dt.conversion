/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;
import ru.capralow.dt.conversion.plugin.core.cp.cpExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cp Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.impl.cpExtensionImpl#getConfigurationName <em>Configuration Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cpExtensionImpl extends MinimalEObjectImpl.Container implements cpExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpPackage.Literals.CP_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConfigurationObject() {
		return (Object)eGet(CpPackage.Literals.CP_EXTENSION__CONFIGURATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationObject(Object newConfigurationObject) {
		eSet(CpPackage.Literals.CP_EXTENSION__CONFIGURATION_OBJECT, newConfigurationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return (String)eGet(CpPackage.Literals.CP_EXTENSION__CONFIGURATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		eSet(CpPackage.Literals.CP_EXTENSION__CONFIGURATION_NAME, newConfigurationName);
	}

} //cpExtensionImpl
