package org.example.lesson17.exercise1

class OfficeChair(
    material: String,
    color: String,
    hasArmrest: Boolean,
    val hasWheels: Boolean
) : Chair(material, color, hasArmrest) {
    override fun description(): String = "${super.description()}, Наличие колесиков: ${if (hasWheels) "Да" else "Нет"}"
}
