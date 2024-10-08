package org.example.lesson8

fun transformPhrase(phrase: String): String {
    // Правило 1: Если фраза содержит слово "невозможно"
    if ("невозможно" in phrase) {
        return phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }

    // Правило 2: Если фраза начинается с "Я не уверен"
    if (phrase.startsWith("Я не уверен")) {
        return "$phrase, но моя интуиция говорит об обратном"
    }

    // Правило 3: Если фраза содержит слово "катастрофа"
    if ("катастрофа" in phrase) {
        return phrase.replace("катастрофа", "интересное событие")
    }

    // Правило 4: Если фраза заканчивается на "без проблем"
    if (phrase.endsWith("без проблем")) {
        return phrase.replace("без проблем", "с парой интересных вызовов на пути")
    }

    // Правило 5: Если фраза состоит только из одного слова
    if (phrase.trim().split(" ").size == 1) {
        return "Иногда, $phrase, но не всегда"
    }

    // Если никакие условия не подошли, возвращаем фразу без изменений
    return phrase
}

fun main() {
    // Тестовые примеры
    val phrases = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    )

    for (phrase in phrases) {
        println(transformPhrase(phrase))
    }
}
