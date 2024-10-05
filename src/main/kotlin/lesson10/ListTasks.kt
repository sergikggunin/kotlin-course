package org.example.lesson10

fun createEmptyList(): List<Int> {
    return listOf()
}

fun createInitializedList(): List<String> {
    return listOf("Hello", "World", "Kotlin")
}

fun createMutableList(): MutableList<Int> {
    return mutableListOf(1, 2, 3, 4, 5)
}

fun addElementsToList(list: MutableList<Int>) {
    list.add(6)
    list.add(7)
    list.add(8)
}

fun removeElementFromList(list: MutableList<String>, element: String) {
    list.remove(element)
}

fun printListElements(list: List<Int>) {
    for (element in list) {
        println(element)
    }
}

fun getElementByIndex(list: List<String>, index: Int): String {
    return list[index]
}

fun updateElementAtIndex(list: MutableList<Int>, index: Int, newValue: Int) {
    list[index] = newValue
}

fun mergeTwoLists(list1: List<String>, list2: List<String>): List<String> {
    val mergedList = mutableListOf<String>()
    for (item in list1) {
        mergedList.add(item)
    }
    for (item in list2) {
        mergedList.add(item)
    }
    return mergedList
}

fun findMinMaxElements(list: List<Int>): Pair<Int, Int>? {
    if (list.isEmpty()) return null
    var min = list[0]
    var max = list[0]
    for (element in list) {
        if (element < min) min = element
        if (element > max) max = element
    }
    return Pair(min, max)
}

fun filterEvenNumbers(list: List<Int>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (element in list) {
        if (element % 2 == 0) {
            evenNumbers.add(element)
        }
    }
    return evenNumbers
}

fun main() {
    val emptyList = createEmptyList()
    println("Пустой список: $emptyList")

    val initializedList = createInitializedList()
    println("Инициализированный список: $initializedList")

    val mutableList = createMutableList()
    println("Изменяемый список: $mutableList")

    addElementsToList(mutableList)
    println("Список после добавления элементов: $mutableList")

    val stringList = mutableListOf("Hello", "World", "Kotlin")
    println("Список строк до удаления: $stringList")
    removeElementFromList(stringList, "World")
    println("Список строк после удаления: $stringList")

    val intList = listOf(1, 2, 3, 4, 5)
    println("Элементы списка:")
    printListElements(intList)

    val secondElement = getElementByIndex(initializedList, 1)
    println("Второй элемент списка: $secondElement")

    updateElementAtIndex(mutableList, 2, 10)
    println("Список после обновления элемента на позиции 2: $mutableList")

    val list1 = listOf("One", "Two")
    val list2 = listOf("Three", "Four")
    val mergedList = mergeTwoLists(list1, list2)
    println("Объединенный список: $mergedList")

    val numbersList = listOf(5, 3, 9, 1, 4)
    val minMax = findMinMaxElements(numbersList)
    println("Минимальный и максимальный элементы: $minMax")

    val mixedList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val evenList = filterEvenNumbers(mixedList)
    println("Четные числа из списка: $evenList")
}
