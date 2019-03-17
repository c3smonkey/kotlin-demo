package ch.c3smonkey.sample.kotlin.coroutines

import kotlinx.coroutines.*

fun main() {
    println("################# Without Coroutine ")
    callRemoteJokeService(amount = 100)
    println("################# Coroutine ")
    callRemoteJokeServiceWithCoroutine(amount = 100)

}

private fun callRemoteJokeService(amount: Int) {
    measureTime {
        val jokes = mutableListOf<String>()
        for (i in 1..amount) {
            jokes += getJoke()
        }
        println("Found ${jokes.size} jokes.")
        println("request from ${getCallerIP()}")
    }
}


private fun callRemoteJokeServiceWithCoroutine(amount: Int) {
    measureTime {
        val jokes = mutableListOf<Deferred<String>>()
        // Start a coroutine
        GlobalScope.launch {
            for (i in 1..amount) {
                jokes += async { getJoke() }
            }
        }
        //
        runBlocking {
            jokes.awaitAll<String>()

        }
        println("Found ${jokes.size} jokes.")
        println("request from ${getCallerIP()}")
    }
}


fun getCallerIP() = java.net.URL("https://api.ipify.org").readText()
fun getJoke() = java.net.URL("http://api.icndb.com/jokes/random").readText()
fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("${(end - start) / 1.0e9} seconds")
}