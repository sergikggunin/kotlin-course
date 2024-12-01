package org.example.lesson25.homework

fun filterStringsByLength(strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty()) { "Список строк не должен быть пустым" }
    return strings.filter { it.length >= minLength }
}

// Остальные версии аналогичны

fun main() {
    println(filterStringsByLength(listOf("кот", "слон", "мышь"), 4))
}
