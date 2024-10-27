package org.example.lesson15

data class Item(val name: String, val size: Int)

class Shelf(val capacity: Int) {
    private val items = mutableListOf<Item>()
    private var usedCapacity = 0

    fun addItem(item: Item): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            usedCapacity += item.size
            return true
        }
        return false
    }

    fun removeItem(itemName: String): Boolean {
        val item = items.find { it.name == itemName }
        return if (item != null) {
            items.remove(item)
            usedCapacity -= item.size
            true
        } else {
            false
        }
    }

    fun canAccommodate(item: Item): Boolean {
        return usedCapacity + item.size <= capacity
    }

    fun hasItem(itemName: String): Boolean {
        return items.any { it.name == itemName }
    }

    fun getItems(): List<Item> {
        return items.toList()
    }

    fun remainingCapacity(): Int {
        return capacity - usedCapacity
    }
}

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && shelf !in shelves) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false
        }
    }

    fun addItem(item: Item): Boolean {
        val shelf = shelves.maxByOrNull { it.remainingCapacity() }
        return if (shelf != null && shelf.addItem(item)) {
            true
        } else {
            false
        }
    }

    fun removeItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(itemName)) {
                return true
            }
        }
        return false
    }

    fun hasItem(itemName: String): Boolean {
        return shelves.any { it.hasItem(itemName) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        for ((index, shelf) in shelves.withIndex()) {
            println("Shelf $index: Capacity ${shelf.capacity}, Remaining Capacity ${shelf.remainingCapacity()}, Items: ${shelf.getItems().joinToString { it.name }}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<Item> {
        val unplacedItems = mutableListOf<Item>()
        if (index in shelves.indices) {
            val shelf = shelves[index]
            shelves.removeAt(index)
            val itemsToRedistribute = shelf.getItems().sortedByDescending { it.size }

            for (item in itemsToRedistribute) {
                if (!addItem(item)) {
                    unplacedItems.add(item)
                }
            }
        }
        return unplacedItems
    }
}

fun main() {
    val rack = Rack(maxShelves = 3)

    val shelf1 = Shelf(capacity = 20)
    val shelf2 = Shelf(capacity = 15)
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)

    val item1 = Item("Book", 5)
    val item2 = Item("Laptop", 8)
    val item3 = Item("Lamp", 6)

    rack.addItem(item1)
    rack.addItem(item2)
    rack.addItem(item3)
    rack.printContents()

    println("Removing a shelf with redistribution:")
    val unplacedItems = rack.advancedRemoveShelf(0)
    println("Unplaced items: ${unplacedItems.joinToString { it.name }}")
    rack.printContents()
}
