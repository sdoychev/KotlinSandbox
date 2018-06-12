import java.util.*

fun main(args: Array<String>) {
    feedFish()
}

fun feedFish() {
    val day = getRandomDay()
    val food = getFishFood(day)
    println("Today is $day and the fish are fed with $food")

    if (shouldChangeWater(day)) {
        println("Change the water today!")
    }
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

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return true
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}