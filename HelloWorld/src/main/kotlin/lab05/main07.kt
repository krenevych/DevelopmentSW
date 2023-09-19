package lab05

    var employee1: Employee? = Employee().apply {
        firstName = "Maryna"
        lastName = "Kostiuchenko"
        position = "Senior QA"
    }

fun main() {


    val runResult = employee1?.run {
        println(firstName)
        println(lastName)
        println(position)
        "Hello 42"
    }

    println(runResult)

}