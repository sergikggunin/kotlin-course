package org.example.lesson21

class ListHolder<T> {
    private val items = mutableListOf<T>()

    fun add(element: T) {
        items.add(element)
    }

    fun getAll(): List<T> {
        return items
    }
}
