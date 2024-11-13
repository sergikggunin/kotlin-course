package org.example.lesson21

class StringValidator : Validator<String?> {
    override fun isValid(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}