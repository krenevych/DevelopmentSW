data class Employee(
    val firstName: String,
    val lastName: String,
    val position: String,
) {
    fun hello(){
        println("Hello from $firstName $lastName")
    }
}


fun main() {
    val employee1 = Employee("Bogdan", "Vasin", "engineer")
    val employee2 = Employee("Bogdan", "Vasin", "engineer")

    println(employee1)
    println(employee2)

    if (employee1 == employee2) {  // порівняння вмісту об'єктів
        println("Працівники однакові")
    } else {
        println("Працівники різні")
    }

    if (employee1 === employee2) {  // порівняння за посиланням
        println("Посилання на об'єкти однакові")
    } else {
        println("Посилання на об'єкти різні")
    }


    println("employee1 hash = " + employee1.hashCode())
    println("employee2 hash = " + employee2.hashCode())

    employee2.hello()
}