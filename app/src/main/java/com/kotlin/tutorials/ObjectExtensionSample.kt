package com.kotlin.tutorials

fun main(args: Array<String>) {
    println("Heyyy!!! " + Y.show())
}

class Y {
    companion object {
        fun show(): String {
            return ("You are learning Kotlin.")
        }
    }
}