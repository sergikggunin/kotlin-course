package org.example.lesson20

class Refrigerator : TemperatureControlledOpenableDevice() {
    override val maxTemperature = 5

    fun coolDown() {
        checkPower()
        println("Холодильник охлаждается.")
    }
}