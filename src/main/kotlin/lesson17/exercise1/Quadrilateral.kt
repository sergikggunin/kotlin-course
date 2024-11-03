package org.example.lesson17.exercise1

class Quadrilateral(
    val length: Double,
    val width: Double
) : Polygon("Четырёхугольник") {
    override fun area(): Double = length * width
    override fun perimeter(): Double = 2 * (length + width)
}
