package org.example.lesson25.homework

fun sumDigits(number: Long): Int {
    return number.toString().sumOf { it.digitToInt() }
}

// Остальные версии аналогичны

fun main() {
    println(sumDigits(12345)) // 15
}