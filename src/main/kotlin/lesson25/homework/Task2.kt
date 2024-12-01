package org.example.lesson25.homework

// Обычная функция
fun average(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    return list.average()
}

// Анонимная функция
val anonymousAverage = fun(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    return list.average()
}

// Лямбда с типами
val lambdaAverageWithTypes: (List<Int>) -> Double = { list ->
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    list.average()
}

// Лямбда без типов
val lambdaAverageWithoutTypes = { list: List<Int> ->
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    list.average()
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(average(list))
    println(anonymousAverage(list))
    println(lambdaAverageWithTypes(list))
    println(lambdaAverageWithoutTypes(list))
}