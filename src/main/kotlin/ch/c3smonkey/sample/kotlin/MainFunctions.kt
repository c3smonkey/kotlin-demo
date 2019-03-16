package ch.c3smonkey.sample.kotlin

import ch.c3smonkey.sample.kotlin.Constants.Companion.RED

fun main(args: Array<String>) {
    println("the color is $RED")

    val num1 = 4.0
    val num2 = 3.5

    val result = addValues(num1, num2)
    println("the result is  $result")

    // if don`t care about the order of the declarations
    val result2 = addValues(param2 = num2, param1 = num1)
    println("the result is  $result2")

    //optional parameters
    val resultCalcPlus = calcValues(num1,num2,"+")
    println("the result is $resultCalcPlus")


    val resultCalcMinus = calcValues(num1,num2,"-")
    println("the result is $resultCalcMinus")

    val resultCalcDefault = calcValues(num1,num2)
    println("the result is $resultCalcDefault")

    changeSomething(num1)

    val sum = addValues(1, 3, 5, 7)
    println("sum=$sum")

    

}

fun addValues(param1: Double, param2: Double): Double {
    return param1 + param2
}

fun calcValues(param1: Double, param2: Double, op: String = "+"): Double {
    if (op.equals("+")) {
        return param1 + param2
    } else if (op.equals("-")) {
        return param1 - param2
    } else {
        return -1.0
    }
}

fun changeSomething(param: Double){
    var copy = param
    copy++
    println("copy is $copy")
}

fun addValues(vararg numbers: Int) : Int{
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result

}