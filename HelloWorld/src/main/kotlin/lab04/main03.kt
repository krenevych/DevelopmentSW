package lab04

class Employee(
    val firstName: String,
    val lastName: String,
    val position: String,
) {
    fun copy(
        firstName: String = this.firstName,
        lastName: String = this.lastName,
        position: String = this.position,
    ): Employee {
        return Employee(firstName, lastName, position)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false
        if (position != other.position) return false

        return true
    }
    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + position.hashCode()
        return result
    }
    override fun toString(): String {
        return "Employee(firstName='$firstName', lastName='$lastName', position='$position')"
    }
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = position
}

fun main() {
    val employee1 = Employee("Illya", "Kalamurza", "project manager")
//    val employee2 = Employee("Illya", "Kalamurza", "project manager")

//    val employee2 = employee1.copy(firstName = "Andrii")
    val employee2 = employee1.copy(position = "vp")

    println(employee1)
    println(employee2)
    if (employee1 === employee2) {
        println("посилання однакові")
    } else {
        println("посилання різні")
    }

    if (employee1 == employee2) {  // порівняння вмісту об'єктів
        println("Працівники однакові")
    } else {
        println("Працівники різні")
    }

    val (_, lastName ) = employee1
//    println("firstName = $firstName")
    println("lastName  = $lastName")
//    println("position  = $position")
}