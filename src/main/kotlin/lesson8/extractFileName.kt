package org.example.lesson8

fun extractFileNameWithSubstring(path: String): String {
    return path.substringAfterLast("/") // Извлекаем часть строки после последнего "/"
}

fun extractFileNameWithSplit(path: String): String {
    val parts = path.split("/") // Разделяем строку по "/"
    return parts.last() // Берем последний элемент списка
}

fun main() {
    val filePath = "C:/Пользователи/Документы/report.txt"

    // Используем метод с substringAfterLast
    val fileNameSubstring = extractFileNameWithSubstring(filePath)
    println("Имя файла (метод substringAfterLast): $fileNameSubstring")

    // Используем метод с split
    val fileNameSplit = extractFileNameWithSplit(filePath)
    println("Имя файла (метод split): $fileNameSplit")
}
