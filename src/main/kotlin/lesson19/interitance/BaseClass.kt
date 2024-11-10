package org.example.lesson19.interitance

abstract class BaseClass(
    private val privateVal: String,
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()"
        set(value) { if (verifyPublicField(value)) field = value }

    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
        protected set // Позволяет дочерним классам устанавливать значение напрямую

    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String = mapOf(
        "privateVal" to privateVal,
        "protectedVal" to protectedVal,
        "publicVal" to publicVal,
        "publicField" to publicField,
        "protectedField" to protectedField,
        "privateField" to privateField
    ).map { "${it.key}: ${it.value}" }.joinToString("\n")

    fun printText() = privatePrint()
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean = value.length < 3
    private fun privatePrint() = println("Печать из класса BaseClass")
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass
    private class PrivateClass
}