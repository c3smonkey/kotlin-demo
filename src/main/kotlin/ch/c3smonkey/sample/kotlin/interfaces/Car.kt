package ch.c3smonkey.sample.kotlin.interfaces

class Car : Vehicle {

    override val MakeName: String = "Ford"

    override fun getDoors(): Int {
        return 5
    }

}