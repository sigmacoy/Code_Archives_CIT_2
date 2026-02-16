package org.example.CSIT_284_PBD3.Kotlin_Syntax
import kotlinx.coroutines.*;
fun main() = runBlocking {
    // Suspend function - can pause and resume execution.
    // You can only call suspend functions inside coroutines.

    suspend fun loadData() {
        delay(2000)
        println("Data Loaded")
    }

    /*
    A scope controls how long a coroutine lives.
    GlobalScope - Whole app (not recommended often)
    lifecycleScope - Android Activity/Fragment
    viewModelScope - MVVM ViewModel

    Dispatchers (Thread Managers)
    Main - UI Thread
    IO - Network/Database
    Default - Heavy CPU Tasks
     */

    CoroutineScope(Dispatchers.IO).launch {
        println("Running in background") // Need og = runBlocking
    }
    println("TEST")
}