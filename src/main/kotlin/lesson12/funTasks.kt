package org.example.lesson12

//Функция, которая не принимает аргументов и не возвращает значения:
fun doNothing(): Unit {}

//Функция, которая принимает два целых числа и возвращает их сумму:
fun sum(a: Int, b: Int): Int {
    return a + b
}

//Функция, которая принимает строку и ничего не возвращает:
fun printString(s: String): Unit {
    println(s)
}

//Функция, которая принимает список целых чисел и возвращает среднее значение типа Double:
fun calculateAverage(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) {
        numbers.sum().toDouble() / numbers.size
    } else 0.0
}

//Функция, которая принимает nullable строку и возвращает её длину в виде nullable целого числа:
fun getLength(s: String?): Int? {
    return s?.length
}

//Функция, которая не принимает аргументов и возвращает nullable вещественное число:
fun getNullableDouble(): Double? {
    return null // можно вернуть любое Double, если необходимо
}

//Функция, которая принимает nullable список целых чисел и не возвращает значения:
fun processNullableList(numbers: List<Int?>?): Unit {
    numbers?.forEach {
        println(it)
    }
}

//Функция, которая принимает целое число и возвращает nullable строку:
fun convertToString(n: Int): String? {
    return n.toString()
}

//Функция, которая не принимает аргументов и возвращает список nullable строк:
fun getNullableStringList(): List<String?> {
    return listOf("Hello", null, "World")
}

//Функция, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение:
fun compareStringAndInt(s: String?, n: Int?): Boolean? {
    return if (s != null && n != null) {
        s.length == n
    } else null
}

//Задачи с функциями:
//Функция multiplyByTwo:
fun multiplyByTwo(n: Int): Int {
    return n * 2
}

//Функция isEven:
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

//Функция printNumbersUntil:
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

//Функция findFirstNegative:
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) {
            return num
        }
    }
    return null
}

//Функция processList:
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) return
        println(str)
    }
}

//Рефакторинг функции drawRectangle:
fun drawRectangle(width: Int, height: Int) {
    validateDimensions(width, height)
    printTopOrBottomLine(width)
    printMiddleLines(width, height)
    printTopOrBottomLine(width)
}

private fun validateDimensions(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
}

private fun printTopOrBottomLine(width: Int) {
    var line = "+"
    for (i in 1 until width - 1) {
        line += "-"
    }
    line += "+"
    println(line)
}

private fun printMiddleLines(width: Int, height: Int) {
    for (i in 1 until height - 1) {
        var line = "|"
        for (j in 1 until width - 1) {
            line += " "
        }
        line += "|"
        println(line)
    }
}

//Дополнительное задание (рефакторинг функции printMap):
fun printMap(xSize: Int, ySize: Int) {
    validateMapSize(xSize, ySize)
    val formatterSize = calculateFormatterSize(xSize)
    val xRange = generateRange(xSize)
    val yRange = generateRange(ySize)

    printHeader(formatterSize, xRange)
    printRows(formatterSize, xRange, yRange)
}

private fun validateMapSize(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
}

private fun calculateFormatterSize(xSize: Int): Int {
    return " $xSize".length
}

private fun generateRange(size: Int): IntProgression {
    return if (size > 0) 0..size else 0 downTo size
}

private fun printHeader(formatterSize: Int, xRange: IntProgression) {
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
}

private fun printRows(formatterSize: Int, xRange: IntProgression, yRange: IntProgression) {
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val result = getCellContent(i, j)
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}

private fun getCellContent(i: Int, j: Int): String {
    val m = i * j
    return when {
        m % 2 == 0 -> if (m % 3 == 0) "." else "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}
