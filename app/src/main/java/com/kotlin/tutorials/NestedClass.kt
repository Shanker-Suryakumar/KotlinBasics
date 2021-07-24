package com.kotlin.tutorials

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // calling nested class method
    print(demo)
}
class Outer {
    class Nested {
        fun foo() = "Hello Veena.M Welcome To Mysore."
    }
}