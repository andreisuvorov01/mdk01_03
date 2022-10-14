import java.lang.Math.sqrt
import java.util.Random
import kotlin.math.pow


fun main() {
    //задача1
    val myAge: Int = 18
    val isTeenager = myAge in 13..19
    //задача2
    val theirAge: Int = 30
    val bothTeenagers = isTeenager == theirAge in 13..19
    //задача3
    val reader: String = "andrei"
    val author: String = "Richard lucas"
    val authorisReader: Boolean = reader == author
    //задача4
    val raderBeforeAuthor: Boolean = reader < author
    //задача 5
    val myAge2 = if (myAge in 13..19) {
        println("подросток")
    } else {
    }
    //задача 6
    //val answer : Int = if  (myAge in 13..19) {println("подросток")}
    //задача 7
    var counter: Int = 0
    while (counter < 10) {
        var x = counter
        counter += 1
        println(counter)
    }
    //задача 8
    counter = 0
    var roll: Int = 0
    do {
        counter += 1
        roll == Random().nextInt(5)
        println("после $counter бросков, roll равен"/*\n"*/ + " $roll")
    } while (roll != 0)

    //задача 9
    val range =  0..10
    var i : Double = 0
    for (i in range){
        println(i.pow(2))
    }
}