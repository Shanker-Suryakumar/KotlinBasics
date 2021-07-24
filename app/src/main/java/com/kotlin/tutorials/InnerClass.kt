package com.kotlin.tutorials

fun main(args: Array<String>) {
    val demo = OuterClass().NestedClass().fooMsg() // calling nested class method
    println(demo)
}

class OuterClass {
    private val welcomeMessage: String = "Hello Veena.M Welcome To Mysore."

    inner class NestedClass {
        fun fooMsg() = welcomeMessage
    }
}