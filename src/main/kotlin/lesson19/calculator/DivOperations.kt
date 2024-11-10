package org.example.lesson19.calculator

class DivOperations : Operations("/") {
    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        if (operands[1] == 0.0) throw IllegalArgumentException("Нельзя делить на ноль")
        return (operands[0] / operands[1]).toString()
    }
}