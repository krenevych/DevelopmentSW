package lab02
var a: Int? = 12
lateinit var b: String  // Prohibited

fun main() {
    b = "1234"
    println(b.length)

//    a = null

//    a = a * 2
//    if (a != null){
//        a = a * 2
//    }

    a = a?.times(2)
    val plus = a?.plus(13)

    println(a)
    println(plus)

}