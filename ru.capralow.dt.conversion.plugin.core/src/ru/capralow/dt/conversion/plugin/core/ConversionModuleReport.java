package ru.capralow.dt.conversion.plugin.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.metadata.mdclass.BasicRegister;
import com._1c.g5.v8.dt.metadata.mdclass.Catalog;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Enum;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.StandardAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.StandardTabularSectionDescription;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.FpProperty;

public class ConversionModuleReport {

	private ConversionModule conversionModule;
	private FormatPackage formatPackage;

	public ConversionModuleReport(ConversionModule conversionModule, FormatPackage formatPackage) {
		this.conversionModule = conversionModule;
		this.formatPackage = formatPackage;
	}

	public String createReport() throws IOException {
		String result = "";
		result += "Описание формата загрузки данных " + formatPackage.getVersion() + "\r\n\r\n";
		result += "[TOC]\r\n\r\n";

		for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
			EList<Object> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
			if (receivingObjectRules.size() == 0)
				continue;

			result += "### " + cmSubsystem.getName() + "\r\n\r\n";

			for (Object objectRule : receivingObjectRules) {
				CmObjectRule cmObjectRule = (CmObjectRule) objectRule;

				MdObject configurationObject = cmObjectRule.getConfigurationObject();

				String objectSynonym = "";
				if (configurationObject instanceof Catalog) {
					objectSynonym = ((Catalog) configurationObject).getSynonym().get("ru");

				} else if (configurationObject instanceof Document) {
					objectSynonym = ((Document) configurationObject).getSynonym().get("ru");

				} else if (configurationObject instanceof Enum) {
					objectSynonym = ((Enum) configurationObject).getSynonym().get("ru");

				} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
					objectSynonym = ((ChartOfCharacteristicTypes) configurationObject).getSynonym().get("ru");

				} else if (configurationObject instanceof ChartOfCalculationTypes) {
					objectSynonym = ((ChartOfCalculationTypes) configurationObject).getSynonym().get("ru");

				} else if (configurationObject instanceof InformationRegister) {
					objectSynonym = ((InformationRegister) configurationObject).getSynonym().get("ru");

				}
				if (cmObjectRule.getForGroup())
					objectSynonym += " (группа)";

				result += "##### " + objectSynonym + "\r\n";
				result += "---\r\n";
				result += "Объект формата: " + cmObjectRule.getFormatObject() + "\r\n";
				result += "Объект конфигурации: " + cmObjectRule.getConfigurationObjectName() + "\r\n";
				result += "\r\n";

				EList<String> identificationFields = cmObjectRule.getIdentificationFields();

				CmIdentificationVariant identificationVariant = cmObjectRule.getIdentificationVariant();
				if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS
						&& identificationFields.size() == 0)
					identificationVariant = CmIdentificationVariant.UUID;

				result += "**Вариант идентификации: " + identificationVariant + "**\r\n\r\n";
				if (identificationFields.size() != 0) {
					result += "Порядок поиска по ключевым полям | Реквизиты поиска\r\n";
					result += "--- | ---\r\n";
					for (String identificationField : cmObjectRule.getIdentificationFields()) {
						result += (identificationFields.indexOf(identificationField) + 1) + " | " + identificationField
								+ "\r\n";
					}
				}

				Map<String, String> tabularSectionSynonyms = new HashMap<String, String>();
				Map<String, String> attributeSynonyms = new HashMap<String, String>();

