class Document {
    var title: String = "Sample Title"
        get() = field.uppercase()
        set(value) {
            field = value.trim()
        }
}

class KotlinPerson (
    val name: String,
    var age: Int
)

data class KotlinPersonData (
    val name: String,
    var age: Int
)


fun main() {
    val myDoc = Document()

    var subtitle: String? = null

    myDoc.title = "   My Book   "
    println(myDoc.title) // Prints: MY BOOK

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    var p1 = KotlinPerson("Android", 21)
    var p2 = KotlinPerson("Android", 21)
    print("ARE p1 and p2 equal? ");
    println(p1 == p2)
    // toString -> SampleKotlin.Models.KotlinPerson@49476842

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    var personData1 = KotlinPersonData("Android", 21)
    var personData2 = KotlinPersonData("Android", 21)
    print("ARE pData1 and pData2 equal? ")
    println(personData1 == personData2)
    // toString -> KotlinPersonData(name=Android, age=21)


}