package org.example.lesson24.homework

class CustomRuntimeException(cause: ArrayIndexOutOfBoundsException) : RuntimeException("Ошибка доступа к индексу массива", cause)