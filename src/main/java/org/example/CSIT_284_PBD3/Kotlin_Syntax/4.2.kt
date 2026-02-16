fun main(){
    val oneToTwenty = 1..20

    val alphabet = 'A'..'Z'

    val fiveDownTo1 = 5.downTo(1)

    val twoToTen = 2.rangeTo(10)

    val rangeThree = oneToTwenty.step(2)


    var animals = listOf<String>("dog", "cat", "ox")

    val result = animals.joinToString(separator = " ")
    println(result) // dog cat ox

    for (animal in animals) {
        print("$animal ") // dog cat ox
    }

    println()

    for (idx in animals.indices) {
        print("${animals[idx]} ") // dog cat ox
    }

//    animals.forEach {
//        println(it)
//    }

    println()

    animals.forEachIndexed {
        idx, value -> println("At $idx is $value");
    }

}