package com.kotlin.tutorials

fun main(args: Array<String>) {
    val itemsOne = listOf(1, 2, 3, 4)

    for (i in itemsOne) println("values of the array " + i)

    val itemsTwo = listOf(1, 22, 83, 4)

    for ((index, value) in itemsTwo.withIndex()) {
        println("the element at $index is $value")
    }
}