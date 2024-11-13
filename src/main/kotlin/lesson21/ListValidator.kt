package org.example.lesson21

class ListValidator<T : Number?> : Validator<List<T?>> {
    override fun isValid(value: List<T?>): Boolean {
        return value.all { it != null && it.toDouble() != 0.0 }
    }
}
