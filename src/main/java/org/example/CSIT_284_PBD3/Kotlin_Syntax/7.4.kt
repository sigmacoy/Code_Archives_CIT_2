class Document {
    var title: String = "Sample Title"
        get() = field.uppercase()
        set(value) {
            field = value.trim()
        }
        /*
        // 2. Custom logic needed (Validation)
        var age: Int = 19
            set(value) {
                if (value >= 0) field = value // Only set if not negative
            }
        */
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

/* Regular class vs Data class

Purpose: Regular = Logic/Behavior | Data = Holding data.

equals(): Regular = Memory address | Data = Property values.

copy(): Regular = ❌ No | Data = ✅ Yes (for easy cloning).

Abstract: Regular = ✅ Yes | Data = ❌ No.

Inheritance: Regular = ✅ Yes (if open) | Data = ❌ No (always final).

 */