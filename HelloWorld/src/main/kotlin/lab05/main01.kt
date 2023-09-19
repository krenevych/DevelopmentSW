package lab05


fun main() {
    val employee = Employee()
    with(employee) {
        firstName = "Maryna"
        lastName = "Kostiuchenko"
        position = "Senior QA"
        println(firstName)
        println(lastName)
        println(position)
    }

}