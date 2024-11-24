package org.example.lesson23.homework

fun safeCastToList(data: Any): Int {
    val list = data as? List<*>
    return list?.size ?: -1
}