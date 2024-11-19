package org.example.lesson22.homework

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val size = minOf(keys.size, values.size)
    return keys.take(size).zip(values.take(size)).toMap()
}