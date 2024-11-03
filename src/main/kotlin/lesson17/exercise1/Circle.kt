package org.example.lesson17.exercise1

class Circle(val radius: Double) : Shape("Круг") {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}
