package Spice

fun main(args: Array<String>) {
    val curry = Curry("Curry", "mild")
    println("${curry.name} has color ${curry.color}.")

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("$name with spiciness $spiciness.")
    }

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        grind()
    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind() {}
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}