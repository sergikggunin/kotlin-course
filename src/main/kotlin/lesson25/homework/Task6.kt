package org.example.lesson25.homework

fun Map<String, Int>.filterKeysByLength(threshold: Int): List<String> {
    val filteredKeys = this.filter { it.key.length < it.value && it.key.length > threshold }.keys.toList()
    if (filteredKeys.isEmpty()) throw IllegalStateException("Список пуст")
    return filteredKeys
}

fun main() {
    val map = mapOf("apple" to 5, "dog" to 3)
    println(map.filterKeysByLength(2)) // ["dog"]
}