package lab02

var horseName: String? = null

fun main() {
    println("Мій кінь = $horseName")
    println("Довжина імені мого коня = ${horseName!!.length}")
}