package org.example.CSIT_284_PBD3.Kotlin_Syntax/*

A Higher-Order Function 
- a function that can accept another function as a parameter, return a function, or both.

In Kotlin, functions are treated as first-class citizens, meaning they can be:
Stored in variables
Passed to other functions
Returned from functions

*/

/*

- Reduce code duplication
- Make programs more flexible
- Commonly used in Android
- Foundation of functional programming

*/

// 9. Using Type Aliases for Readability
typealias Operation = (Int, Int) -> Int

fun calculate(a: Int, b: Int, op: Operation): Int {
    return op(a, b)
}

// 10. Inline Higher-Order Functions
inline fun repeatAction(times: Int, action: () -> Unit) {
    for (i in 1..times) action()
}

fun main(){

    fun downloadData(onComplete: () -> Unit) { 
        println("Downloading...") // Real work happens here
        onComplete()               // Calling the placeholder
    }
    downloadData { 
        println("Done Download!") // This IS the 'onComplete' parameter
    }
    // onComplete: () -> Unit → a function with no input and no return

    // 2.
    fun operate(x : Int, operation : (Int) -> Int) : Int { // Basta higher order function parameter, use (Int)
        return operation(x)
    }
    val result = operate(5){
        it * 2
    }
    println(result)

    // 3. Multiple parameter
    fun calculate(a : Int, b : Int, action : (Int, Int) -> Int) : Int {
        return action(a, b)
    }
    val sum = calculate(5, 3){ x, y ->
        x + y
    }
    val product = calculate(5, 3){ x, y ->
        x * y
    }
    println("SUM: " + sum)
    println("PRODUCT: " + product)

    // 4. Returning a function
    fun multiplier(factor : Int) : (Int) -> Int {
        return {number -> number * factor}
    }
    val double = multiplier(2)
    println(double(5))

    // 5. Higher Order functions with collections
    val numbers = listOf(1,2,3,4,5);
    val evenNumbers = numbers.filter {
        it % 2 == 0
    }
    println(evenNumbers);

    // Map:
    val doubled = numbers.map { 
        it * 2
    }
    println(doubled)

    // forEach:
    numbers.forEach { 
        println(it)
    }

    // sortedBy:
    val names = listOf("Ana", "John", "Ben")
    val sorted = names.sortedBy { it.length }
    println(sorted)

    // 6. Higher-Order Function with Condition
    fun checkNumber (
        number: Int,
        condition: (Int) -> Boolean
    ): Boolean {
        return condition(number)
    }

    val isAdult = checkNumber(20) { it >= 18 }
    println(isAdult)


    // 7. Replacing IF-ELSE with Higher-Order Functions
    fun executeIfTrue(
        condition: Boolean,
        action: () -> Unit
    ) {
        if (condition) action()
    }

    executeIfTrue(true) {
        println("Condition is true")
    }


    // 8. Real Android-Style Example 
    fun loadData(onSuccess: () -> Unit, onError: () -> Unit) {
        val success = true
        if (success) onSuccess() else onError()
    }

    loadData(
        onSuccess = { println("Data loaded") },
        onError = { println("Error loading data") }
    )

    repeatAction(3) {
        println("Hello")
    }
}