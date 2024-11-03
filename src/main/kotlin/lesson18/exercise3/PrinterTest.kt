package org.example.lesson18.exercise3

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    println("Laser Printer:")
    laserPrinter.printText("This is a test of the laser printer.")

    println("\nInkjet Printer:")
    inkjetPrinter.printText("This is a test of the inkjet printer with colorful output.")
}