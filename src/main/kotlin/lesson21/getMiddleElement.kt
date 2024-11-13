package org.example.lesson21

fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty()) list[list.size / 2] else null
}