package org.example.lesson20

abstract class PowerableDevice : Powerable {
    private var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("${this::class.simpleName} включено.")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("${this::class.simpleName} выключено.")
    }

    protected fun checkPower() {
        if (!isPoweredOn) throw IllegalStateException("Устройство выключено.")
    }
}