package com.example.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//String
//Primitive types (8) - Int, Double, Float, Char, Boolean, Byte, Sort , Long

fun main() {

    //userdocuments.numberOfYears = 67

    val userdocuments1 = UserDocuments("Bobby", 10)

    //println("user appellation: ${userdocuments1.appellation}")
    //println("user number of years: ${userdocuments1.numberOfYears}")


    val userdocuments2 = UserDocuments("Marley", 15)

    //println("user appellation: ${userdocuments2.appellation}")
    //println("user number of years: ${userdocuments2.numberOfYears}")

    val userdocuments3 = UserDocuments("   ",numberOfYears = 27)

    //println("user appellation: ${userdocuments3.appellation}")
    //println("user number of years: ${userdocuments3.numberOfYears}")

    val userdocuments4 = UserDocuments(numberOfYears = 24)


}

class UserDocuments(appellation: String = "No Name", var numberOfYears: Int) {

    val appellation: String  

    init {
        if (appellation.isBlank()) {
            this.appellation = "No Name"
        }else{
            this.appellation = appellation.trim()
        }
        println("New Data: ${this.appellation}, Age: ${numberOfYears}")
    }


}

//const val BOSS_MAN = "Literally"

/*fun main9() {
    //println(BOSS_MAN)

    //println(double(6 ))

    //hallo("John", 4)

    //println(getprintMax(6, 7, 8))

    //hallo(identity = "Jakob,", messager = "Beautiful Day!", Gertrude = 4)
    //hallo(3, "Beauty")

    //println(addition(2,  3,4,5))

    //val array = intArrayOf(2, 4 ,6, 8, 10)
    //println(add(12, 14, 16, *array, 18, 20, b = 22))


    //println(getMaxest(9,
        //numeros = *intArrayOf(11, 13, 15)))
}*/

/*fun getMaxest(uno1: Int, vararg numeros: Int): Int {

    println(BOSS_MAN)

    var biggest = uno1

    for (z in numeros) {
        if (z > biggest) biggest = z
    }

    return biggest
}*/

/*fun add(a: Int, vararg digits: Int, b: Int): Int {
    var sum = a + b

    for (total in digits) sum += total

    return sum
}*/

/*fun addition(a:Int, b: Int, c: Int = 0, d: Int = 0, e: String = "0"): Int {
    return a + b + c + d
}*/

/*fun hallo(identity: String = "Jasmine", messager: String, Gertrude: Int = 5) {
    for (G in 0 until Gertrude) println("Hello $identity $messager")
}*/

/*fun hallo(repeat: Int, identity: String) {
    for (G in 0 until repeat) println(identity)
}*/

/*fun double (no: Int): Int {
    return no * 2
}*/

//fun double (no : Int) : Int = no * 2  //single expression function

//fun getprintMax(x: Int, y: Int) = if (x > y) x else y

//fun getprintMax(x: Double, y: Double) = if (x > y) x else y

/*fun getprintMax(x: Int, y: Int, z: Int) =
    when {
    x >= y && x >= z -> x
    y >= x && y >= z -> y
    else -> z
}*/

//val bigger = if (big > small) big else small
//return bigger


/*fun hallo(identity: String, repeat: Int) {
    var repeatAgain = repeat


    while (repeatAgain > 0) {
        //for (G in 0 until  repeat)
        println("Hello $identity, nice to meet you!")
        repeatAgain--
    }
}*/

/*fun main8() {
 //If_elseif_else_When
    val t = 13
    val isSunday = false

    val blessings = when {
        isSunday -> "Go to church!"
        t < 4 -> "Omoo!"
        t in 0..11 -> "Good morning!"
        t == 12 -> "Time for lunch!"
        t == 13 || t == 14 -> {
            println("Yawn")
            "Time to sleep!"
        }
        else -> "Good day!"
    }
    println(blessings)


    for (c in 1..10 step 1) {
        //if ( c > 2 && c < 6 ) continue // or if (c in 3..5) or if ( (3..5).contains (c) )
        if(c !in 4..6) {
            print("o")
        } else if  (c == 5) {
            print("d")
        } else {
            print("G")}

        println(c)
    }
}*/


