package org.example.CSIT_284_PBD3.Kotlin_Syntax// fun ClassName.functionName(): ReturnType {
    // logic here
// }

val String.lastChar : Char
    get() = this[this.length - 1]

fun String?.safeLength(): Int {
    return this?.length ?: 0
}

fun main() {
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     EXTENSION FUNCTIONS
     - extends the functionality of a class by adding new behavior outside the class definition.
     - They allow you to add new functions to an existing class without modifying the original class or using inheritance. 

    Keeps code clean and organized
    Avoids unnecessary inheritance
    Adds reusable utilities
    Improves readability
    Very common in Android development
    */

    // Simple Example — Extending String
    fun String.shout(): String {
        return this.uppercase()
    }
    println("hello".shout())

    // Extension with Parameters
    fun String.addExclamation(times: Int): String {
        return this + "!".repeat(times)
    }
    println("Hi".addExclamation(3))


    fun Int.isEven(): Boolean {
        return this % 2 == 0
    }
    println(4.isEven())
    println(7.isEven())


    // You can also add properties, not only functions.    
    println("Hello".lastChar)

    // for Collections
    fun List<Int>.sumAll(): Int {
        return this.sum()
    }
    println("Sum of all: " + listOf(1,2,3).sumAll())

    // Extension with Nullable Types
    println(null.safeLength())

    
}