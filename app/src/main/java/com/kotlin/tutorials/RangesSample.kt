package com.kotlin.tutorials

fun main(args: Array<String>) {
    initRange()
}

fun initRange() {
    val i: Int = 2

    for (j in 1..4)
        println(j) //prints "1 2 3 4" in new lines

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("We found your number -- " + i)
    }
}
