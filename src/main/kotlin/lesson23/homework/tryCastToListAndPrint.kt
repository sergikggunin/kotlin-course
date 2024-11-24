package org.example.lesson23.homework

fun tryCastToListAndPrint(data: Any) {
    val list = data as? List<*>
    if (list != null) {
        for (item in list) {
            if (item is String) {
                println(item)
            } else {
                println("Не строка: $item")
            }
        }
    } else {
        println("Ошибка: объект не является списком.")
    }
}
