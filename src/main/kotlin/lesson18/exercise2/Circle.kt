package org.example.lesson18.exercise2
import kotlin.math.PI

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}
