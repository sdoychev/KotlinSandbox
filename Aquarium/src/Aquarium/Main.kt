package Aquarium

fun main(args: Array<String>) {

    buildAquarium()
    makeFish()

}

fun buildAquarium() {

    val myAquarium = Aquarium()
    println("My Aquarium: ${myAquarium.volume} liters.")

    val smallAquarium = Aquarium(20, 15,30)
    println("Small Aquarium: ${smallAquarium.volume} liters.")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("My Aquarium 2: ${myAquarium2.volume} liters.")
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()

}

fun feedFish(fish: FishAction) {
    fish.eat()
}