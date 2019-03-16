package ch.c3smonkey.sample.kotlin.inter

fun main(args: Array<String>) {

    val buster: Dog = Retriever()
    buster.speak()
    makeItTalk(buster)
    reportBreed("Buster", buster)

    val busterCatMix = RetrieverCatMix()
    makeItTalkWithAMixBreed(busterCatMix)
}



fun makeItTalk(dog: Dog) {
    dog.speak()
}

fun reportBreed(name: String, dog: Dog) {
    println("$name is a ${dog::class.simpleName}")
    println("This dog's fur is ${dog.fur}")

}


interface Dog {
    var fur: String
    fun speak(){
        println("Woof!")
    }
}

interface Cat {
    var fur: String
    fun speak(){
        println("Meow!")
    }
}

class Retriever : Dog {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
        super.speak()
    }
}




fun makeItTalkWithAMixBreed(dog: RetrieverCatMix) {
    dog.speak()
}
class RetrieverCatMix : Dog, Cat {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
        super<Dog>.speak()
        super<Cat>.speak()
    }
}