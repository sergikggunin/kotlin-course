package org.example.lesson25.homework

fun Map<List<Int>, Set<String>>.processAllTypes(
    intValue: Int,
    doubleValue: Double,
    stringValue: String,
    listValue: List<Int>,
    setValue: Set<String>
): String {
    val combinedData = "$intValue $doubleValue $stringValue ${listValue.joinToString()} ${setValue.joinToString()}"
    println(combinedData)
    return combinedData
}

fun main() {
    val map = mapOf(listOf(1, 2) to setOf("a", "b"))
    map.processAllTypes(1, 2.0, "Hello", listOf(1, 2), setOf("A", "B"))
}