package org.example.lesson20

fun main() {
    val fridge = Refrigerator()
    fridge.powerOn()
    fridge.open()
    fridge.setTemperature(3)
    fridge.programAction("охлаждение")
    fridge.execute()
    fridge.coolDown()
    fridge.close()
    fridge.powerOff()

    val washingMachine = WashingMachine()
    washingMachine.powerOn()
    washingMachine.fillWater(5)
    washingMachine.setTemperature(60)
    washingMachine.setTimer(30)
    washingMachine.programAction("стирка")
    washingMachine.execute()
    washingMachine.drain()
    washingMachine.powerOff()

    val kettle = Kettle()
    kettle.powerOn()
    kettle.setTemperature(95)
    kettle.boilWater()
    kettle.powerOff()

    val oven = Oven()
    oven.powerOn()
    oven.setTemperature(180)
    oven.programAction("выпечка")
    oven.execute()
    oven.bake()
    oven.powerOff()
}