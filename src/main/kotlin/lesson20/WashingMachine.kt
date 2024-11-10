package org.example.lesson20

class WashingMachine : TemperatureControlledOpenableDevice(), WaterContainer, Drainable, Timable {
    override val capacity = 10
    override val maxTemperature = 90

    override fun fillWater(amount: Int) {
        checkPower()
        println("Набираем $amount л воды в стиральную машину.")
    }

    override fun getWater(amount: Int) {
        checkPower()
        println("Сливаем $amount л воды из стиральной машины.")
    }

    override fun connectToDrain() {
        println("Подключение к канализации.")
    }

    override fun drain() {
        println("Сливаем воду.")
    }

    override fun setTimer(time: Int) {
        checkPower()
        println("Таймер установлен на $time минут.")
    }
}
