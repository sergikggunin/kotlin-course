package org.example.lesson18.exercise5

fun main() {
    val logger = Logger()

    logger.log("This is an info message.")
    logger.log("WARNING", "This is a warning message.")
    logger.log("ERROR", "This is an error message.")
    logger.log(listOf("Message 1", "Message 2", "Message 3"))
    logger.log(Exception("This is an exception message."))
}
