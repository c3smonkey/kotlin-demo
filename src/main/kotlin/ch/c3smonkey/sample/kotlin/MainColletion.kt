package ch.c3smonkey.sample.kotlin

fun main(args: Array<String>) {
    var colors = arrayOf("Res","Green","Blue")
    var values = intArrayOf(1,3,5,7,9)

    printHeader("For each loop")

    for (color in colors) {
        println(color)
    }

    for (value in values) {
        println(value)
    }

    printHeader("For loop with indecies")
    for (i in values.indices) {
        println(values[i])
    }

    for (i in values.indices step 2) {
        println(values[i])
    }

    for (i in 0 ..colors.size -1){
        println(colors[i])
    }
    printHeader("For loop with until")
    for (i in 0 until colors.size){
        println(colors[i])
    }
}

private fun printHeader(label: String) {
    println("******************")
    println(label)
    println("******************")

}