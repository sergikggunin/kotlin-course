package org.example.lesson17.exercise1

class Triangle(
    val base: Double,
    val height: Double,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon("Треугольник") {
    override fun area(): Double = 0.5 * base * height
    override fun perimeter(): Double = sideA + sideB + sideC
}
