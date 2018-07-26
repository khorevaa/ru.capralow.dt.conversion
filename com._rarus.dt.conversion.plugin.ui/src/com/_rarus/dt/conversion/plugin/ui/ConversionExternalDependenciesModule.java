package com._rarus.dt.conversion.plugin.ui;

import com._1c.g5.wiring.AbstractServiceAwareModule;

import org.eclipse.core.runtime.Plugin;

import com._1c.g5.v8.dt.core.platform.IConfigurationProvider;

/**
 * My plugin Guice module that is aware of DT IDE Services.
 */
public class ConversionExternalDependenciesModule extends AbstractServiceAwareModule {
	/**
	* Constructor of {@link ConversionExternalDependenciesModule}.
	*
	* @param bundle the parent bundle, cannot be {@code null}
	*/
	public ConversionExternalDependenciesModule(Plugin bundle)
	{
		super(bundle);
	}

	@Override
	protected void doConfigure() {
		// ������� ������ ������ ���������� IConfigurationProvider
		bind(IConfigurationProvider.class).toService();
	}

}
