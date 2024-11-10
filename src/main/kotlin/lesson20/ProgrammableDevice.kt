package org.example.lesson20

abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    private var currentAction: String? = null

    override fun programAction(action: String) {
        checkPower()
        currentAction = action
        println("Программируется действие: $action")
    }

    override fun execute() {
        checkPower()
        currentAction?.let {
            println("Выполняется действие: $it")
        } ?: println("Нет запрограммированных действий.")
    }
}