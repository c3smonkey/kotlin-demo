package ch.c3smonkey.sample.kotlin

fun main(args: Array<String>) {
    val states = arrayOf("CA", "OR", "WA")

    var counter = 0

    printHeader("While loop")
    while (counter < states.size){
        println("State = ${states.get(counter)}")
        counter++
    }


    printHeader("Do while loop")
    counter = 0
    do {
        println("state = ${states.get(counter)}")
        counter++
    }while (counter < states.size)


}

private fun printHeader(label: String) {
    println("******************")
    println(label)
    println("******************")

}