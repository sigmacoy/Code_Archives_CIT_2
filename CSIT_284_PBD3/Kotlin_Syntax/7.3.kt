package org.example.CSIT_284_PBD3.Kotlin_Syntax

abstract class Shape {
    abstract fun area(): Double
}

// Interfaces - Defines behaviors without implementation.
interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() = println("Clicked")
}

// Data Classes - Automatically generates useful functions.
//  - Special class for storing data.
data class User(val name: String, val age: Int)

// Object Keyword (Singleton) - Used when only one instance is needed.
object Database {
    fun connect() = println("Connected")
}

class MathUtil {
    companion object {
        fun add(a: Int, b: Int) = a + b
    }
}

// Nested and Inner Classes
class Outer {
    class Nested {
        fun hello() = println("Hello")
    }
}

fun main(){
    // Abstract Classes
    // Cannot be instantiated directly.

    // Companion Object (Static Alternative)
    println(MathUtil.add(2,3))

    // NULL SAFETY
    var name: String? = null
    println(name?.length ?: 0)


}