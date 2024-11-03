package org.example.lesson18.exercise1

class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[36mTweet\u001B[0m") // Голубой цвет
    }
}
