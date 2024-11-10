package org.example.lesson19.calculator

class DiffOperations : Operations("-") {
    override fun operate(expression: String): String {
        val operands = splitOperandsToDouble(expression)
        return (operands[0] - operands[1]).toString()
    }
}