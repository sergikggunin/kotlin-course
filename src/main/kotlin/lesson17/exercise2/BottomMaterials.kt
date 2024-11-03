package org.example.lesson17.exercise2

class BottomMaterials : Materials() {
    fun addMaterialToBottom(material: String) {
        addToContainer(0, material) // Вставляем элемент на индекс 0
    }
}
