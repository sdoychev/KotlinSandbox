import java.util.*

fun main(args: Array<String>) {
    feedFish()
}

fun feedFish() {
    val day = getRandomDay()
    val food = getFishFood(day)
    println("Today is $day and the fish are fed with $food")
}

fun getRandomDay(): String {
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return daysOfWeek[Random().nextInt(7)]
}

fun getFishFood(day: String): String {
    return when (day) {
        "Monday" -> "Mondonuts"
        "Tuesday" -> "Tunas"
        "Wednesday" -> "Weeds"
        "Thursday" -> "Thurtles"
        "Friday" -> "Beer"
        "Saturday" -> "Rugby"
        "Sunday" -> "Suns"
        else -> "Defaulty"
    }
}
