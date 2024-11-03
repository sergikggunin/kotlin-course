package org.example.lesson18.exercise2

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}
