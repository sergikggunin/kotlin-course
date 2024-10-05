package org.example.lesson9

fun main() {
    val birthday = "02.10.2024"
    val today = "02.10.2024"  // Измените эту дату для тестирования

    println(greetBirthday(today, birthday))
}

fun greetBirthday(today: String, birthday: String): String {
    return when {
        isBirthday(today, birthday) -> "🎉 Сегодня тот самый день! С днем рождения! 🎂"
        isBirthdaySoon(today, birthday) -> "🎈 День рождения уже скоро! Подготовься к празднику! 🎉"
        else -> {
            val monthsLeft = monthsUntilBirthday(today, birthday)
            "📅 Сегодня не тот день! Ждите еще $monthsLeft месяц${if (monthsLeft > 1) "а" else ""} до вашего дня рождения! 🎊"
        }
    }
}

fun isBirthday(today: String, birthday: String): Boolean {
    return today == birthday
}

fun isBirthdaySoon(today: String, birthday: String): Boolean {
    val todayDate = today.split(".").map { it.toInt() }
    val birthdayDate = birthday.split(".").map { it.toInt() }
    return todayDate[1] == birthdayDate[1] && todayDate[0] < birthdayDate[0]
}

fun monthsUntilBirthday(today: String, birthday: String): Int {
    val todayParts = today.split(".").map { it.toInt() }
    val birthdayParts = birthday.split(".").map { it.toInt() }

    val todayMonth = todayParts[1]
    val todayDay = todayParts[0]
    val birthdayMonth = birthdayParts[1]
    val birthdayDay = birthdayParts[0]

    return when {
        todayMonth == birthdayMonth && todayDay < birthdayDay -> 0
        todayMonth == birthdayMonth -> 12
        todayMonth < birthdayMonth -> birthdayMonth - todayMonth
        else -> (12 - todayMonth) + birthdayMonth
    }
}
