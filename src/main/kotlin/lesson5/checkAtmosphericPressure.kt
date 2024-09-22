package org.example.lesson5

fun checkAtmosphericPressure(pressure: Double?) {
    // Если значение атмосферного давления неизвестно, выбрасывается исключение с сообщением об ошибке.
    val result = pressure ?: throw IllegalArgumentException("Ошибка: показания атмосферного давления отсутствуют.")
    println("Атмосферное давление: $result мм рт. ст.")
}

fun main() {
    try {
        // Пример с заданным значением атмосферного давления
        checkAtmosphericPressure(760.0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        // Пример с отсутствующим значением атмосферного давления (вызывается исключение)
        checkAtmosphericPressure(null)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
