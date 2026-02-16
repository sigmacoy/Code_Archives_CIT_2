package org.example.CSIT_284_PBD3.Kotlin_Syntax

fun main(){
    // Sorting
    val names = listOf("Ana", "John", "Ben")
    val sorted = names.sortedBy { 
        it.length;
    }
    println(sorted)

    // Returning Boolean
    val isAdult : (Int) -> Boolean = { age -> 
        age >= 18;
    }
    println(isAdult(20))

    /* Key Advantages of Lambdas
    1. Shorter Code - Less type
    2. Readable - Cleaner logic
    3. Reusable - Can pass around
    4. Function Style - Modern programming
    5. Common in Android - Used in listeners & collections
    */

}

