package org.example.lesson21

interface Validator<T> {
    fun isValid(value: T): Boolean
}