package lab04

data class Employee2(
    val firstName: String,
    val lastName: String,
    val position: String,
) {
    var salary: Int = 0
}


fun main() {
     val employee1 = Employee2("Illya", "Kalamurza", "project manager")
     val employee2 = employee1.copy()

    employee1.salary = 5_000
    employee2.salary = 500


    println(employee1)
    println(employee2)

    if (employee1 == employee2) {  // порівняння вмісту об'єктів
        println("Працівники однакові")
    } else {
        println("Працівники різні")
    }
}