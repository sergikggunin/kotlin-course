package org.example.lesson22.homework

class ListHolder<T> {
    private val elements = mutableListOf<T>()

    fun add(element: T) {
        elements.add(element)
    }

    fun getAll(): List<T> = elements
}