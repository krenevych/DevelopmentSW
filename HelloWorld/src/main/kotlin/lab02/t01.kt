package lab02

var dogName: String? = "Bobik"

fun parasit(){
    dogName = null
}

fun main() {

    println("Моя собака = $dogName")
    parasit()

    println("Довжина імені моєї собаки = ${dogName?.length}")

//    if (dogName != null) {
//        println("Довжина імені моєї собаки = ${dogName.length}")
//    } else {
//        println("Довжина імені моєї собаки = null")
//    }

}