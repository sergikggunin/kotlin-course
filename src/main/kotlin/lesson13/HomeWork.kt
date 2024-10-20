package org.example.lesson13

fun main() {
    // Задание 1: Подбор методов для работы с коллекциями
    val collection = listOf(1, 3, 5, 7, 9, 12)

    println("Задание 1:")
    println("Размер коллекции больше 5: ${collection.size > 5}")
    println("Коллекция пустая: ${collection.isEmpty()}")
    println("Коллекция не пустая: ${collection.isNotEmpty()}")
    println("Элемент по индексу 10 или значение по умолчанию: ${collection.getOrElse(10) { -1 }}")
    println("Коллекция в строку: ${collection.joinToString(", ")}")
    println("Сумма коллекции: ${collection.sum()}")
    println("Среднее значение коллекции: ${collection.average()}")
    println("Максимум: ${collection.maxOrNull()}")
    println("Минимум: ${collection.minOrNull()}")
    println("Первый элемент или null: ${collection.firstOrNull()}")
    println("Коллекция содержит 3: ${collection.contains(3)}")

    // Задачи на обработку коллекций
    val textCollection = listOf("apple", "banana", "cherry", null, "date", "elderberry")
    println("\nЗадание 2:")
    println("Фильтр по диапазону 18-30: ${collection.filter { it in 18..30 }}")
    println("Не делятся на 2 и 3: ${collection.filter { !(it % 2 == 0 && it % 3 == 0) }}")
    println("Очистка от null: ${textCollection.filterNotNull()}")
    println("Коллекция длин слов: ${textCollection.filterNotNull().map { it.length }}")
    println("Слово -> перевёрнутое слово: ${textCollection.filterNotNull().associate { it to it.reversed() }}")
    println("Отсортировать по алфавиту: ${textCollection.filterNotNull().sorted()}")
    println("Отсортировать по убыванию: ${textCollection.filterNotNull().sortedDescending()}")
    println("Квадраты чисел: ${collection.map { it * it }}")
    println("Группировка по первой букве: ${textCollection.filterNotNull().groupBy { it.first() }}")
    println("Уникальные элементы: ${collection.distinct()}")
    println("Первые 3 элемента: ${collection.take(3)}")
    println("Последние 3 элемента: ${collection.takeLast(3)}")

    // Задание 2: Характеристика числовой коллекции
    println("\nЗадание 3:")
    val analysisResult = analyzeCollection(collection)
    println("Анализ коллекции: $analysisResult")

    // Задание 3: Анализ учебных оценок
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val satisfactoryGrades = grades.filter { it >= 60 }.sorted().take(3)
    println("\nЗадание 4:")
    println("Отфильтрованные удовлетворительные оценки: $satisfactoryGrades")

    // Задание 4: Создание каталога по первой букве
    val list = listOf("Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
    val catalog = list.map { it.lowercase() }.groupBy { it.first() }
    println("\nЗадание 5:")
    println("Каталог по первой букве: $catalog")

    // Задание 5: Подсчёт средней длины слов
    val averageLength = list.map { it.length }.average()
    println("\nЗадание 6:")
    println("Средняя длина слов: %.2f".format(averageLength))

    // Задание 6: Категоризация чисел
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val uniqueNumbers = numbers.distinct().sortedDescending()
    val groupedByParity = uniqueNumbers.groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    println("\nЗадание 7:")
    println("Четные и нечетные: $groupedByParity")

    // Задание 7: Поиск первого подходящего элемента
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val result = ages.filterNotNull().firstOrNull { it > 18 }?.toString() ?: "Подходящий возраст не найден"
    println("\nЗадание 8:")
    println("Первый подходящий возраст: $result")
}

fun analyzeCollection(collection: List<Int>): String {
    return when {
        collection.isEmpty() -> "Пусто"
        collection.size < 5 -> "Короткая"
        collection.firstOrNull() == 0 -> "Стартовая"
        collection.sum() > 10000 -> "Массивная"
        collection.average() == 10.0 -> "Сбалансированная"
        collection.joinToString("").length == 20 -> "Клейкая"
        (collection.maxOrNull() ?: 0) < -10 -> "Отрицательная"
        (collection.minOrNull() ?: 0) > 1000 -> "Положительная"
        collection.containsAll(listOf(3, 14)) -> "Пи***тая"
        else -> "Уникальная"
    }
}

