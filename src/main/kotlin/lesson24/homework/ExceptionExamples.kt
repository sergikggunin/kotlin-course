package org.example.lesson24.homework


fun throwNullPointerException() {
    val str: String? = null
    str!!.length // Приводит к NullPointerException
}

fun throwArrayIndexOutOfBoundsException() {
    val array = arrayOf(1, 2, 3)
    println(array[5]) // Приводит к ArrayIndexOutOfBoundsException
}

fun throwClassCastException() {
    val obj: Any = 123
    val str = obj as String // Приводит к ClassCastException
}

fun throwNumberFormatException() {
    val num = "abc".toInt() // Приводит к NumberFormatException
}

fun throwIllegalArgumentException() {
    require(false) { "Неверный аргумент!" } // Приводит к IllegalArgumentException
}

fun throwIllegalStateException() {
    check(false) { "Неверное состояние!" } // Приводит к IllegalStateException
}

fun throwOutOfMemoryError() {
    val largeArray = ByteArray(Int.MAX_VALUE) // Приводит к OutOfMemoryError
}

fun throwStackOverflowError() {
    fun recursiveFunction() {
        recursiveFunction()
    }
    recursiveFunction() // Приводит к StackOverflowError
}
