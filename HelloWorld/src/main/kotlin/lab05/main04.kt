package lab05

class Corporation {

    val employee = Employee()
        .apply {
            firstName = "Maryna"
            lastName = "Kostiuchenko"
            position = "Senior QA"
        }.also {
//            it.firstName = "Maryna"
//            it.lastName = "Kostiuchenko"
//            it.position = "Senior QA"

            println(it)
        }


}

fun main() {
    val corporation = Corporation()
}