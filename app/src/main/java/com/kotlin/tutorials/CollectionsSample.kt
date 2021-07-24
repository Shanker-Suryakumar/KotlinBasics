package com.kotlin.tutorials

fun main(args: Array<String>) {
    sampleLists()
    listElements()
}

fun sampleLists() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyView: List<Int> = numbers                  // immutable list
    println("my mutable list--" + numbers)        // prints "[1, 2, 3]"
    numbers.add(4)
    println("my mutable list after addition --" + numbers)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)
//    readOnlyView.clear()    // ⇒ does not compile // gives error
}

fun listElements() {
    val items = listOf(1, 2, 3, 4)
    println("First Element of our list----" + items.first())
    println("Last Element of our list----" + items.last())
    println("Even Numbers of our List----" + items.filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are" + strings)
}