package Aquarium

fun main(args: Array<String>) {

    buildAquarium()
    makeFish()

    highOrderFunction()
}

fun highOrderFunction() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    print(numbers.divisibleBy { it.rem(3) })

}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
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