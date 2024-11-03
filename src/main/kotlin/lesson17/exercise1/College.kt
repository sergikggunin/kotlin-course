package org.example.lesson17.exercise1

class College(
    name: String,
    location: String,
    val degreePrograms: List<String>
) : EducationalInstitution(name, location) {
    override fun info(): String = "${super.info()}, Программы обучения: ${degreePrograms.joinToString(", ")}"
}
