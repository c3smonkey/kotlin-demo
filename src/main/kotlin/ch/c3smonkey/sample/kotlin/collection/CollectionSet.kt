package ch.c3smonkey.sample.kotlin.collection

fun main(args: Array<String>) {

    val colorList = listOf("Red", "Green", "Blue")
    println(colorList)

    println("Number of colors: ${colorList.size}")
    println(colorList::class.simpleName)

    val colorList2 = mutableListOf<String>()
    colorList2.add("Red")
    colorList2.add("Greed")
    colorList2.add("Blue")
    println(colorList2)

    colorList2.sort()
    println(colorList2)

    val sortedDescending = colorList2.sortedDescending()
    println(sortedDescending)

    colorList2.removeAt(0)
    println(colorList2)

    colorList2.remove("Red")
    println(colorList2)

}