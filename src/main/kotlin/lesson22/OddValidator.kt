package org.example.lesson22

class OddValidator : Validator<Int> {
    override fun validate(item: Int): Boolean {
        return item % 2 != 0
    }
}