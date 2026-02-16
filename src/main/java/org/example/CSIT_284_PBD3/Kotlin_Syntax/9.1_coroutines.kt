package org.example.CSIT_284_PBD3.Kotlin_Syntax

import kotlinx.coroutines.*

fun main() = runBlocking {
    /* 
    - They help your app perform long or heavy tasks 
    in the background without freezing the screen.

    - lightweight thread-like mechanism used to run tasks 
    asynchronously (in the background) without blocking the main program flow.

    Prevent app freezing (ANR – Application Not Responding)
    Handle network calls smoothly
    Perform database queries safely
    Manage background tasks easily
    Use fewer resources than threads

    Coroutine - Background task
    Suspend function - Function that can pause/resume
    Scope - lifecycle of coroutine
    Dispatcher - thread manager
    Job - running coroutine instance


    */

    launch {
        delay(1000) // Wait 1 second (non-blocking)
        println("World!")
    }

    println("Hello,") // This prints immediately

    delay(1500) // Keep main alive so we see "World!"
    println("Main ends")

}

