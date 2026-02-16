package org.example.CSIT_284_PBD3.Kotlin_Syntax// { parameter -> body }

fun main(){
    val greet = {name: String -> "Hello $name"};
    println(greet("Macoy"));

    /*
    { } -> Lamda Block
    -> == Separates input and logic
    */

    // Lambda, No Parameters ~~~~~~~~~~~~~~~~~~~~~~
    val sayHello = {println("Hello World")};
    sayHello();

    // One Parameter ~~~~~~~~~~~~~~~~~~~~~~
    val square = {x : Int -> x * x}; // "auto" return
    println(square(4));

    // Multiple Parameters ~~~~~~~~~~~~~~~~~~~~~~
    val add = {a : Int, b : Int -> a + b};
    println(add(3, 5));

    // with Return Type ~~~~~~~~~~~~~~~~~~~~~~
    val multiply : (Int, Int) -> Int = {
        a, b -> a * b;
    }
    println(multiply(2, 6));

    // "it" keyword -> Single parameter shortcut ~~~~~~~~~~~~~~~~~~~~~~
    val timesTwo : (Int) -> Int = {
        it * 2
    };
    println(timesTwo(5));

    // with Collections ~~~~~~~~~~~~~~~~~~~~~~
    val numbers = listOf(1, 2, 3);
    val evenNumbers = numbers.filter{
        it % 2 == 0
    };
    println(evenNumbers); // [2]

    // Map example: ~~~~~~~~~~~~~~~~~~~~~~
    val timesTwoNumbers = numbers.map{
        it * 2
    };
    println(timesTwoNumbers); // [2, 4, 6]

    // Inside a Function (Callback style) ~~~~~~~~~~~~~~~~~~~~~~   
    fun execute(action : () -> Unit){
        action();
    }
    execute{
        println("Action Executed");
    }


    // as Parameter with Input 
    fun processNumber(x : Int, operation : (Int) -> Int) : Int {
        return operation(x);
    }
    val result = processNumber(5){
        it + 10;
    }
    println(result); // 15
    /*
    (Int) is the input type.
    Int (after the ->) is the return type.
    */

    // Multi-Line Lambda
    val complex = { x : Int ->
        val y = x * 2
        y + 3 // Last line kay mao e return
    }
    println(complex(5));

    // Real Android-Style Example (Button Click)
//    button.setOnClickListener {
//        println("Button Clicked")
//    }

    

}

