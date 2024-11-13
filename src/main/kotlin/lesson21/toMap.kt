package org.example.lesson21

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val size = minOf(keys.size, values.size)
    return keys.take(size).zip(values.take(size)).toMap()
}