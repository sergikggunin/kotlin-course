package org.example.lesson8

fun extractDateTimeWithSubstring(log: String) {
    val delimiter = "->"
    val index = log.indexOf(delimiter) // Находим индекс разделителя "->"
    if (index != -1) {
        val dateTime = log.substring(index + delimiter.length).trim() // Извлекаем правую часть после "->" и убираем лишние пробелы
        println("Метод substring: Дата и время: $dateTime")
    } else {
        println("Метод substring: Дата и время не найдены.")
    }
}

fun extractDateTimeWithSplit(log: String) {
    val parts = log.split("->") // Разделяем строку по "->"
    if (parts.size == 2) {
        val dateTime = parts[1].trim() // Убираем лишние пробелы
        println("Метод split: Дата и время: $dateTime")
    } else {
        println("Метод split: Дата и время не найдены.")
    }
}

fun main() {
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    // Используем метод с indexOf и substring
    extractDateTimeWithSubstring(log)

    // Используем метод с split
    extractDateTimeWithSplit(log)
}
