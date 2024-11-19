package org.example.lesson22.homework

fun String?.isValid(): Boolean = this != null && this.isNotBlank()
fun Int.isOdd(): Boolean = this % 2 != 0
fun <T : Number?> List<T?>.isValidNumberList(): Boolean = this.all { it != null && it.toDouble() != 0.0 }
