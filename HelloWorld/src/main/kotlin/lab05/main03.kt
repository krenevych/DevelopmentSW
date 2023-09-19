package lab05


fun main() {
    val employee = Employee()
        .apply {
            firstName = "Maryna"
            lastName = "Kostiuchenko"
            position = "Senior QA"
        }

    println(employee)

    val withResult = with(employee) {
        println(firstName)
        println(lastName)
        println(position)
        "Hello"
    }

    println(withResult)

}