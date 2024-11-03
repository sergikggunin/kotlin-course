package org.example.lesson17.exercise2


class AlternateTopMaterials : Materials() {
    fun addMaterialsToTopAlternately(newMaterials: List<String>) {
        val tempList = mutableListOf<String>()
        val currentMaterials = extractMaterial()  // Извлекаем текущее содержимое
        val maxIndex = maxOf(currentMaterials.size, newMaterials.size)

        for (i in 0 until maxIndex) {
            if (i < newMaterials.size) tempList.add(newMaterials[i])
            if (i < currentMaterials.size) tempList.add(currentMaterials[i])
        }

        addAllToContainer(tempList)
    }
}
