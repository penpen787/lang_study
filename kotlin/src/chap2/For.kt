package chap2

import java.util.*

val oneToTen = 1..10    // IntRange

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'


fun main(args: Array<String>) {
    for (i in oneToTen) {
        println(fizzBuzz(i))
    }

    println()

    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    // iteration for MAP

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }


    // check a value is in Range
    println(isLetter('q'))
    println(isNotDigit('x'))

    // ..(range) can be applied to a class implementing Comparable,
    // in this case, String class implements Comparable
    println("Kotlin" in "Java".."Scala")

    println("Kotlin" in setOf("Java", "Scala"))
}