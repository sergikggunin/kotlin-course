package org.example.lesson25.homework

fun List<Int>.uniqueNumbers(): List<Int> = this.distinct()

fun main() {
    println(listOf(1, 2, 2, 3, 3).uniqueNumbers()) // [1, 2, 3]
}