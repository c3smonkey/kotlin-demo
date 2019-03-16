package ch.c3smonkey.sample.kotlin.lambda

fun main(args: Array<String>) {

    val helloWorld = {
        println("Hello World!")
    }
    helloWorld()
    helloWorld.invoke()

    val sayHello = {
        user: String, age: Int ->
        println("Hello, $user you're $age years old!")
    }
    sayHello("Marcel", 42)

    val states = arrayOf("New York", "New Hampshire", "vermont", "Rhode Island", "Nebraska")
//    val sorted = states.sortedBy { states -> states.length }
    val sorted = states.sortedBy { it.length }
            .filter { it.startsWith("n", true) }

    for (state in sorted){
        println(state)
    }
}
