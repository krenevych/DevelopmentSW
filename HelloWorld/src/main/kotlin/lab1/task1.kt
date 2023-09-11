package lab1

/*
* Написати програму для обчислення добутку
* двох натуральних чисел, використовуючи лише
* операцію додавання.
*/

fun main() {
    val a = 5
    val b = 6

    var result = 0

//    for (i in 1..a) {
//        result += b
//    }

//    (1..a).forEach { result += b }

//    (1..a).forEachIndexed { index, it ->
//        println(index)
//        result += b
//    }

    repeat(a) { result += b }

    println(result)
}