package ch.c3smonkey.sample.kotlin.destructuring

import ch.c3smonkey.kotlin.tutorial.overloadingOperator.Postition

fun main(args: Array<String>) {
    val p1 = Postition(200, 100)
    println("Postion 1 = $p1")
    val p2 = Postition(1000, 2000)
    println("Postion 2 = $p2")
    val p3 = p1 + p2
    println("Postion 3 = $p3")

    //Destructuring is a way for us to pull just the variables we want from a
    // more complicated object.
    // Let's take a look at the position data class
    // TODO is this like Dozer Mapper ?
    val (xPosition, yPosition) = p1
    println("xPostision = $xPosition, yPosition = $yPosition")
    println("c1 = ${p1.component1()}")

    showComponents()
}

fun showComponents(){
    val myPoint = Point(5000, 500, 6000)
    val(myX, myY, myZ) = myPoint
    println("myX + $myX, myY = $myY, myZ = $myZ")

}

class Point(val x: Int, val y: Int, val z: Int) {
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z

}
