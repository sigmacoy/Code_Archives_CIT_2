package org.example.CSIT_284_PBD3.Kotlin_Syntax

import kotlinx.coroutines.*;

@OptIn(DelicateCoroutinesApi::class)

fun main() = runBlocking {
//    Returning Results with async
    val deferred = GlobalScope.async {
        delay(1000)
        42
    }
    println(deferred.await())

//    async → returns result
//    await() → waits safely

//    Parallel Execution
    coroutineScope {
        val job1 = async { delay(1000); "A" }
        val job2 = async { delay(1000); "B" }
        println(job1.await() + job2.await())
    }


}