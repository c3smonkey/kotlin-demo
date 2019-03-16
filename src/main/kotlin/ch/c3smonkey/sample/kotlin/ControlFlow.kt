package ch.c3smonkey.sample.kotlin

fun main(args: Array<String>) {

    var myInt = 199
    val anInt = 1

    // Java
    // int lowest = (a < b) ? a : b;
    // Kotlin
    val lowest = if (myInt < anInt) myInt else anInt
    println("The lowset value is $lowest")

    // IF
    val temp = 80
    val isAirConditionerOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")


    // WHEN
    val burgersOrdered = 8
    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Not sure")
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

    // For
    for (item in 1..10) {
        //  item++ don't work
        println("Item value is: $item")
    }
    for (ch in "biscuit") {
        println(ch)
    }

    // advanced loops
    //So when we run this code, we get the numbers from 10 to 20 by twos printed
    // print index
    println()
    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        print("${++ndx}) $item, ")
    }
    println()

    // print with index also without own var:
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index + 1}) $item, ")
    }
    println()

    var myArray = arrayListOf(10, 20, 30, 40, 50)
    // Then we have to say .indices, 'cause array by itself doesn't have an iterator
    for(item in myArray.indices){
        println("At index $item is ${myArray[item]} ")
    }
    println()

}