package org.example.lesson19.calculator

class SumOperations : Operations("+") {
    override fun operate(expression: String): String {
        return splitOperandsToDouble(expression).sum().toString()
    }
}