package intro

import kotlin.math.PI
import kotlin.math.sin

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun foo(v: Int, u: Boolean, lambd: (Int) -> Boolean){
    println(v)
    println(u)
    println(lambd(v))
}

fun main() {

    foo(10, false) {
        it > 10
    }

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { it > 0 }
    val negatives = numbers.filter { it < 0 }
    println(positives)

    sin(23.4)
    println( PI)

// [1, 3, 5]
    println(negatives)
// [-2, -4, -6]
}
