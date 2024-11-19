package org.example.lesson22.homework

class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean {
        return !item.isNullOrBlank()
    }
}