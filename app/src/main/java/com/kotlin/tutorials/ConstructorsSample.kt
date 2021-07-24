package com.kotlin.tutorials

// first name is read-only as it is declared as “val”, while the field age can be edited
class Person(val firstName: String, var age: Int) {

}

fun main(args: Array<String>) {
    val person1 = Person("Veena.M", 27)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

    val person2 = Person("Shanker.S", 32)
    println("First Name = ${person2.firstName}")
    println("Age = ${person2.age}")

    val Humans = Humans("Yashodha.M", 55)
    println("${Humans.message}" + "${Humans.firstName}" +
            " Welcome to the example of Secondary  constructor, Your Age is-${Humans.age}")
}

// secondary constructor is created using the “constructor” keyword
class Humans(val firstName: String, var age: Int) {
    val message: String = "Hey!!! "

    constructor(name: String, age: Int, message: String) : this(name, age) {
    }
}

// Any number of secondary constructors can be created, however, all of those constructors should call the primary constructor directly or indirectly.
