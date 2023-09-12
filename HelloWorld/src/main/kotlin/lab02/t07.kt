package lab02

import kotlin.random.Random

fun getRandom(bound: Int) = Random.nextInt(0, bound)

@Throws(ArithmeticException::class)
fun div(a: Int, b: Int) = a / b


fun main() {
    val a = 10

    try {
        val res = div(a, getRandom(1))
        println("результат = $res")

        val array = arrayOf(1, 3)
        println(array[1])
    } catch (e: ArithmeticException) {
        println("Відбулося ділення на нуль")
        e.printStackTrace()
    } catch (e: IndexOutOfBoundsException) {
        println("Вихід за межі масиву")
        e.printStackTrace()
    }
//    } catch (e: RuntimeException){
//        e.printStackTrace()
//    }
    finally {
        println("Finaly: звільняємо ресурси")
    }

    println("Кінець програми")


}