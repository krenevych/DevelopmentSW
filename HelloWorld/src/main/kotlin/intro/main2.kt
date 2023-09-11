package intro

import java.util.*

fun main() {

//    1. На вхід подається дійсне число. Вивести його з n знаками після коми.

//    2. На вхід подається набір чисел розділених одним або декількома пропусками.
//    Потрібно створити масив (список) цих чисел
//     val x = readln()  ///  12    234    12   443.4  (подивитися фунцію map)

    val rounded = String.format(Locale.US, "%.2f", 34.9)
    println(rounded)

    val x = "  12    234    12   443.4  "

    val stringList = readln()
        .trim()
        .split("\\s+".toRegex())
        .map {
            it.toFloat()
        }
    println(stringList)


}

