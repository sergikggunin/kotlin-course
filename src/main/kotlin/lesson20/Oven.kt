package org.example.lesson20

class Oven : TemperatureControlledOpenableDevice() {
    override val maxTemperature = 250

    fun bake() {
        checkPower()
        println("Выпечка в духовке.")
    }
}