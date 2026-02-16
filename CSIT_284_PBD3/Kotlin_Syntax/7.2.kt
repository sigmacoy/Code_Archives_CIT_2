package org.example.CSIT_284_PBD3.Kotlin_Syntax/*
public, private, protected
internal - Same module
*/
class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }
}

// Secondary constructor
class Book {
    var title: String = ""

    constructor(name: String) { // constructor keyword
        title = name
    }
}

// init block
class Person(val name: String) {
    init {
        println("Person created: $name") // calls everytime an object is created
    }
}

// Inheritance (Extending Classes)
// - Allows one class to inherit properties and methods from another.
open class Vehicle {
    open fun move() = println("Moving")
}
// Override methods
class Bike : Vehicle() {
    override fun move() = println("Bike is moving")
}



fun main(){
    
}