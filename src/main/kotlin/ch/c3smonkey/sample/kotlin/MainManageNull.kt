package ch.c3smonkey.sample.kotlin

fun main(args: Array<String>) {
    var nullValue:String? = null
    println(nullValue)


    val l:Int? = nullValue?.length
    println("Length is $l")

    // Java style
    if(l == null){
        println("Java style length is null")
    }

    val message = if(l != null){
        "Lenght: $l"
    } else {
        "l is null"
    }
    println(message)

    val l2 = l ?: -1
    println("The value of l2 is $l2")


    // kotlin.KotlinNullPointerException
    try {
        //  conversion to a non-nullable type.
        // It will throw NullPointerException if the value is null.
        val l3 = l!!
        println("The value of l3 is $l3")
    }catch (e: KotlinNullPointerException){
        println("l3 is null")
    }


}