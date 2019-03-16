package ch.c3smonkey.sample.kotlin

object MySingleton {
    var temperatures = arrayOf(80, 76, 90)
    fun getLastTemperature() = temperatures.last()

}

fun main(args: Array<String>) {

    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun printIt(){
            println("Position = ($xPosition, $yPosition)")
        }
    }
    location.printIt()

    location.xPosition = 2000
    location.yPosition = 4000
    location.printIt()


    val temperatures = MySingleton.getLastTemperature()
    println("Last reading = $temperatures degrees")

}