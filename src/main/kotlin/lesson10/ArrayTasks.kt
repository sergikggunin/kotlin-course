package org.example.lesson10

fun createAndInitializeArray(): Array<Int> {
    return arrayOf(1, 2, 3, 4, 5)
}

fun createEmptyStringArray(): Array<String?> {
    return arrayOfNulls<String>(10)
}

fun fillDoubleArray(): Array<Double> {
    val doubleArray = Array(5) { 0.0 }
    for (i in doubleArray.indices) {
        doubleArray[i] = (i * 2).toDouble()
    }
    return doubleArray
}

fun modifyIntArray(): Array<Int> {
    val intArray = Array(5) { 0 }
    for (i in intArray.indices) {
        intArray[i] = i * 3
    }
    return intArray
}

fun createNullableStringArray(): Array<String?> {
    return arrayOf(null, "Kotlin", "course")
}


fun copyIntArray(originalArray: Array<Int>): Array<Int> {
    val newArray = Array(originalArray.size) { 0 }
    for (i in originalArray.indices) {
        newArray[i] = originalArray[i]
    }
    return newArray
}

fun subtractArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val resultArray = Array(array1.size) { 0 }
    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }
    return resultArray
}

fun findIndexOfFive(array: Array<Int>): Int {
    var index = 0
    while (index < array.size) {
        if (array[index] == 5) {
            return index
        }
        index++
    }
    return -1
}

fun printArrayWithEvenOdd(array: Array<Int>) {
    for (element in array) {
        val parity = if (element % 2 == 0) "чётное" else "нечётное"
        println("$element: $parity")
    }
}

fun findStringInArray(array: Array<String>, searchString: String): String? {
    for (element in array) {
        if (element.contains(searchString)) {
            return element
        }
    }
    return null
}

fun main() {
    // Задание 1
    val intArray1 = createAndInitializeArray()
    println("Массив из 5 целых чисел: ${intArray1.joinToString()}")

    // Задание 2
    val emptyStringArray = createEmptyStringArray()
    println("Пустой массив строк: ${emptyStringArray.joinToString()}")

    // Задание 3
    val doubleArray = fillDoubleArray()
    println("Массив с удвоенными индексами: ${doubleArray.joinToString()}")

    // Задание 4
    val modifiedIntArray = modifyIntArray()
    println("Модифицированный массив: ${modifiedIntArray.joinToString()}")

    // Задание 5
    val nullableStringArray = createNullableStringArray()
    println("Nullable массив: ${nullableStringArray.joinToString()}")

    // Задание 6
    val copiedArray = copyIntArray(intArray1)
    println("Скопированный массив: ${copiedArray.joinToString()}")

    // Задание 7
    val array1 = arrayOf(10, 20, 30, 40)
    val array2 = arrayOf(1, 2, 3, 4)
    val diffArray = subtractArrays(array1, array2)
    println("Разница массивов: ${diffArray.joinToString()}")

    // Задание 8
    val searchArray = arrayOf(1, 2, 3, 4, 5, 6)
    val indexOfFive = findIndexOfFive(searchArray)
    println("Индекс элемента 5: $indexOfFive")

    // Задание 9
    printArrayWithEvenOdd(searchArray)

    // Задание 10
    val stringArray = arrayOf("apple", "banana", "cherry")
    val foundString = findStringInArray(stringArray, "nan")
    println("Найденная строка: $foundString")
}
