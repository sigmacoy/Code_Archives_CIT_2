fun main(){
    fun add(num1: Int = 1, num2: Int = 2) : Int =
        num1 + num2

    add(10, 2)
    add()
    add(num2 = 3)

    fun pairData(osName: String): Pair<String, String> {
        return Pair("Android OS", "Kotlin")
    }

    val (os, language) = pairData("android")

    // HIGH LEVEL FUNCTIONS

    // Accept functions as parameter ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    fun printString(string: String,
                    funcArgs: (String) -> Unit) {
        funcArgs("Welcome to $string Tutorial!")
    }

    val func = { string: String -> println(string) }
    printString("Kotlin", func)

    // RETURNS A FUNCTION ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    fun mathFunc(num1: Int) : (Int) -> Int {
        return { num2: Int -> num1 * num2 }
    }

    val multi5 = mathFunc(5)
    println("5 * 7 = ${multi5(7)}")


}