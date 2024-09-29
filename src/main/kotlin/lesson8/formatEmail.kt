package org.example.lesson8

fun formatEmail(email: String): String {
    // Заменяем "@" на "[at]" и "." на "[dot]"
    return email.replace("@", " [at] ").replace(".", " [dot] ")
}

fun main() {
    val email = "username@example.com"
    val formattedEmail = formatEmail(email)
    println(formattedEmail) // Вывод: username [at] example [dot] com
}
