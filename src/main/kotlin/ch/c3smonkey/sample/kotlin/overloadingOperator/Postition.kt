package ch.c3smonkey.sample.kotlin.overloadingOperator

data class Postition(var x: Int, var y: Int) {

    operator fun plus(other: Postition): Postition {
        return Postition(x + other.x, y + other.y)
    }
}