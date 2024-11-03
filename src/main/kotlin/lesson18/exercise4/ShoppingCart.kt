package org.example.lesson18.exercise4


class ShoppingCart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemQuantities: Map<String, Int>) {
        itemQuantities.forEach { (itemId, amount) ->
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    fun addToCart(itemIds: List<String>) {
        itemIds.forEach { addToCart(it) }
    }

    override fun toString(): String {
        val totalItems = items.values.sum()
        return buildString {
            append("Содержимое корзины:\n")
            items.forEach { (itemId, quantity) ->
                append(" - $itemId: $quantity\n")
            }
            append("Итого товаров: ${items.size}, Общее количество: $totalItems")
        }
    }
}
