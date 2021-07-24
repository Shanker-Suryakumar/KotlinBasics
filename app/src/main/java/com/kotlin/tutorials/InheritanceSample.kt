package com.kotlin.tutorials

// Everything in Kotlin is by default final, hence, we need to use the keyword “open” in front of the class declaration to make it allowable to inherit.
open class ABC {
    fun think() {
        println("Hey!! i am thiking ")
    }

    // To override this method in class EFG we need to make it open
    open fun travelling() {
        println("Hey!! i am travelling ")
    }
}

class BCD : ABC() { // inheritence happend using default constructor
}

// Now, what if we want to override the think() method in the child class.
class EFG : ABC() { // inheritance happens using default constructor
    override fun travelling() {
        println("I Am from Child")
    }
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()

    var b = EFG()
    b.travelling()
}

