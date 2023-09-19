package lab06_enum_classes

enum class Season(val averageTemp: Int,
    val nameUkr: String) {
    WINTER(-10, "Зима"),
    SPRING(10, "Весна"),
    SUMMER(27, "Літо"),
    AUTUMN(12, "Осінь"),;

    override fun toString(): String {
        return "Season(averageTemp=$averageTemp, nameUkr='$nameUkr')"
    }

//    override fun toString(): String {
//        return "Season(name=$name," +
//                " averageTemp=$averageTemp)"
//    }



}

var month: Int = 3
fun main() {

    val season: Season? = when (month) {
        in (1..2) + 12 -> Season.WINTER
        in 3..5 -> Season.SPRING
        in 6..8 -> Season.SUMMER
        in 9..11 -> Season.AUTUMN
        else -> null
    }

    println(season)
    println(season?.name)
    println(season?.averageTemp)

    for (season in Season.entries) {
        println(season)
    }

}