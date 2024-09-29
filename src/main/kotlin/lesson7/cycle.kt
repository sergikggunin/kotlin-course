package org.example.lesson7

fun main() {
    // Задания для Цикла for

    // Прямой Диапазон:
    println("Числа от 1 до 5:")
    for (i in 1..5) {
        println(i)
    }

    println("\nЧетные числа от 1 до 10:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // Обратный Диапазон:
    println("\nЧисла от 5 до 1:")
    for (i in 5 downTo 1) {
        println(i)
    }

    println("\nЧисла от 10 до 1 с шагом 2:")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // С Шагом (step):
    println("\nЧисла от 1 до 9 с шагом 2:")
    for (i in 1..9 step 2) {
        println(i)
    }

    println("\nКаждое третье число в диапазоне от 1 до 20:")
    for (i in 1..20 step 3) {
        println(i)
    }

    // Использование until:
    println("\nЧисла от 1 до 9 (не включая 9):")
    for (i in 1 until 9) {
        println(i)
    }

    println("\nЧисла от 3 до 15 (не включая 15):")
    for (i in 3 until 15) {
        println(i)
    }

    // Задания для Цикла while:

    // Цикл while:
    println("\nКвадраты чисел от 1 до 5:")
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }

    println("\nУменьшение числа от 10 до 5:")
    i = 10
    while (i >= 5) {
        println(i)
        i--
    }

    // Цикл do...while:
    println("\nЧисла от 5 до 1 (do...while):")
    i = 5
    do {
        println(i)
        i--
    } while (i >= 1)

    println("\nПовторение, пока счетчик меньше 10, начиная с 5 (do...while):")
    i = 5
    do {
        println(i)
        i++
    } while (i < 10)

    // Задания для Прерывания и Пропуска Итерации:

    // Использование break:
    println("\nЦикл for от 1 до 10, выход при 6:")
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    println("\nБесконечный цикл while, прерывание при 10:")
    i = 1
    while (true) {
        println(i)
        if (i == 10) break
        i++
    }

    // Использование continue:
    println("\nПропуск четных чисел в цикле for от 1 до 10:")
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    println("\nПропуск чисел, кратных 3, в цикле while от 1 до 10:")
    i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }

    // Задача на вложенный цикл:
    println("\nТаблица умножения от 1 до 10:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println() // Переход на новую строку
    }
}
