package org.example.lesson5

fun calculateSoundIntensity(initialIntensity: Double, attenuationCoefficient: Double?): Double {
    val coefficient = attenuationCoefficient ?: 0.5
    return initialIntensity * coefficient
}

fun main() {
    // Пример с заданным коэффициентом затухания
    val intensityWithCoefficient = calculateSoundIntensity(100.0, 0.7)
    println("Интенсивность звука с коэффициентом 0.7: $intensityWithCoefficient")

    // Пример без указанного коэффициента затухания (используется значение по умолчанию)
    val intensityWithDefaultCoefficient = calculateSoundIntensity(100.0, null)
    println("Интенсивность звука с коэффициентом по умолчанию (0.5): $intensityWithDefaultCoefficient")
}
