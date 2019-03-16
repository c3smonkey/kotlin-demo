package ch.c3smonkey.sample.kotlin

fun main(args:Array<String>){

    var aString = "Hello!"
    println(aString)

    val emptyString = String()
    println(emptyString)

    val charArray = aString.toCharArray()
    println(charArray.toList())

    val byteArray = aString.toByteArray()
    println(byteArray.toList())


    aString += " and Welcome!"
    println(aString)

    val len  =  aString.length
    for (c in aString) {
        println(c)
    }

    val p = aString.indexOf("W")
    val sub = aString.substring(p)
    println(sub)

    val string2 = aString.toUpperCase()
    val match = aString.equals(string2)
    println("Do they match $match")

    println("Do they match with ignore uppercase ${aString.equals(string2, true)}")




    // StringBuilder
    val builder = StringBuilder("To be or not to be \n")
            .append("that is the question\n")
            .append("Whatever...")

    val result = builder.toString()
    println(result)

}