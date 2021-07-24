package com.kotlin.tutorials

fun main(args: Array<String>) {
    var x: Int = 0
    println("Example of While Loop-- ")

    while (x <= 10) {
        println(x)
        x++
    }

    var y: Int = 0
    do {
        y = y + 10
        println("I am inside Do block--- " + y)
    } while(y <= 50)
}