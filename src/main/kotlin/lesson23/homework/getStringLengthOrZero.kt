package org.example.lesson23.homework

fun getStringLengthOrZero(data: Any?): Int {
    return (data as? String)?.length ?: 0
}