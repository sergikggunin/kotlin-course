package org.example.lesson20

class Kettle : TemperatureControlledOpenableDevice() {
    override val maxTemperature = 100

    fun boilWater() {
        checkPower()
        println("Кипячение воды.")
    }
}