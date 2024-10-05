package org.example.lesson10

fun createEmptySet(): Set<Int> {
    return setOf()
}

fun createInitializedSet(): Set<Int> {
    return setOf(1, 2, 3)
}

fun createMutableSet(): MutableSet<String> {
    return mutableSetOf("Kotlin", "Java", "Scala")
}

fun addElementsToMutableSet(mutableSet: MutableSet<String>) {
    mutableSet.add("Swift")
    mutableSet.add("Go")
}

fun removeElementFromMutableSet(mutableSet: MutableSet<Int>, element: Int) {
    mutableSet.remove(element)
}

fun printSetElements(set: Set<Int>) {
    for (element in set) {
        println(element)
    }
}

fun containsElement(set: Set<String>, element: String): Boolean {
    for (item in set) {
        if (item == element) {
            return true
        }
    }
    return false
}

fun unionSets(set1: Set<String>, set2: Set<String>): Set<String> {
    val unionSet = mutableSetOf<String>()
    for (item in set1) {
        unionSet.add(item)
    }
    for (item in set2) {
        unionSet.add(item)
    }
    return unionSet
}

fun intersectSets(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    val intersectionSet = mutableSetOf<Int>()
    for (item1 in set1) {
        for (item2 in set2) {
            if (item1 == item2) {
                intersectionSet.add(item1)
            }
        }
    }
    return intersectionSet
}

fun differenceSets(set1: Set<String>, set2: Set<String>): Set<String> {
    val differenceSet = mutableSetOf<String>()
    for (item1 in set1) {
        var found = false
        for (item2 in set2) {
            if (item1 == item2) {
                found = true
                break
            }
        }
        if (!found) {
            differenceSet.add(item1)
        }
    }
    return differenceSet
}

fun convertSetToList(set: Set<String>): List<String> {
    val list = mutableListOf<String>()
    for (item in set) {
        list.add(item)
    }
    return list
}

fun main() {

    val emptySet = createEmptySet()
    println("Пустое множество: $emptySet")

    val initializedSet = createInitializedSet()
    println("Инициализированное множество: $initializedSet")

    val mutableSet = createMutableSet()
    println("Изменяемое множество: $mutableSet")

    addElementsToMutableSet(mutableSet)
    println("Множество после добавления элементов: $mutableSet")

    val intMutableSet = mutableSetOf(1, 2, 3, 4, 5)
    println("Множество целых чисел до удаления: $intMutableSet")
    removeElementFromMutableSet(intMutableSet, 2)
    println("Множество целых чисел после удаления: $intMutableSet")

    val numberSet = setOf(1, 2, 3, 4, 5)
    println("Элементы множества:")
    printSetElements(numberSet)

    val stringSet = setOf("Kotlin", "Java", "Scala")
    val isPresent = containsElement(stringSet, "Java")
    println("Содержит 'Java': $isPresent")

    val set1 = setOf("One", "Two")
    val set2 = setOf("Two", "Three")
    val unionSet = unionSets(set1, set2)
    println("Объединенное множество: $unionSet")

    val intSet1 = setOf(1, 2, 3, 4)
    val intSet2 = setOf(3, 4, 5, 6)
    val intersectionSet = intersectSets(intSet1, intSet2)
    println("Пересечение множеств: $intersectionSet")

    val stringSet1 = setOf("A", "B", "C")
    val stringSet2 = setOf("B", "D")
    val differenceSet = differenceSets(stringSet1, stringSet2)
    println("Разность множеств: $differenceSet")

    val stringSet3 = setOf("Apple", "Banana", "Cherry")
    val listFromSet = convertSetToList(stringSet3)
    println("Список из множества: $listFromSet")
}
