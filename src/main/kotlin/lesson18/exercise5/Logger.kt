package org.example.lesson18.exercise5

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        val formattedMessage = when (level.uppercase()) {
            "WARNING" -> "\u001B[33mWARNING: $message\u001B[0m" // Желтый текст
            "ERROR" -> "\u001B[41;37mERROR: $message\u001B[0m"   // Белый текст на красном фоне
            else -> "INFO: $message"
        }
        println(formattedMessage)
    }

    fun log(messages: List<String>) {
        messages.forEach { println("INFO: $it") }
    }

    fun log(exception: Exception) {
        println("\u001B[41;37mERROR: ${exception.message}\u001B[0m") // Белый текст на красном фоне
    }
}
