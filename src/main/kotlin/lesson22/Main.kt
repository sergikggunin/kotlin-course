package org.example.lesson22

fun main() {
    val keys = listOf("one", "two", "three")
    val values = listOf(1, 2)
    val map = toMap(keys, values)
    println("Map: $map")

    val list = listOf(1, 2, 3, 4, 5)
    println("Middle Element: ${getMiddleElement(list)}")

    val holder = ListHolder<String>()
    holder.add("Hello")
    holder.add("World")
    println("ListHolder elements: ${holder.getAll()}")
    val mapper = PhrasesToListOfStrings()
    println("Mapped phrase: ${mapper.map("Hello world from Kotlin")}")

    val stringValidator = StringValidator()
    println("Is valid string: ${stringValidator.validate("Hello")}")

    val oddValidator = OddValidator()
    println("Is odd: ${oddValidator.validate(3)}")

    val listValidator = ListValidator<Number>()
    println("Is valid number list: ${listValidator.validate(listOf(1, 2.5, 3))}")
}
