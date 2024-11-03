package org.example.lesson18.exercise1

class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[34mBark\u001B[0m") // Синий цвет
    }
}
