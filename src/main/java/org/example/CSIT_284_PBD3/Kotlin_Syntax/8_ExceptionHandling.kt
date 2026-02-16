package org.example.CSIT_284_PBD3.Kotlin_Syntax

fun main(){
    try {
        val x = 10/0;
    } catch(e: Exception){
        println("Error");
    }

}