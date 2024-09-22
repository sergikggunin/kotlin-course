package org.example.lesson5

fun calculateDelivery(deliveryCost: Double?): Double {
    // Используем значение по умолчанию $50, если стоимость доставки неизвестна (null).
    val baseCost = deliveryCost ?: 50.0
    val insurance = baseCost * 0.005
    return baseCost + insurance
}

fun main() {
    // Пример с заданной стоимостью доставки
    val deliveryWithCost = calculateDelivery(200.0)
    println("Стоимость доставки с заданной стоимостью: $deliveryWithCost")

    // Пример без указанной стоимости доставки (используется значение по умолчанию)
    val deliveryWithDefaultCost = calculateDelivery(null)
    println("Стоимость доставки по умолчанию ($50): $deliveryWithDefaultCost")
}
