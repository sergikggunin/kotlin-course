package org.example.lesson17.exercise2

class AlphabeticalMaterials : Materials() {
    fun addMaterialAlphabetically(material: String) {
        addAllToContainerSorted(listOf(material))
    }
}
