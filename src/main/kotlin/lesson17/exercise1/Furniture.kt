package org.example.lesson17.exercise1

open class Furniture(val material: String, val color: String) {
    open fun description(): String = "Мебель из материала: $material, Цвет: $color"
}
