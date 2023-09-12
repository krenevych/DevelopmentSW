package lab02

var a1: Int? = null
var a2: Int? = null


fun main() {
//    val res = a1 + a2
//    a1 = 3
    a2 = 4
    val res = a1?.plus(a2 ?: 0)

    println(res)
}