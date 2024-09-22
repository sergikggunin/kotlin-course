package org.example.lesson6

fun getSeason(month: Int): String {
    if (month !in 1..12) {
        return "Ошибка: Номер месяца должен быть в диапазоне от 1 до 12."
    }
    return when (month) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Зима"
    }
}

fun calculateDogAge(dogYears: Int): Double {
    if (dogYears < 0) {
        throw IllegalArgumentException("Ошибка: Возраст собаки не может быть отрицательным.")
    }
    return if (dogYears <= 2) {
        dogYears * 10.5
    } else {
        2 * 10.5 + (dogYears - 2) * 4
    }
}

fun getTransportType(distance: Double): String {
    if (distance < 0) {
        return "Ошибка: Длина маршрута не может быть отрицательной."
    }
    return when {
        distance <= 1 -> "пешком"
        distance <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
}

fun calculateBonusPoints(purchaseAmount: Double): Int {
    if (purchaseAmount < 0) {
        return 0
    }
    return if (purchaseAmount <= 1000) {
        (purchaseAmount / 100).toInt() * 2
    } else {
        (purchaseAmount / 100).toInt() * 5
    }
}

fun getDocumentType(extension: String): String {
    return when (extension.lowercase()) {
        "txt", "doc", "docx" -> "Текстовый документ"
        "jpg", "png", "gif" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

fun convertTemperature(value: Double, unit: String): String {
    return when (unit.uppercase()) {
        "C" -> "${value * 9 / 5 + 32} F"
        "F" -> "${(value - 32) * 5 / 9} C"
        else -> "Ошибка: Неправильная единица измерения. Используйте C или F."
    }
}

fun suggestClothing(temperature: Double): String {
    return when {
        temperature < -30 -> "Не выходите из дома."
        temperature < 0 -> "Куртка и шапка"
        temperature <= 15 -> "Ветровка"
        temperature <= 35 -> "Футболка и шорты"
        else -> "Не выходите из дома."
    }
}

fun getMovieCategory(age: Int): String {
    if (age < 0) {
        return "Ошибка: Возраст не может быть отрицательным."
    }
    return when {
        age < 12 -> "Детские"
        age < 18 -> "Подростковые"
        else -> "18+"
    }
}

fun main() {

    println("Определение сезона:")
    println(getSeason(4))
    println(getSeason(13))

    println("\nРасчет возраста питомца:")
    println(calculateDogAge(1))
    println(calculateDogAge(5))

    println("\nОпределение вида транспорта:")
    println(getTransportType(0.5))
    println(getTransportType(3.0))
    println(getTransportType(10.0))

    println("\nРасчет бонусных баллов:")
    println(calculateBonusPoints(500.0))
    println(calculateBonusPoints(1500.0))

    println("\nОпределение типа документа:")
    println(getDocumentType("txt"))
    println(getDocumentType("jpg"))
    println(getDocumentType("pdf"))

    println("\nКонвертация температуры:")
    println(convertTemperature(0.0, "C"))
    println(convertTemperature(32.0, "F"))

    println("\nПодбор одежды по погоде:")
    println(suggestClothing(-10.0))
    println(suggestClothing(10.0))
    println(suggestClothing(36.0))

    println("\nВыбор фильма по возрасту:")
    println(getMovieCategory(10))
    println(getMovieCategory(15))
    println(getMovieCategory(20))
}
