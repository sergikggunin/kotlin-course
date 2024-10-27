package org.example.lesson15

// Объект Moon (Луна)
object Moon {
    var isVisible: Boolean = false
    var phase: String = "New Moon"

    fun showPhase() {
        println("The Moon is currently in the '$phase' phase. Visible: $isVisible")
    }
}

fun main() {
    // Класс Party (Вечеринка)
    class Party(val location: String, val attendees: Int) {
        fun details() {
            println("Party location: $location, attendees: $attendees")
        }
    }

    // Класс Emotion (Эмоция)
    class Emotion(val type: String, val intensity: Int) {
        fun express() {
            println("Feeling $type with an intensity level of $intensity")
        }
    }

    // Дата-класс Product (Продукт)
    data class Product(val name: String, val price: Double, val quantity: Int)

    // Класс Concert (Концерт)
    class Concert(
        val band: String,
        val location: String,
        val cost: Double,
        val capacity: Int
    ) {
        private var ticketsSold = 0

        fun concertDetails() {
            println("Concert by $band at $location. Ticket cost: $cost. Capacity: $capacity. Tickets sold: $ticketsSold")
        }

        fun buyTicket(): Boolean {
            return if (ticketsSold < capacity) {
                ticketsSold++
                println("Ticket purchased successfully! Total tickets sold: $ticketsSold")
                true
            } else {
                println("Sold out!")
                false
            }
        }
    }

    // Пример использования объектов и классов
    val party = Party("Central Park", 150)
    party.details()

    val emotion = Emotion("Happiness", 8)
    emotion.express()

    Moon.isVisible = true
    Moon.phase = "Full Moon"
    Moon.showPhase()

    val product = Product("Laptop", 999.99, 5)
    println("Product: $product")

    val concert = Concert("The Beatles Tribute", "Madison Square Garden", 150.0, 20000)
    concert.concertDetails()
    concert.buyTicket()
}
