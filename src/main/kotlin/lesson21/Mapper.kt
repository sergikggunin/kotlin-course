package org.example.lesson21

interface Mapper<T, R> {
    fun transform(element: T): R
    fun transformList(elements: List<T>): List<R> {
        return elements.map { transform(it) }
    }
}