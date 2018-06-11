import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("Today is " + when(dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "N/A"
    })

}