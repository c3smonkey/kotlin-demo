package ch.c3smonkey.sample.kotlin.coroutines


fun main() {
    measureTime {
        val jokes = processJoke(amount = 100)
        println("Found ${jokes.size} jokes.")
        println("request from ${getCallerIP()}")
    }
}

private fun processJoke(amount: Int): MutableList<String> {
    val jokes = mutableListOf<String>()
    for (i in 1..amount) {
        jokes += getJoke()
    }

    return jokes
}


fun getCallerIP() = java.net.URL("https://api.ipify.org").readText()
fun getJoke() = java.net.URL("http://api.icndb.com/jokes/random").readText()
fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("${(end - start) / 1.0e9} seconds")
}