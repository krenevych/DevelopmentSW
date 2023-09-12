package lab02

var catName: String? = null

fun main() {
//    catName = "Kuzya"

    println("Мій кіт $catName")
    println("Довжина імені мого кота ($catName) ${(catName?:"Barsik").length}")

    foo(catName)


}

fun foo(bar: String?) {
    bar ?: return

    println("foo is working...")
}