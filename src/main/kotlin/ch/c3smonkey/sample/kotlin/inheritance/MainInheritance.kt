package ch.c3smonkey.sample.kotlin.inheritance

fun main(args: Array<String>) {

    val x:Any = Any()
    println(x)

    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(36)
    println(sub)

    println(sup.multiply(10))
    println(sub.multiply(10))

}


open class SuperClass(anInt:Int){
    protected val _anInt = anInt

    override fun toString(): String {
        return "${this::class.simpleName}{anInt: $_anInt}"
    }

    open fun multiply(factor: Int): Int {
        return _anInt * factor
    }
}

class SubClass(anInt: Int) : SuperClass(anInt){
    // override the super class method
    override fun multiply(factor: Int): Int {
        return super.multiply(factor) * factor
    }
}