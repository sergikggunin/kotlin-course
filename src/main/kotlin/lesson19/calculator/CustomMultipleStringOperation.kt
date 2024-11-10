package org.example.lesson19.calculator

class CustomMultipleStringOperation : Operations("times") {
    override fun operate(expression: String): String {
        val operands = splitOperands(expression)
        val secondOperand = operands[1].toIntOrNull()
            ?: throw IllegalArgumentException("Ожидается, что второй операнд будет числом")
        return operands[0].repeat(secondOperand)
    }
}