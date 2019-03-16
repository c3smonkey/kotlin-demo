package ch.c3smonkey.sample.kotlin.collection

import ch.c3smonkey.sample.kotlin.dataclass.ClothingItem


fun main(args: Array<String>) {

    val colorSet = mutableSetOf("Red", "Green", "Blue")
    println(colorSet)

    colorSet.add("Purple")
    colorSet.remove("Green")
    println(colorSet)

    val colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    println(colorList)

    // create duplicate value
    colorList.add("Purple")
    println(colorList)

    // remove the duplicate value with convert to a mutableSet
    val newSet = colorList.toMutableSet()
    println(newSet)

    // kotlin data classes also don`t have duplicate
    val itemSet = mutableSetOf<ClothingItem>()
    itemSet.add(ClothingItem("Shirt", "M", 14.99))
    itemSet.add(ClothingItem("Shirt", "M", 14.99))
    // only one value will be in de itemSet
    println("$itemSet with size ${itemSet.size}")

    // add a other item now we have 2 items in the Set
    itemSet.add(ClothingItem("Shirt", "L", 14.99))
    println("$itemSet with size ${itemSet.size}")



}