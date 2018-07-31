package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
}

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}