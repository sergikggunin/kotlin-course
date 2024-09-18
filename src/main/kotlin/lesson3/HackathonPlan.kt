package org.example.lesson3

class HackathonPlan {

}
class BudgetDetails {

    val name: String = "KotlinParty" // Название мероприятия
    val eventDate: String = "28.02.2025" // Дата проведения
    var location: String = "Thailand, Phuket" // Место проведения
    var budget: String = "10000"// Подробный бюджет мероприятия
    var participantCount: Int = 100 // Количество участников
    val duration: String = "04:20" // Длительность хакатона
    val supplierInfo: Map<String, String> = mapOf("Catering" to "Catering Inc.") // Контактная информация и условия соглашений с поставщиками
    var status: Boolean = false // Текущее состояние хакатона (статус)
    val sponsors: List<String> = listOf("Google", "Amazon") // Список спонсоров
    var totalBudget: Double = 2000000.00// Общий бюджет мероприятия
    var internetAccessLevel: Int = 106 // Текущий уровень доступа к интернету мб в секунду
    var logisticsInfo: String = "Transport will be provided by XYZ Logistics" // Информация о транспортировке и распределении ресурсов
    var teamCount: Int = 10 // Количество команд
    var taskList: String = "Список у организатора"  // Перечень задач
    val evacuationPlan: String? = null // План эвакуации (может быть null)
    val availableEquipment: String= "Звук, Телевизор, Стол, Стул" // Список доступного оборудования
    var freeEquipment: String = "Звук, Телевизор, Стол, Стул\""// Список свободного оборудования
    var mealSchedule: String? = null // График питания участников (может быть null)
    val fallbackPlan: String? = null // План мероприятий на случай сбоев (может быть null)
    val experts: List<String> = listOf("John Doe", "Jane Smith") // Список экспертов и жюри
    val feedbackMethods: String = "Через тиндер" // Методы для сбора отзывов
    val privacyPolicy: String = "Standard Privacy Policy" // Политика конфиденциальности
    val privateFeedback: List<String> = listOf() // Приватные отзывы участников и зрителей
    var currentTemperature: Double = 27.0 // Текущая температура в помещении
    var networkPerformance: Boolean = true // Мониторинг производительности сети
    var lightingLevel: Int = 70 // Уровень освещения
    val eventLog: List<String> = listOf("2025-02-28 09:00:00", "Start", "Hackathon started successfully.") // Лог событий мероприятия
    var medicalHelpAvailable: Boolean = true // Доступность медицинской помощи
    val safetyPlans: List<String> = listOf() // Планы и процедуры безопасности
    val eventRegistrationNumber: String = "EVT2025-001" // Регистрационный номер мероприятия
    val maxNoiseLevel: Int = 90 // Максимально допустимый уровень шума
    var noiseIndicator: Boolean = false // Индикатор превышения уровня шума
    var eventFormat: String = "In-person" // Формат мероприятия
    var freeSeats: Int = 120 // Количество свободных мест для отдыха
    val mediaPlan: String = "MediaPlan"// План взаимодействия с прессой (может быть null)
    var projectInfo: List<String> = listOf() // Детальная информация о проектах каждой команды
    var permissionsStatus: Boolean = true // Статус получения разрешений
    var exclusiveAccess: Boolean = true // Открыт ли доступ к эксклюзивным ресурсам
    val partners: List<String> = listOf("Facebook", "Microsoft") // Список партнеров мероприятия
    val report: List<String>? = null // Отчет (может быть null)
    val prizeDistributionPlan: String? = null // План распределения призов (может быть null)
    val emergencyContacts: Map<String, String> = mapOf("Police" to "911") // Контактная информация экстренных служб
    val specialConditions: String = "Wheelchair access available" // Особые условия для участников с ограниченными возможностями
    var participantMood: String = "Excited" // Общее настроение участников
    val hackathonPlan: HackathonPlan = HackathonPlan() // Подробный план хакатона
    var guestName: String? = "Larry Page" // Имя знаменитого специального гостя (может быть null)
    val maxCapacity: Int = 500 // Максимальное количество людей на площадке
    val workHours: Int = 6 // Стандартное количество часов для работы
}
