package org.example.lesson18.exercise1

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound() }
}
