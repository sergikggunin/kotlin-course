package org.example.lesson22.homework

interface Validator<T> {
    fun validate(item: T): Boolean
}