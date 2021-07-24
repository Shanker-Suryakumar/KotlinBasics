package com.kotlin.tutorials

fun main(args: Array<String>) {
    val x: Int = 5

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    when (x) {
        1, 2 -> println(" Value of X either 1,2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
}