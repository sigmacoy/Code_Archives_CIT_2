package org.example.CSIT_284_PBD3.Kotlin_Syntax

fun main(){
    val age = 18
    if(age >= 18) println("Adult")

    // When - advanced version of if-else

    val day = 1
    when(day){
        1 -> println("Monday")
        else -> println("Other")
    }


    val grade = 75
    when {
        grade < 75 -> println("See you next year")
        grade in 75..79 -> println("Study hard")
        grade in 80..89 -> println("Keep it up")
        else -> println("You're smart!");
    }


    
}