/*fun main7() {
    //While, Do-while loop & labels

    var no = 100
    var counter = 0

    while (no > 1) {
        no /= 2
        counter ++
    }

    println(counter++)

    var g = 0

    do {
        println(g)
        g++

        var a = 0
        while (a < 5) {
            println("---$a")
            a++
            //Line Breaks: break, continue
            //Labels: outer@ (can use any keyword, but ,ust be followed by an @
            // then you attach it to the line break. E.g. break@outer)
        }

    }while (g < 5)

    //while (g < 5) {
        //println(g)
          //g++
        //println(g++)
    //}
}*/

/*fun main6() {
    //Booleans: Either True or False.
    // && - checks if both side is true - Logical AND
    // || - checks if one of both sides is true - Logical OR

    println("true && false = ${true && false}")
    println("true || false = ${false || true}")

    val jimmy = ((2 > 1) || (3 > 2)) && (2 > 3)
    println(jimmy)

    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("2 = 1 is ${2 === 1}")
    println("2 >= 1 is ${2 >= 1}")
    println("2 <= 1 is ${2 <= 1}")
    println("2 != 1 is ${2 != 1}")

    println("!(2 > 1) is ${!(2 > 1)}")

    /*val a = 10
    val b = 4

    if (a<10) {
        println(true)
    }else
        println(false)
}*/

/*fun main5() {
    //Arrays & For loop

    val names = arrayOf("Jim", "Beglin", "Fischer", "Labreader", "Jemilah")

    for (name in names.indices) {
        println("Index: $name, Element: ${names[name]}")
    }

    for (name in names) {
        println(name)
    }

    for (numbers in 1..10) {
        println(numbers)
    }

    for (numbers in 1 until 10) {
        println(numbers)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 5) {
        println(i)
    }

    for (i in 1L..10) {
        println(i)
    }

    for (i in 'a'..'z') {
        println(i)
    }


    val numerics = arrayOf(1,2,3.0, "den", 4F, '2')
    numerics[2] = 'k'
    names [0] = "Jackson"

    /** Other arrays are: arrayof(Takes whatever primitive types. E.g. Boolean, Char, string)
     *                    intArrayOf(Takes only integers)
     *                    IntArray(I don't knpw what it does yet)
     */

    println(names[1][2])
    println(names[3].length)

    println("Number of array: ${names.size}")
    println("First Element: ${names[3]}")
    println("Last Element: ${names.last()}")

    val multiplearrays = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6),
    arrayOf(7, 8, 9),
    // arrayOf("lands, Flecing", "Jamd", 1)
    )
    println(numerics[3])
}*/

/*fun main4() {
    //Basic Arithmetic Operators

    var a = 5
    var b = 3F

    println("a = " + a + " b = " + b)
    println("a = $a b = $b" )
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("2 + 2 * 3 = ${(2 + 2) * 3}")


    a += 2 //(Statement)
    println("a += 2: $a")

    a = a + 2
    a++
    println("a++: ${a++}") //(returns then increment)
    println("++a: ${++a}") //(increments then return)
    ++a


    println("-a: ${-a}")

    a -= 2 //(Statement)
    println("a -= 2: $a")

    println("a--: ${a--}")
    println("--a: ${--a}")

    a *= 2 //(Statement)
    println("a *= 2: $a")

    a /= 2 //(Statement)
    println("a /= 2: $a")

    a %= 2 //(Statement)
    println("a %= 2: $a")
    println(a)
}*/

/*fun main3() {
    //Primitive/ Basic Data Types

    val exampleName = "\"Jehovah\nJireh\""
    val exampleRawString = """ "Flaher
        hfjfgfkhc
        ggudgd hdgdjdgd"
    """
    val exampleNumber = 2_00000.73
    val exampleChar = 'Q'
    val exampleBoolean = true||false
    val exampleNumber2: Double //declaration
    exampleNumber2 = 7_7763_3667.23 //initialization
    val exampleLong: Long = exampleNumber.toLong()
    println(exampleRawString)


}*/

/*fun main1() {
    // The Beginning

    val userName = "Jah"
    var age = 2.5
    userName = "Jehovah"
    println("Hello, World! My name is $userName, I am $age years old. In 2 years, i'll be ${age + 2.7}")
    moose()
}

fun moose2() {
    println("Hello, Kotlin")
}*/