package org.example.lesson21

class OddValidator : Validator<Int> {
    override fun isValid(value: Int): Boolean {
        return value % 2 == 0
    }
}