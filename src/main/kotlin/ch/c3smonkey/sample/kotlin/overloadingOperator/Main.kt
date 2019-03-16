package ch.c3smonkey.sample.kotlin.overloadingOperator

fun main(args: Array<String>) {

    val p1 = Postition(200, 100)
    val p2 = Postition(1000, 2000)
    val p3 = p1 + p2

    println(p3)
}