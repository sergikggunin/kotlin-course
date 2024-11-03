package org.example.lesson18.exercise2
import kotlin.math.sin

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val angle: Double
) : Shape() {
    override fun area(): Double = 0.5 * sideA * sideB * sin(angle)
}
