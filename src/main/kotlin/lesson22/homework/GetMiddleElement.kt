package org.example.lesson22.homework

fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty()) list[list.size / 2] else null
}