package org.example.lesson18.exercise4

fun main() {
    val cart = ShoppingCart()
    cart.addToCart("apple")
    cart.addToCart("banana", 3)
    cart.addToCart(mapOf("cherry" to 5, "date" to 2))
    cart.addToCart(listOf("apple", "banana", "cherry"))

    println(cart)
}
