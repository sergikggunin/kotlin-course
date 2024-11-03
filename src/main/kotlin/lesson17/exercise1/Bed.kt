package org.example.lesson17.exercise1


class Bed(
    material: String,
    color: String,
    val size: String
) : Furniture(material, color) {
    override fun description(): String = "${super.description()}, Размер кровати: $size"
}
