package org.example.lesson23.homework

fun squareNumber(data: Any): Double {
    return when (data) {
        is Number -> data.toDouble() * data.toDouble()
        is String -> data.toDoubleOrNull()?.let { it * it } ?: throw IllegalArgumentException("Неверный формат числа")
        else -> throw IllegalArgumentException("Ожидается число или строка с числом")
    }
}