package org.example.lesson21

fun main() {
        val keys = listOf("one", "two", "three")
        val values = listOf(1, 2)
        val map = toMap(keys, values)
        println("Map: $map")


        val numbers = listOf(1, 2, 3, 4, 5)
    val middleElement = getMiddleElement(numbers)
    println("Middle element: $middleElement")

    val listHolder = ListHolder<String>()
    listHolder.add("Hello")
    listHolder.add("World")
    println("ListHolder items: ${listHolder.getAll()}")

    val phraseConverter = PhrasesToListOfStrings()
    val words = phraseConverter.transform("Hello World from Kotlin")
    println("Words: $words")

    val stringValidator = StringValidator()
    println("Is valid string: ${stringValidator.isValid("Hello")}") // true
    println("Is valid string: ${stringValidator.isValid("   ")}") // false

    // Проверка работы OddValidator
    val oddValidator = OddValidator()
    println("Is even: ${oddValidator.isValid(4)}") // true
    println("Is even: ${oddValidator.isValid(5)}") // false

    // Проверка работы ListValidator
    val listValidator = ListValidator<Number>()
    println("Is valid list: ${listValidator.isValid(listOf(1, 2, 3))}") // true
    println("Is valid list: ${listValidator.isValid(listOf(1, 0, 3))}") // false
    println("Is valid list: ${listValidator.isValid(listOf(null, 2, 3))}") // false
}
