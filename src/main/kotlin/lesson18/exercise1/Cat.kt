package org.example.lesson18.exercise1

class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[35mMeow\u001B[0m") // Фиолетовый цвет
    }
}
