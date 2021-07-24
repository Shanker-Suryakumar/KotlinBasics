package com.kotlin.tutorials

// As mentioned earlier, Kotlin doesn’t support multiple inheritances,
// however, the same thing can be achieved by implementing more than two interfaces at a time.

interface A {
    fun printMe() {
        println("I am Method of interface A")
    }
}

interface B {
    fun printMeToo() {
        println("I am another Method from interface B")
    }
}

// implements two interfaces A and B
class multipleInterfaceExample : A, B

fun main(args: Array<String>) {
    val obj = multipleInterfaceExample()
    obj.printMe()
    obj.printMeToo()
}