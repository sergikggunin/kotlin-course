package org.example.lesson17.exercise2

class KeyValueMaterials : Materials() {
    fun addKeyValuePairs(pairs: Map<String, String>) {
        val tempList = extractMaterial().toMutableList()  // Сохраняем текущее содержимое
        pairs.forEach { (key, value) ->
            tempList.add(0, key)   // Ключ добавляется в начало
            tempList.add(value)    // Значение добавляется в конец
        }
        addAllToContainer(tempList)
    }
}
