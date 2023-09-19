package lab04

import Employee

fun main() {
    val employee1 = Employee("Illya", "Kalamurza", "project manager")

    val employee2 = employee1.copy(position = "vp")

    println(employee1)
    println(employee2)
    if (employee1 === employee2) {
        println("посилання однакові")
    } else {
        println("посилання різні")
    }


//    val name = employee1.firstName
//    val lastName = employee1.lastName
//    val position = employee1.position
    val (name, lastName, position) = employee1
    println(name)
    println(lastName)
    println(position)
}