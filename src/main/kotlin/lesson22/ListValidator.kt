package org.example.lesson22

class ListValidator<T : Number?> : Validator<List<T?>> {
    override fun validate(item: List<T?>): Boolean {
        return item.all { it != null && it.toDouble() != 0.0 }
    }
}