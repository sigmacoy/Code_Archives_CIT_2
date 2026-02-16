package org.example.CSIT_284_PBD3.Kotlin_Syntax/*

() -> Unit, unit is considered as an Object.
No input, no output

(Int) -> Int
One input, one output

(Int, Int) -> Boolean
Two inputs, Boolean output

Java void: A "nothing" that breaks the rules of Generics.
Kotlin Unit: A "nothing" that follows the rules of Generics.

*/

fun greet(name: String = "Guest"){
    println("Hello $name");
}

fun main(){
    greet("Macoy");
}