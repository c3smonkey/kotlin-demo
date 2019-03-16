package ch.c3smonkey.sample.kotlin.dataclass

import java.text.NumberFormat

fun main(args: Array<String>) {

    val clothingItem = ClothingItem("Shirt", "L", 19.95)
    println(clothingItem)

    clothingItem.price = 10.45
    println(clothingItem)

    val clothingItem2 = ClothingItem("M", 2.50)
    println(clothingItem2)
    println("Item type = ${clothingItem2.type}")

    clothingItem2.price = 10.0

    //Locale.setDefault(Locale("de", "CH"))
    val formatter = NumberFormat.getCurrencyInstance()
    println("ClothingItem 2 price is included 10% discount : " +
            "${formatter.format(clothingItem2.price)}")

    val person = Person("Marcel", "Widmer")
    println("That person is ${person.fullName}")



}