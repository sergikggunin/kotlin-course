package org.example.lesson14

fun main() {
    // Определить среднее время выполнения теста
    val testTimes = mapOf("test1" to 120, "test2" to 90, "test3" to 150)
    val averageTime = testTimes.values.average()
    println("Среднее время выполнения теста: $averageTime")

    // Вывести список всех тестовых методов
    val testMetadata = mapOf("testMethod1" to "metadata1", "testMethod2" to "metadata2")
    val testMethods = testMetadata.keys
    println("Тестовые методы: $testMethods")

    // Добавить новый тест в изменяемый словарь
    val testResults = mutableMapOf("test1" to "Passed", "test2" to "Failed")
    testResults["test3"] = "Passed"
    println("Обновлённые результаты тестов: $testResults")

    // Посчитать количество успешных тестов
    val successCount = testResults.count { it.value == "Passed" }
    println("Количество успешных тестов: $successCount")

    // Удалить запись о баге
    val bugTracking = mutableMapOf("bug1" to "Open", "bug2" to "Fixed")
    bugTracking.remove("bug2")
    println("Обновлённый баг-трекинг: $bugTracking")

    // Вывести сообщение о странице и статусе проверки
    val pageStatus = mapOf("page1.com" to "OK", "page2.com" to "Failed")
    pageStatus.forEach { (url, status) ->
        println("Страница: $url, Статус: $status")
    }

    // Найти сервисы с временем ответа, превышающим порог
    val serviceTimes = mapOf("Service1" to 300, "Service2" to 800, "Service3" to 150)
    val threshold = 400
    val slowServices = serviceTimes.filter { it.value > threshold }
    println("Сервисы с медленным откликом: $slowServices")

    // Найти статус ответа для указанного endpoint
    val apiResults = mapOf("/login" to "200 OK", "/logout" to "404 Not Found")
    val status = apiResults.getOrElse("/register") { "Не протестировано" }
    println("Статус endpoint: $status")

    // Получить значение для "browserType", если оно не null
    val testConfig = mapOf("browserType" to "Chrome", "timeout" to "5000")
    val browserType = testConfig["browserType"] ?: "Не указано"
    println("Тип браузера: $browserType")

    // Создать копию неизменяемого словаря и добавить новую версию
    val softwareVersions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val newVersions = softwareVersions.toMutableMap()
    newVersions["v2.0"] = "stable"
    println("Версии ПО: $newVersions")

    // Получить настройки для модели устройства или вернуть настройки по умолчанию
    val mobileSettings = mapOf("iPhone" to "iOS 15", "Samsung" to "Android 12")
    val device = "Nokia"
    val settings = mobileSettings.getOrElse(device) { "Default settings" }
    println("Настройки для $device: $settings")

    // Проверить наличие кода ошибки в словаре ошибок
    val errorCodes = mapOf(404 to "Not Found", 500 to "Internal Server Error")
    val errorCode = 404
    val containsError = errorCodes.containsKey(errorCode)
    println("Содержит код ошибки $errorCode: $containsError")

    // Отфильтровать словарь по версии тестов
    val testScenarios = mapOf("TestID_1.0" to "Passed", "TestID_2.0" to "Failed")
    val version = "2.0"
    val filteredTests = testScenarios.filter { it.key.endsWith(version) }
    println("Тесты для версии $version: $filteredTests")

    // Проверить, есть ли модули с неудачным тестированием
    val moduleResults = mapOf("Module1" to "Passed", "Module2" to "Failed")
    val hasFailedModules = moduleResults.containsValue("Failed")
    println("Есть неудачные модули: $hasFailedModules")

    // Добавить настройки из другого словаря
    val testEnvSettings = mutableMapOf("timeout" to "5000", "retry" to "3")
    val additionalSettings = mapOf("browser" to "Chrome", "resolution" to "1920x1080")
    testEnvSettings.putAll(additionalSettings)
    println("Обновлённые настройки среды: $testEnvSettings")

    // Объединить два неизменяемых словаря
    val bugs1 = mapOf("Bug1" to "Open", "Bug2" to "Closed")
    val bugs2 = mapOf("Bug3" to "Open", "Bug4" to "Closed")
    val combinedBugs = bugs1 + bugs2
    println("Объединённые баги: $combinedBugs")

    // Очистить изменяемый словарь
    val tempTestData = mutableMapOf("test1" to "Passed", "test2" to "Skipped")
    tempTestData.clear()
    println("Очищенные данные тестов: $tempTestData")

    // Исключить пропущенные тесты из отчета
    val testReport = mutableMapOf("Test1" to "Passed", "Test2" to "Skipped", "Test3" to "Failed")
    testReport.entries.removeIf { it.value == "Skipped" }
    println("Отчёт без пропущенных тестов: $testReport")

    // Удалить устаревшие конфигурации из словаря
    val testConfigs = mutableMapOf("browser" to "Chrome", "OS" to "Windows 7", "resolution" to "1920x1080")
    testConfigs.remove("OS")
    println("Конфигурации после удаления: $testConfigs")

    // Создать отчёт о тестировании
    val testResultsReport = mapOf("Test1" to "Passed", "Test2" to "Failed")
    val report = testResultsReport.map { (testId, result) -> "Test ID: $testId, Результат: $result" }
    println("Отчёт о тестировании: $report")

    // Преобразовать словарь в неизменяемый для архивации
    val lastTestResults = mutableMapOf("Test1" to "Passed", "Test2" to "Failed")
    val archivedResults = lastTestResults.toMap()
    println("Архивные результаты тестов: $archivedResults")

    // Заменить ID тестов на названия
    val testIds = mapOf("123" to 100, "456" to 200)
    val renamedTests = testIds.mapKeys { getNameById(it.key) }
    println("Тесты с названиями: $renamedTests")

    // Увеличить оценки производительности на 10%
    val performanceRatings = mutableMapOf("v1.0" to 80, "v2.0" to 90)
    performanceRatings.replaceAll { _, value -> (value * 1.1).toInt() }
    println("Оценки производительности: $performanceRatings")

    // Проверить, пуст ли словарь ошибок компиляции
    val compileErrors = mapOf<Int, String>()
    val isCompileErrorsEmpty = compileErrors.isEmpty()
    println("Словарь ошибок компиляции пуст: $isCompileErrorsEmpty")

    // Убедиться, что словарь результатов нагрузочного тестирования не пуст
    val loadTestResults = mapOf("Test1" to "Passed", "Test2" to "Failed")
    val isLoadTestNotEmpty = loadTestResults.isNotEmpty()
    println("Словарь нагрузочного тестирования не пуст: $isLoadTestNotEmpty")

    // Проверить, прошли ли все тесты успешно
    val allTestsPassed = testResults.all { it.value == "Passed" }
    println("Все тесты прошли успешно: $allTestsPassed")

    // Содержит ли словарь хотя бы один тест с ошибкой
    val hasFailedTests = testResults.any { it.value == "Failed" }
    println("Есть ли тесты с ошибкой: $hasFailedTests")

    // Отфильтровать тесты, которые не прошли успешно и содержат "optional"
    val serviceTestResults = mapOf("optionalService1" to "Failed", "service2" to "Passed", "optionalService3" to "Failed")
    val failedOptionalTests = serviceTestResults.filter { it.key.contains("optional") && it.value != "Passed" }
    println("Неуспешные optional тесты: $failedOptionalTests")
}

fun getNameById(id: String): String {
    return when (id) {
        "123" -> "LoginTest"
        "456" -> "LogoutTest"
        else -> "UnknownTest"
    }
}


