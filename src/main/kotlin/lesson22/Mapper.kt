package org.example.lesson22

interface Mapper<T, R> {
    fun map(item: T): R
    fun mapList(items: List<T>): List<R> = items.map { map(it) }
}