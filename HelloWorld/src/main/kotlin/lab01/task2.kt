package lab01

import kotlin.random.Random


fun main() {
//    val list = mutableListOf<Int>()
//    repeat(100) {
//        list += Random.nextInt(-100, 101)
//    }

//    val list = List(100) { Random.nextInt(-100, 101) }
    val array = Array(100) { Random.nextInt(-100, 101) }
//    val positive = array.filter { it > 0 }
//    val positive5 = positive.filter { it % 5 == 0 }
//    val positive5Square = positive5.map { it * it }
//    val sortedDescending = positive5Square.sortedDescending()
//    val stringList = sortedDescending.map { it.toString() }
//
//    val result = stringList.fold("") { result, currentItem ->
//        "$result$currentItem "
//    }.trim()

    val result = array
//        .filter { it > 0 }
//        .filter { it % 5 == 0 }
        .filter { it > 0 && it % 5 == 0 }
        .map { it * it }
        .sortedDescending()
//        .map { it.toString() }
        .fold("") { result, currentItem ->
            "$result$currentItem "
        }
        .trim()

    println("|$result|")


        val col1 = array
        .filter { it > 0 && it % 5 == 0 }
        .map { it * it }
        .sortedDescending()

    var result1 = ""
    col1.forEach { currentItem: Int ->
        result1 = "$result$currentItem "
    }
    result1.trim()


//        .fold("") { result, currentItem ->
//            "$result$currentItem "
//        }
//        .trim()

}