package org.example.lesson17.exercise1

class Table(
    material: String,
    color: String,
    val shape: String
) : Furniture(material, color) {
    override fun description(): String = "${super.description()}, Форма стола: $shape"
}
