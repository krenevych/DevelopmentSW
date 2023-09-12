package lab02

fun main() {
    println("Before")
    try {
        throw IndexOutOfBoundsException("Hello!")
    } catch (e: IndexOutOfBoundsException){
        e.printStackTrace()
    }
    println("After")
}