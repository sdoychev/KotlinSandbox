package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"

    override fun eat() {
        println("Sharky munch muuunch")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("Golden yellow banana eaten")
    }
}

interface FishAction {
    fun eat()
}