				if (configurationObject instanceof Catalog) {
					Catalog typedObject = (Catalog) configurationObject;

					for (StandardAttribute attribute : typedObject.getStandardAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedObject.getAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

					for (CatalogTabularSection tabularSection : ((Catalog) configurationObject).getTabularSections()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

						for (StandardAttribute attribute : tabularSection.getStandardAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
						for (MdObject attribute : tabularSection.getAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
					}

				} else if (configurationObject instanceof Document) {
					Document typedObject = (Document) configurationObject;

					for (StandardAttribute attribute : typedObject.getStandardAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedObject.getAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

					for (DocumentTabularSection tabularSection : typedObject.getTabularSections()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

						for (StandardAttribute attribute : tabularSection.getStandardAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
						for (MdObject attribute : tabularSection.getAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
					}

					for (BasicRegister tabularSection : typedObject.getRegisterRecords()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));
					}

				} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
					ChartOfCharacteristicTypes typedObject = (ChartOfCharacteristicTypes) configurationObject;

					for (StandardAttribute attribute : typedObject.getStandardAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedObject.getAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

					for (ChartOfCharacteristicTypesTabularSection tabularSection : typedObject.getTabularSections()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

						for (StandardAttribute attribute : tabularSection.getStandardAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
						for (MdObject attribute : tabularSection.getAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
					}

				} else if (configurationObject instanceof ChartOfCalculationTypes) {
					ChartOfCalculationTypes typedObject = (ChartOfCalculationTypes) configurationObject;
					for (StandardAttribute attribute : typedObject.getStandardAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedObject.getAttributes())
						attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

					for (StandardTabularSectionDescription tabularSection : typedObject.getStandardTabularSections()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

						for (StandardAttribute attribute : tabularSection.getStandardAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
					}

					for (ChartOfCalculationTypesTabularSection tabularSection : typedObject.getTabularSections()) {
						tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

						for (StandardAttribute attribute : tabularSection.getStandardAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
						for (MdObject attribute : tabularSection.getAttributes())
							attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
									attribute.getSynonym().get("ru"));
					}

				}

				List<CmAttributeRule> attributeRules = cmObjectRule.getAttributeRules().stream()
						.collect(Collectors.toList());

				if (!(configurationObject instanceof InformationRegister)) {
					CmAttributeRuleImpl refAttributeRule = new CmAttributeRuleImpl();

					refAttributeRule.setConfigurationAttribute("Ссылка");

					if (!cmObjectRule.getFormatObject().isEmpty())
						refAttributeRule.setFormatAttribute("Ссылка");

					refAttributeRule.setObjectRule(cmObjectRule);

					attributeRules.add(0, refAttributeRule);
				}

				String tabString = "\u00a0\u00a0\u00a0\u00a0";

				String configurationTabularSectionName = "<>";
				String formatTabularSectionName = "<>";
				String objectKeysResult = "";
				String objectAttributesResult = "";
				boolean hasRef = false;
				for (CmAttributeRule attributeRule : attributeRules) {
					if (attributeRule.getConfigurationAttribute().equals("Ссылка"))
						if (hasRef)
							continue;
						else
							hasRef = true;

					if (!(attributeRule.getConfigurationTabularSection().equals(configurationTabularSectionName))
							|| !(attributeRule.getFormatTabularSection().equals(formatTabularSectionName))) {

						configurationTabularSectionName = attributeRule.getConfigurationTabularSection();
						formatTabularSectionName = attributeRule.getFormatTabularSection();

						if (configurationTabularSectionName.equals("")) {
							result += "\r\n";
							result += "**Шапка**\r\n\r\n";
							result += "Свойство формата | Тип значения | Свойство конфигурации | Обязательное | Примечание\r\n";
							result += "--- | --- | --- | --- | ---\r\n";

						} else {

							String tabularSynonym = tabularSectionSynonyms
									.get(attributeRule.getConfigurationTabularSection());
							if (tabularSynonym == null)
								tabularSynonym = attributeRule.getConfigurationTabularSection();

							objectAttributesResult += "\r\n\r\n";
							objectAttributesResult += "**Табличная часть: " + tabularSynonym + "**\r\n\r\n";
							objectAttributesResult += "Свойство формата | Тип значения | Свойство конфигурации | Обязательное | Примечание\r\n";
							objectAttributesResult += "--- | --- | --- | --- | ---\r\n";
						}

					}

					FpProperty fpProperty = formatPackage.getProperty(cmObjectRule.getFormatObject(),
							attributeRule.getFormatAttributeFullName());
					if (fpProperty == null) {
						String formatAttribute = attributeRule.getFormatAttribute();

						String propertyType = attributeRule.getFormatAttributeFullName().length() != 0
								? "<Свойство формата не найдено>"
								: "";

						String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttribute());
						if (attributeSynonym == null)
							attributeSynonym = attributeRule.getConfigurationAttribute();

						String required = "";

						String comment = "";
						if (attributeRule.getFormatAttribute().isEmpty())
							comment = "<Заполняется алгоритмом>";

						objectAttributesResult += formatAttribute + " | " + propertyType + " | " + attributeSynonym
								+ " | " + required + " | " + comment + "\r\n";

					} else {
						String formatAttribute = attributeRule.getFormatAttribute();

						String propertyType = attributeRule.getFormatAttributeFullName().length() != 0
								? "<Свойство формата не найдено>"
								: "";

						String required = fpProperty.getRequired() ? "Да" : "";

						String[] subPropertyTypes = fpProperty.getPropertyType().split("[;]");
						if (subPropertyTypes.length == 1) {
							String subPropertyType = subPropertyTypes[0];
							propertyType = subPropertyType;
							if (subPropertyType.startsWith("КлючевыеСвойства")) {
								EList<FpProperty> keyProperties = formatPackage.getKeyProperties(subPropertyType);
								if (keyProperties != null) {
									for (FpProperty fpKeyProperty : keyProperties) {
										formatAttribute += "<br>\r\n";
										propertyType += "<br>\r\n";
										required += "<br>\r\n";

										formatAttribute += tabString + "_" + fpKeyProperty.getName();
										propertyType += tabString + fpKeyProperty.getPropertyType();
										required += tabString + (fpKeyProperty.getRequired() ? "Да" : "");
									}
								}

							}

						} else {
							propertyType = "";

							for (String subPropertyType : subPropertyTypes) {
								formatAttribute += "<br>\r\n";
								propertyType += "<br>\r\n";
								required += "<br>\r\n";

								propertyType += tabString + subPropertyType;
								formatAttribute += tabString + "_" + subPropertyType;

								if (subPropertyType.startsWith("КлючевыеСвойства")) {
									EList<FpProperty> keyProperties = formatPackage.getKeyProperties(subPropertyType);
									if (keyProperties != null) {
										for (FpProperty fpKeyProperty : keyProperties) {
											formatAttribute += "<br>\r\n";
											propertyType += "<br>\r\n";
											required += "<br>\r\n";

											formatAttribute += tabString + tabString + fpKeyProperty.getName();
											propertyType += tabString + tabString + fpKeyProperty.getPropertyType();
											required += tabString + tabString
													+ (fpKeyProperty.getRequired() ? "Да" : "");
										}
									}
								}
							}
						}

						String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttribute());
						if (attributeSynonym == null)
							attributeSynonym = attributeRule.getConfigurationAttribute();

						String comment = "";
						if (attributeRule.getFormatAttribute().isEmpty())
							comment = "<Заполняется алгоритмом>";

						boolean isKey = fpProperty.getIsKey();
						if (isKey) {
							if (!formatAttribute.isEmpty())
								formatAttribute = "*" + formatAttribute + "*";
							if (!propertyType.isEmpty())
								propertyType = "*" + propertyType + "*";
							if (!attributeSynonym.isEmpty())
								attributeSynonym = "*" + attributeSynonym + "*";
							if (!required.isEmpty())
								required = "*" + required + "*";
							if (!comment.isEmpty())
								comment = "*" + comment + "*";

							objectKeysResult += formatAttribute + " | " + propertyType + " | " + attributeSynonym
									+ " | " + required + " | " + comment + "\r\n";

						} else
							objectAttributesResult += formatAttribute + " | " + propertyType + " | " + attributeSynonym
									+ " | " + required + " | " + comment + "\r\n";
					}

				}

				result += objectKeysResult + objectAttributesResult;

				result += "\r\n\r\n\r\n";

			}
		}

		return result;
	}
}
