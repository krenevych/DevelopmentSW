package lab05

var employee: Employee? = null


fun main() {
    employee = Employee().apply {
        firstName = "Maryna"
        lastName = "Kostiuchenko"
        position = "Senior QA"
    }

    val var1: String? = employee?.let {
        println(it.firstName)
        println(it.lastName)
        println(it.position)
        "hello"
    }
    println(var1)
}