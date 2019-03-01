# dt.conversion

## Конвертация данных для [1C:Enterprise Development Tools](http://v8.1c.ru/overview/IDE/)

Текущий релиз в ветке [master: 1.00](https://github.com/DoublesunRUS/ru.capralow.dt.conversion/tree/master).<br>
Разработка ведется в ветке [dev](https://github.com/DoublesunRUS/ru.capralow.dt.conversion/tree/dev).<br>

В данном репозитории хранятся только исходники.

Плагин можно установить через Eclipse с сайта обновления http://capralow.ru/edt/conversion .
Для самостоятельной сборки плагина необходимо иметь доступ к сайту https://releases.1c.ru и настроить соответствующим образом Maven.

### Панель "Конвертация данных" (1.00)
Панель паказывает, какие версии формата доступны для каждой конфигурации. Если в рабочей области больше одной конфигурации, панель для каждой пары конфигураций показывает какими форматами они могут обмениваться

### Редактирование общих модулей с правилами обмена (dev)
При открытии общего модуля, если модуль пустой или есть Область "ПроцедурыКонвертации", то у редактора общего модуля появляется закладка "Конвертация".<br>
Внешний вид закладки похож на редактор конвертации в конфигурации 1С:Конвертация данных 3.<br>
Внутри правил доступен синтаксис контроль, контекстная подсказка и конструктор запроса.<br>
Сохранение изменений пока не работает. Нажатие в правилах на кнопку ОК **разрушит модуль**.<br>
Доступно формирование описания формата в виде markdown. Для просмотра файла можно установить редактор [Typora](https://typora.io/)
