package org.example.lesson8

fun maskCardNumber(cardNumber: String): String {
    // Убираем пробелы для корректного маскирования и затем добавим их обратно
    val cleanCardNumber = cardNumber.replace(" ", "")

    // Проверяем, что номер содержит хотя бы 4 цифры
    if (cleanCardNumber.length <= 4) {
        return cleanCardNumber // Если меньше 4 символов, возвращаем как есть
    }

    // Маскируем все символы кроме последних четырех
    val maskedPart = "*".repeat(cleanCardNumber.length - 4)
    val visiblePart = cleanCardNumber.takeLast(4)

    // Восстанавливаем пробелы через каждые 4 символа
    val maskedCardNumber = (maskedPart + visiblePart)
        .chunked(4) // Разбиваем по 4 символа
        .joinToString(" ") // Соединяем через пробел

    return maskedCardNumber
}

fun main() {
    val cardNumber = "4539 1488 0343 6467"
    println(maskCardNumber(cardNumber)) // Вывод: **** **** **** 6467
}
