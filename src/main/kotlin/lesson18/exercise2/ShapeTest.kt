package org.example.lesson18.exercise2

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, Math.PI / 3)
    )
    shapes.forEach { println("Площадь: ${it.area()}") }
}
