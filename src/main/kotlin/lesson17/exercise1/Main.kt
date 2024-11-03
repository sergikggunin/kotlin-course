package org.example.lesson17.exercise1

fun main() {
    // Тестируем Геометрические Фигуры
    val circle = Circle(5.0)
    println("Фигура: ${circle.name}, Площадь: ${circle.area()}, Периметр: ${circle.perimeter()}")

    val triangle = Triangle(base = 3.0, height = 4.0, sideA = 3.0, sideB = 4.0, sideC = 5.0)
    println("Фигура: ${triangle.name}, Площадь: ${triangle.area()}, Периметр: ${triangle.perimeter()}")

    val quadrilateral = Quadrilateral(length = 5.0, width = 6.0)
    println("Фигура: ${quadrilateral.name}, Площадь: ${quadrilateral.area()}, Периметр: ${quadrilateral.perimeter()}")

    // Тестируем Учебные Заведения
    val school = School(name = "Школа №1", location = "Москва", numberOfStudents = 500)
    println(school.info())

    val college = College(name = "Колледж Искусств", location = "Санкт-Петербург", degreePrograms = listOf("Дизайн", "Музыка", "Театр"))
    println(college.info())

    val university = University(name = "Университет IT", location = "Новосибирск", faculties = listOf("Факультет ИТ", "Факультет Математики"))
    println(university.info())

    // Тестируем Мебель
    val table = Table(material = "Дерево", color = "Коричневый", shape = "Круглый")
    println(table.description())

    val chair = Chair(material = "Металл", color = "Чёрный", hasArmrest = true)
    println(chair.description())

    val officeChair = OfficeChair(material = "Пластик", color = "Серый", hasArmrest = true, hasWheels = true)
    println(officeChair.description())

    val bed = Bed(material = "Металл", color = "Белый", size = "Queen")
    println(bed.description())
}
