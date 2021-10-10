# Тестирование сервиса отправки сообщений

## Описание
В репозитории [cервис отправки сообщений](https://github.com/neee/geo-service) находится код приложения отправки локализованных сообщений, в котором на основе ip-адреса, переданного в заголовке, определяется язык отправляемого сообщения.
ip-адрес начинающийся со "172." относится к российскому сегменту, а с "96." - к американскому. Для российских адресов отправляется текст на русском, а для американских адресов и всех остальных - на английском.
Наша задача написать/добавить unit-тесты с использованием библиотеки mockito для проверки корректности работы функционала.

## Что нужно сделать
- Написать тесты для проверки языка отправляемого сообщения (класс MessageSender) с использованием `Mockito`
    1. Поверить, что MessageSenderImpl всегда отправляет только русский текст, если ip относится к российскому сегменту адресов.
    2. Поверить, что MessageSenderImpl всегда отправляет только английский текст, если ip относится к американскому сегменту адресов.
- Написать тесты для проверки определения локации по ip (класс GeoServiceImpl)
    1. Проверить работу метода `public Location byIp(String ip)`
- Написать тесты для проверки возвращаемого текста (класс LocalizationServiceImpl)
    1. Проверить работу метода `public String locale(Country country)`

## Реализация
1. Склонируйте удаленный репозиторий сервиса https://github.com/neee/geo-service или сделайте его fork (предпочтительно) или скачайте к себе в виде архива;
2. Подключите к maven-проекту зависимости junit и mockito (их нужно добавить в файл pom.xml);
3. Создайте класс для тестов в папке `src/test/java` (можете также создать подпапки в соответствии с package'ом класса, который вы будете тестировать);
4. Создайте тесты в соответствии с задачей (для сервиса MessageSenderImpl, нужно обязательно создать заглушки (mock) в виде GeoServiceImpl и LocalizationServiceImpl) минимум 4 unit теста;
5. Отправьте задачу на проверку.


2 задачу не делал

# Тестирование сервиса медицинских показаний

## Описание
В репозитории [сервиса медицинских показаний](https://github.com/neee/healthcare-service) находится код приложения для хранения медицинских показаний пациентов клиники
(фамилия, имя, дата рождения, кровяное давление, температура), вся информация записывается в файл (репозиторий).
Наша задача написать/добавить unit-тесты с использованием библиотеки mockito для проверки корректности работы функционала.

## Что нужно сделать
- Написать тесты для проверки класса MedicalServiceImpl, сделав заглушку для класса PatientInfoFileRepository, который он использует
    1. Проверить вывод сообщения во время проверки давления `checkBloodPressure`
    2. Проверить вывод сообщения во время проверки температуры `checkTemperature`
    3. Проверить, что сообщения не выводятся, когда показатели в норме.

## Реализация
1. Склонируйте удаленный репозиторий сервиса https://github.com/neee/healthcare-service или сделайте его fork (предпочтительно) или скачайте к себе в виде архива;
2. Подключите к maven-проекту зависимости junit и mockito (их нужно добавить в файл pom.xml);
3. Создайте класс для тестов в папке `src/test/java` (можете также создать подпапки в соответствии с package'ом класса, который вы будете тестировать);
4. Создайте тесты в соответствии с задачей (для сервиса MedicalServiceImpl нужно обязательно создать заглушки (mock) в виде PatientInfoFileRepository и SendAlertService) - сделать минимум 3 unit-теста;
5. Для заглушки класса SendAlertService нужно проверить вызов метода send (можно воспользоваться ArgumentCaptor и verify из библиотеки mockito)
6. Отправьте задачу на проверку.