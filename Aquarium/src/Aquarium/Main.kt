package Aquarium

import Practice.SimpleSpice
import Practice.Spice

fun main(args: Array<String>) {

    buildAquarium()

}

fun buildAquarium() {

    val myAquarium = Aquarium()
    println("My Aquarium: ${myAquarium.volume} liters.")

    val smallAquarium = Aquarium(20, 15,30)
    println("Small Aquarium: ${smallAquarium.volume} liters.")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("My Aquarium 2: ${myAquarium2.volume} liters.")
}