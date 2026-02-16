package org.example.CSIT_284_PBD3.Kotlin_Syntax// Kotlin
// classes AND methods - final by default


// Basic example
class Student1 {
    var name: String = ""
    var age: Int = 0

    fun introduce() {
        println("Hi, I am $name and I am $age years old.")
    }
}

class Student2(val name: String, var age: Int)

class Car1(val brand: String) {
    fun drive() {
        println("$brand is driving")
    }
}

class User1(val name: String = "defaultName", val age: Int = 0)

fun main(){
    val s1 = Student1()
    s1.name = "Macoy"
    s1.age = 20
    s1.introduce() 

    // Primary Constructor
    val s2 = Student2("Macoy", 21)
    println("Name: " + s2.name)

    // Properties - Variables inside a class.
    Car1("Honda").drive()

    // Default values
    println("Default Name: " + User1().name);

}