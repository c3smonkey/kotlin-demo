package ch.c3smonkey.sample.kotlin

@Deprecated("Use the Animal class instead", ReplaceWith("Dog"))
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName) {
        println("Creating a person named $firstName $middleName $lastName")
    }
}