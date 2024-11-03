package org.example.lesson18.exercise3

class InkjetPrinter : Printer() {
    private val colors = listOf(
        "\u001B[31;43m", // Красный на желтом
        "\u001B[32;45m", // Зеленый на пурпурном
        "\u001B[34;46m"  // Синий на голубом
    )

    override fun printText(text: String) {
        splitAndPrint(text) { word ->
            val color = colors.random()
            println("$color$word\u001B[0m")
        }
    }
}
