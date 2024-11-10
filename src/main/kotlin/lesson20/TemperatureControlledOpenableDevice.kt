package org.example.lesson20

abstract class TemperatureControlledOpenableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    private var temperature = 0

    override fun setTemperature(temp: Int) {
        checkPower()
        if (temp > maxTemperature) throw IllegalArgumentException("Температура превышает максимально допустимую.")
        temperature = temp
        println("Температура установлена на $temperature градусов.")
    }

    override fun open() {
        println("Открываем ${this::class.simpleName}.")
    }

    override fun close() {
        println("Закрываем ${this::class.simpleName}.")
    }
}