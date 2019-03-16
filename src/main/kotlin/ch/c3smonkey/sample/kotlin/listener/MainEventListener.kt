package ch.c3smonkey.sample.kotlin.listener

fun main(args: Array<String>) {
    val stateful = StatefulClass(object : ClickListener {
        override fun onClick(event: ClickEvent) {
            println("Click at ${event.x}, ${event.y}")
        }
    })

    println("Listener initialized")
    stateful.clickMe(3,10)
    stateful.clickMe(45,55)
}

class ClickEvent(val x: Int, val y: Int)

interface ClickListener {
    fun onClick(event: ClickEvent)
}


class StatefulClass(listener: ClickListener) {
    private var _clickListener: ClickListener? = listener

    fun clickMe(x: Int, y: Int) {
        _clickListener?.onClick(ClickEvent(x, y))
    }
}