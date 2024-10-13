package org.example.lesson11

fun main() {
    // Задание 1
    val emptyMap: Map<Int, Int> = mapOf()

    // Задание 2
    val floatToDoubleMap: Map<Float, Double> = mapOf(1.1f to 2.2, 3.3f to 4.4, 5.5f to 6.6)

    // Задание 3
    val mutableIntToStringMap: MutableMap<Int, String> = mutableMapOf()

    // Задание 4
    mutableIntToStringMap[1] = "Один"
    mutableIntToStringMap[2] = "Два"
    mutableIntToStringMap[3] = "Три"

    // Задание 5
    val value = mutableIntToStringMap[1]
    val nonExistentValue = mutableIntToStringMap[4]

    // Задание 6
    mutableIntToStringMap.remove(2)

    // Задание 7
    val doubleToIntMap: Map<Double, Int> = mapOf(4.0 to 2, 6.0 to 3, 8.0 to 0)
    for ((key, value) in doubleToIntMap) {
        val result = if (value == 0) "бесконечность" else (key / value).toString()
        println("Результат деления $key на $value: $result")
    }

    // Задание 8
    mutableIntToStringMap[1] = "Один (обновлено)"

    // Задание 9
    val map1 = mutableMapOf(1 to "Один", 2 to "Два")
    val map2 = mutableMapOf(3 to "Три", 4 to "Четыре")
    val combinedMap = mutableMapOf<Int, String>()
    combinedMap.putAll(map1)
    combinedMap.putAll(map2)

    // Задание 10
    val complexMap: MutableMap<String, List<Int>> = mutableMapOf(
        "Набор1" to listOf(1, 2, 3),
        "Набор2" to listOf(4, 5, 6)
    )

    // Задание 11
    val setMap: MutableMap<Int, MutableSet<String>> = mutableMapOf(1 to mutableSetOf("Котлин"))
    val set = setMap[1]
    set?.add("Java")
    println(set)

    // Задание 12
    val pairMap: Map<Pair<Int, Int>, String> = mapOf(Pair(5, 1) to "Первый", Pair(2, 5) to "Второй", Pair(3, 4) to "Третий")
    val foundEntry = pairMap.filterKeys { it.first == 5 || it.second == 5 }
    println(foundEntry)

    // Дополнительные задания

    // Словарь Библиотека
    val library: MutableMap<String, List<String>> = mutableMapOf(
        "Лев Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Федор Достоевский" to listOf("Преступление и наказание", "Идиот")
    )

    // Справочник Растений
    val plantGuide: MutableMap<String, List<String>> = mutableMapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Береза")
    )

    // Четвертьфинала
    val quarterFinalTeams: MutableMap<String, List<String>> = mutableMapOf(
        "Команда А" to listOf("Игрок 1", "Игрок 2"),
        "Команда B" to listOf("Игрок 3", "Игрок 4")
    )

    // Курс лечения
    val treatmentCourse: MutableMap<String, List<String>> = mutableMapOf(
        "2024-10-01" to listOf("Препарат A", "Препарат B"),
        "2024-10-02" to listOf("Препарат C", "Препарат D")
    )

    // Словарь Путешественника
    val travelDictionary: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf(
        "Франция" to mutableMapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр"),
            "Марсель" to listOf("Старый порт")
        ),
        "Италия" to mutableMapOf(
            "Рим" to listOf("Колизей", "Фонтан Треви"),
            "Венеция" to listOf("Гранд-канал")
        )
    )
}
