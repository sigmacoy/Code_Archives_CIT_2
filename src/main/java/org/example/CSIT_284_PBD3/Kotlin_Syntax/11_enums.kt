package org.example.CSIT_284_PBD3.Kotlin_Syntax

// Fixed constants.
enum class Status{SUCCESS,ERROR}

// SEALED CLASSES
// Restricted class types for states.
sealed class Result
class Success:Result()
class Error:Result()

fun main(){


}