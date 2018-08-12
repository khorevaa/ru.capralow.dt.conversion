package ru.capralow.dt.conversion.plugin.core.cp;

<<<<<<< HEAD
import org.eclipse.emf.common.util.EList;
=======
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
<<<<<<< HEAD
=======

import ru.capralow.dt.conversion.plugin.core.cp.impl.ConversionPanelImpl;
import ru.capralow.dt.conversion.plugin.core.cp.impl.cpFormatVersionImpl;
>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git

public class ConversionPanelLabelProvider implements ILabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof cpExchangePair) {
			return ((cpExchangePair) element).getConfigurationName1() + " - " + ((cpExchangePair) element).getConfigurationName2();

		} else if (element instanceof ExchangePairStatus) {
			return ((ExchangePairStatus) element).getLiteral();

		} else if (element instanceof cpConfiguration) {
			return ((cpConfiguration) element).getConfigurationName();

		} else if (element instanceof ConfigurationStatus) {
			return ((ConfigurationStatus) element).getLiteral();

		} else if (element instanceof cpFormatVersion) {
			cpFormatVersion formatVersion = (cpFormatVersion) element;

			String version = formatVersion.getVersion().intern();
			String module = ((CommonModule) formatVersion.getModule().getOwner()).getName();

			if (formatVersion.getConfigurationName() != null) {
				module = formatVersion.getConfigurationName() + "." + module;
			}

			return version + " [" + module + "]";

		} else if (element instanceof EList) {
			return "Доступные версии формата";

		} else if (element instanceof String) {
			return element.toString();

		}

		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public void dispose() {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Автоматически созданная заглушка метода

	}

	@Override
	public Image getImage(Object element) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

<<<<<<< HEAD
=======
	@Override
	public String getText(Object element) {
		if (element instanceof ConversionPanelImpl) {
			return "Все конфигурации";

		} else if (element instanceof cpConfiguration) {
			return ((cpConfiguration) element).getConfigurationName();

		} else if (element instanceof EObjectContainmentEList) {
			return "Доступные версии формата";

		} else if (element instanceof cpFormatVersionImpl) {
			cpFormatVersion formatVersion = (cpFormatVersion) element;

			String version = formatVersion.getVersion().intern();
			String module = ((CommonModule) formatVersion.getModule().getOwner()).getName();

			if (formatVersion.getConfigurationName() != null) {
				module = formatVersion.getConfigurationName() + "." + module;
			}
			
			return version + " [" + module + "]";

		} else if (element instanceof WorkspaceStatus) {
			return ((WorkspaceStatus) element).getLiteral();

		}

		return null;
	}

>>>>>>> branch 'master' of https://gitlab.rarus.ru/kapral/ru.capralow.dt.conversion.git
}
