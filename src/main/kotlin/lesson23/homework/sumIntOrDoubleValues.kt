package org.example.lesson23.homework

fun sumIntOrDoubleValues(items: List<Any>): Double {
    return items.filterIsInstance<Number>().sumOf { it.toDouble() }
}