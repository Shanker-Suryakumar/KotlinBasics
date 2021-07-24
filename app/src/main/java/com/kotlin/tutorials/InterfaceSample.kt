package com.kotlin.tutorials

interface ExampleInterface {
    var myVar: Int            // abstract property
    fun absMethod(): String    // abstract method

    fun hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }
}

class InterfaceImp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "
}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    println("Calling hello(): ")
    obj.hello()

    println("Message from the Website-- ")
    println(obj.absMethod())
}