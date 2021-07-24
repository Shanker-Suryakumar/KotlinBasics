package com.kotlin.tutorials

fun main(args: Array<String>) {
    var x: Int = 10
    println("The value of X is-- " + doubleMe(x))

    println("Example of Break and Continue")
    myLoop@ for (x in 1..10) { // appling the custom label
        if (x == 5) {
            println("I am inside if block with value" + x + "\n-- hence it will close the operation")
            break@myLoop //specifing the label
        } else {
            println("I am inside else block with value" + x)
            continue@myLoop
        }
    }

    println("Example of Break Only Inner for Loop")
    myLoopOuter@ for (v in 1..3) {
        println("Value of v = $v")
        myLoopInner@ for (s in 1..3) {
            println("Value of s = $s")
            if (v == 2 && s == 2) {
                break@myLoopInner
            }
        }
    }

    println("Example of Continue To Skip Value")
    myLoopOuter@ for (v in 1..3) {
        println("Value of v = $v")
        myLoopInner@ for (s in 1..3) {
            if (v == 2 && s == 2) {
                continue@myLoopInner // skips this value and continue to next
            }
            println("Value of s = $s")
        }
    }
}

fun doubleMe(x: Int): Int {
    return 2 * x;
}