package org.example.lesson18.exercise3

abstract class Printer {
    abstract fun printText(text: String)

    protected fun splitAndPrint(text: String, action: (String) -> Unit) {
        text.split(" ").forEach { action(it) }
    }
}
