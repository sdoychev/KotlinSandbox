import java.util.*

fun main(args: Array<String>) {
    feedFish()
}

fun feedFish() {
    val day = getRandomDay()
    val food = getFishFood(day)
    println("Today is $day and the fish are fed with $food.")

    if (shouldChangeWater(day)) {
        println("Change the water today!")
    }

    // call dirty processor
    dirtyProcessor()
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

    fun isTooHot(temperature: Int) = temperature > 30
    fun isTooDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    return when {
        isTooHot(dirty) -> true
        isTooDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

var dirty = 20
fun feedFish(dirty: Int) = dirty + 20
val waterFilter: (Int) -> Int = {
    dirty -> dirty / 2
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    println("Dirty before processing: $dirty.")
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) {dirty ->
        dirty + 50
    }
    println("Dirty after processing: $dirty.")
}