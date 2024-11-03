package org.example.lesson18.exercise3

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        splitAndPrint(text) { word ->
            println("\u001B[30;47m$word\u001B[0m") // Черный текст на белом фоне
        }
    }
}
