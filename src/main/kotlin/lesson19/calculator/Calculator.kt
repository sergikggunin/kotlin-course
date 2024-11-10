package org.example.lesson19.calculator

class Calculator(customOperations: List<Operations>) {
    private val operations = customOperations + listOf(
        SumOperations(),
        MultiplicationOperations(),
        DiffOperations(),
        DivOperations(),
        DivReminderOperations()
    )

    fun operate(expression: String): String {
        return getExecutor(expression).operate(expression)
    }

    private fun getExecutor(expression: String): Operations {
        return operations.find { it.checkOperator(expression) } ?: throw Exception("Не найден исполнитель")
    }
}
