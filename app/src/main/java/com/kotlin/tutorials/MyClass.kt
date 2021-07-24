package com.kotlin.tutorials

class MyClass {
    // property (data member)
    private var name: String = "Hello Veena.M"

    // member function
    fun printMe() {
        println("This will print a message: $name")
    }
}

fun main(args: Array<String>) {
    val objMyClass = MyClass() // create objMyClass object of MyClass class
    objMyClass.printMe()
}