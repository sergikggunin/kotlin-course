package org.example.lesson17.exercise2

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    // 1. Тестируем добавление материала на дно контейнера
    val bottomContainer = BottomMaterials()
    bottomContainer.addMaterialToBottom("BottomLayer")
    println("BottomMaterials:")
    bottomContainer.printContainer()

    // 2. Тестируем поочерёдное добавление материалов в начало
    val alternateContainer = AlternateTopMaterials()
    alternateContainer.addMaterialsToTopAlternately(ordinalNumbers.take(5))  // Используем первые 5 числительных
    println("\nAlternateTopMaterials:")
    alternateContainer.printContainer()

    // 3. Тестируем добавление материалов в алфавитном порядке
    val alphabeticalContainer = AlphabeticalMaterials()
    alphabeticalContainer.addMaterialAlphabetically("banana")
    alphabeticalContainer.addMaterialAlphabetically("apple")
    alphabeticalContainer.addMaterialAlphabetically("cherry")
    println("\nAlphabeticalMaterials:")
    alphabeticalContainer.printContainer()

    // 4. Тестируем добавление пары ключ-значение, где ключ добавляется в начало, а значение в конец
    val keyValueContainer = KeyValueMaterials()
    keyValueContainer.addKeyValuePairs(mapOf("Key1" to "Value1", "Key2" to "Value2"))
    println("\nKeyValueMaterials:")
    keyValueContainer.printContainer()
}
