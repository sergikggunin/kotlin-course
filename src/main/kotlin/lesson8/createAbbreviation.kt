package org.example.lesson8

fun createAbbreviation(phrase: String): String {
    // Разделяем фразу по пробелам, дефисам и другим разделителям
    val words = phrase.split(" ", "-", "_")

    // Переменная для накопления первых букв
    var abbreviation = ""

    // Перебираем слова и добавляем первую букву каждого слова в аббревиатуру
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercaseChar() // Добавляем первую букву в верхнем регистре
        }
    }

    return abbreviation
}

fun main() {
    val phrase = "Объектно-ориентированное программирование"
    val abbreviation = createAbbreviation(phrase)
    println("Аббревиатура: $abbreviation") // Вывод: ООП
}
