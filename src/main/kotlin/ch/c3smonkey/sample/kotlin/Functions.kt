package ch.c3smonkey.sample.kotlin

fun main(args: Array<String>) {


    println("[myFunction] 10 + 20 = ${myFunction(10, 20)}")
    println("[myFunction1] 10 + 20 = ${myFunction1(10, 20)}")
    println("[myFunction2] 10 + 20 = ${myFunction2(10, 20)}")
    println("[myDefault] 10 + 20 = ${myDefault()}")

    println("--------- myDefault2() ------------")
    myDefault2()

    println("--------- myDefault2(1,2,Hello) ------------")
    myDefault2(1, 2, "Hello")

    println("--------- myDefault2(message='Greetings') ------------")
    // Named argument sample
    myDefault2(message = "Greetings")
}


fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}
//an expression body function
fun myFunction1(param1: Int, param2: Int): Int = param1 + param2

//an expression body function without return type
//Because both parameter one and parameter two are integers
fun myFunction2(param1: Int, param2: Int) = param1 + param2

// with default values
fun myDefault(param1: Int = 10, param2: Int = 20) = param1 + param2

fun myDefault2(param1: Int = 10, param2: Int = 20, message: String = "Default message"): Int {
    println(message)
    return param1 + param2
}
