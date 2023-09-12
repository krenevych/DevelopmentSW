package lab02

fun monthByNumber(monthNumber: Int): String? = when (monthNumber) {
    1 -> "January"
    2 -> "February"
    3 -> "March"
    4 -> "April"
    5 -> "May"
    6 -> "June"
    7 -> "July"
    8 -> "August"
    9 -> "September"
    10 -> "October"
    11 -> "November"
    12 -> "December"
    else -> null
}

fun season(monthNumber: Int) = when (monthNumber) {
//    in listOf(1, 2, 12) -> "Winter"
    in ((1..2) + 12) -> "Winter"
    in 3..5 -> "Spring"
    else -> null
}

//    return when {
//        monthNumber in listOf(1, 2, 12) ->
//        monthNumber in 3..5 ->
//        else ->
//    }

fun main() {
    var s: String? = "Hello"
//    s = null
    val len = s?.length ?: 0
    val len2 = (s ?: "").length

    val list: MutableList<String?> = mutableListOf<String?>()
    list.add(null)
    list.add("Hello")
    list.add("World")
    list.add("null")
    list.add(null)


    println(list)
}