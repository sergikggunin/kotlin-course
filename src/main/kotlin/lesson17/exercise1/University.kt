package org.example.lesson17.exercise1


class University(
    name: String,
    location: String,
    val faculties: List<String>
) : EducationalInstitution(name, location) {
    override fun info(): String = "${super.info()}, Факультеты: ${faculties.joinToString(", ")}"
}
