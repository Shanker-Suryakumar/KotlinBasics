package com.kotlin.tutorials

private class privateExample {
    private val i = 1
//    private val doSomething()
//    {
//    }
}

open class V() {
    protected val i = 1
}

class S : V() {
    fun getValue() : Int {
        return i
    }
}

class internalExample {
    internal val i = 1
    internal fun doSomething() {
    }
}

class publicExample {
    val i = 1
    fun doSomething() {
    }
}