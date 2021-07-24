package com.kotlin.tutorials

fun main(args: Array<String>) {
    // creating an instance of the interface
    var programmer: Human = object : Human {

        override fun think() { // overriding the think method
            println("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}