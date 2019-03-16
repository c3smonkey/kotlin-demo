package ch.c3smonkey.sample.kotlin.generics

fun main(args: Array<String>) {

    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123456789L, 999999999999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta", "Alpha")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
}