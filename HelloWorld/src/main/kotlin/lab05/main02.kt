package lab05


fun main() {
    val employee = Employee()
        .apply {
            firstName = "Maryna"
            lastName = "Kostiuchenko"
            position = "Senior QA"
        }

    with(employee) {
        println(firstName)
        println(lastName)
        println(position)
    }

}