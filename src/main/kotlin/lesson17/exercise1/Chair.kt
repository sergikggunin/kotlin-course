package org.example.lesson17.exercise1

open class Chair(
    material: String,
    color: String,
    val hasArmrest: Boolean
) : Furniture(material, color) {
    override fun description(): String = "${super.description()}, Наличие подлокотников: ${if (hasArmrest) "Да" else "Нет"}"
}
