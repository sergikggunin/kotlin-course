package org.example.lesson25.homework

// Обычная функция
fun printText() {
    println(TEXT_CONSTANT)
}

// Анонимная функция
val anonymousFunction = fun() {
    println(TEXT_CONSTANT)
}

// Лямбда с типами
val lambdaWithTypes: () -> Unit = {
    println(TEXT_CONSTANT)
}

// Лямбда без типов
val lambdaWithoutTypes = {
    println(TEXT_CONSTANT)
}

fun main() {
    printText()
    anonymousFunction()
    lambdaWithTypes()
    lambdaWithoutTypes()
}