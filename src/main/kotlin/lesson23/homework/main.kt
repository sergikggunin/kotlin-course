package org.example.lesson23.homework


fun main() {
    // Задача 1
    analyzeDataType("Hello")
    analyzeDataType(42)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf(1 to "a", 2 to "b"))
    analyzeDataType(3.14)

    // Задача 2
    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("Not a list"))

    // Задача 3
    println(getStringLengthOrZero("Hello"))
    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(123))

    // Задача 4
    println(squareNumber(4))
    println(squareNumber("4.2"))

    // Задача 5
    val list = listOf(1, 2.5, "hello", 3, 4.0)
    println(sumIntOrDoubleValues(list))

    // Задача 6
    tryCastToListAndPrint(listOf("Hello", "World", 123))
    tryCastToListAndPrint("Not a list")
}
