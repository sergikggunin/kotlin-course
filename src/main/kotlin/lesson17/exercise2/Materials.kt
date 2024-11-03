package org.example.lesson17.exercise2

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    protected fun addToContainer(material: String) {
        materials.add(material)
    }

    protected fun addToContainer(index: Int, material: String) {
        materials.add(index, material)
    }

    protected fun addAllToContainer(newMaterials: List<String>) {
        materials.addAll(newMaterials)
    }

    protected fun addAllToContainerSorted(newMaterials: List<String>) {
        materials.addAll(newMaterials)
        materials.sort()
    }
}
