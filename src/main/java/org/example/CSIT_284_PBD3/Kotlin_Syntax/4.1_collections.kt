package org.example.CSIT_284_PBD3.Kotlin_Syntax

fun main(){
    // Arrays
    val numbers = arrayOf(1, 2, 3);

    // Collections

    // List - Ordered
    // Set - Unique
    // Map - Key & Value

    val list = listOf("A", "B");
    val set = setOf(1, 2);
    val map = mapOf("name" to "Ana", "age" to 19);

    var arrayInt: Array<Int> = arrayOf(1, 2, 3)
    arrayInt.forEach {
        println("Int : $it")
    }

    var array = arrayOf(1, 3.14, "Kotlin")
    array.forEach {
        when(it) {
            is Int -> println("$it is an Integer")
            is Double -> println("$it is a Double")
            is String -> println("$it is a String")
            else -> println("$it is of other type")
        }
    }
}