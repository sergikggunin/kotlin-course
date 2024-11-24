package org.example.lesson24.homework

fun main() {
    // Задание 2: Обернуть в try-catch с отдельными catch блоками
    try {
        throwNullPointerException()
    } catch (e: NullPointerException) {
        println("NullPointerException: ${e.message}")
    }

    try {
        throwArrayIndexOutOfBoundsException()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException: ${e.message}")
    }

    try {
        throwClassCastException()
    } catch (e: ClassCastException) {
        println("ClassCastException: ${e.message}")
    }

    try {
        throwNumberFormatException()
    } catch (e: NumberFormatException) {
        println("NumberFormatException: ${e.message}")
    }

    try {
        throwIllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException: ${e.message}")
    }

    try {
        throwIllegalStateException()
    } catch (e: IllegalStateException) {
        println("IllegalStateException: ${e.message}")
    }

    try {
        throwOutOfMemoryError()
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError: ${e.message}")
    }

    try {
        throwStackOverflowError()
    } catch (e: StackOverflowError) {
        println("StackOverflowError: ${e.message}")
    }

    // Задание 3: Один блок catch с when
    try {
        throwNumberFormatException()
    } catch (e: Exception) {
        when (e) {
            is NullPointerException -> println("NullPointerException: ${e.message}")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException: ${e.message}")
            is ClassCastException -> println("ClassCastException: ${e.message}")
            is NumberFormatException -> println("NumberFormatException: ${e.message}")
            is IllegalArgumentException -> println("IllegalArgumentException: ${e.message}")
            is IllegalStateException -> println("IllegalStateException: ${e.message}")
            is OutOfMemoryError -> println("OutOfMemoryError: ${e.message}")
            is StackOverflowError -> println("StackOverflowError: ${e.message}")
            else -> println("Неизвестное исключение: ${e.message}")
        }
    }

    // Задание 4: Использование CustomAssertionError
    throw CustomAssertionError("Это пользовательское исключение типа AssertionError")

    // Задание 5: Использование CustomRuntimeException
    try {
        throwArrayIndexOutOfBoundsException()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Перехвачено исключение ArrayIndexOutOfBoundsException: ${e.message}")
        throw CustomRuntimeException(e)
    }
}