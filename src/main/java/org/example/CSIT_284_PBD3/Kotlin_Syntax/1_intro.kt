package org.example.CSIT_284_PBD3.Kotlin_Syntax

fun main(){
    // 1. VARIABLES ~~~~~~~~~~~~~~~~~~~~~~~~

    // var - mutable
    // val - immutable

    var score = 10
    val appName = "Student App"

    // 2. Data Types ~~~~~~~~~~~~~~~~~~~~~~~~~

    // Int, Double
    // String, Char
    // Boolean

    val age: Int = 21;
    
    // 3. Operators ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    val total = 5 + 3;
    val isEqual = 5 == 3;
}

/* 
In Kotlin, semicolons are optional and generally discouraged. 
The compiler uses line breaks to understand where one instruction ends and the next begins.

BUT:
val x = 10; val y = 20; println(x + y) // Required to separate them

enum class Status {
    SUCCESS, ERROR; // Required semicolon here
    fun isMobile() = true
}

THIS IS BAD
val sum = 10
        + 20 // Compiler thinks this is just "+20" sitting alone

THIS IS GOOD
val sum = 10 + 
          20 // Works perfectly
*/