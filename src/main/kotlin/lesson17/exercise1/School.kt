package org.example.lesson17.exercise1

class School(
    name: String,
    location: String,
    val numberOfStudents: Int
) : EducationalInstitution(name, location) {
    override fun info(): String = "${super.info()}, Количество учеников: $numberOfStudents"
}
