package org.example.lesson17.exercise1

open class EducationalInstitution(val name: String, val location: String) {
    open fun info(): String = "Учебное заведение: $name, Расположение: $location"
}
