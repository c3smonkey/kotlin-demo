package ch.c3smonkey.sample.kotlin.collection

fun main(args: Array<String>) {
    val array1 = arrayOf("Red", "Green", "Blue")
    println("----")
    for (element in array1) {
        println(element)
    }

    var mixed = arrayOf("Red", 12)
    println("----")
    for (value in mixed) {
        println(value)
    }

    var nulls = arrayOfNulls<String>(3)
    println("----")
    for (value in nulls) {
        println(value)
    }

    nulls[0] = "Red"
    nulls[1] = "Green"
    nulls[2] = "Blue"
    println("----")
    for (value in nulls) {
        println(value)
    }

    var intArray = intArrayOf(4, 1, 3, 2)
    intArray.sort()
    println("----")
    for (value in intArray) {
        println(value)
    }

    println("----")
    for (value in intArray.sortedDescending()) {
        println(value)
    }
}
