package org.example.lesson22

interface Validator<T> {
    fun validate(item: T): Boolean
}