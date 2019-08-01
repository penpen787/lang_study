package chap2

import com.sun.deploy.util.BlackList


fun main(args: Array<String>) {
    println("Hello World")

    println(Color.RED.rgb())

    println(getMnemonic(Color.BLACK))
    println(getMnemonic(Color.PINK))


    println(mix(Color.RED, Color.BLACK))
    println(mix(Color.BLACK, Color.RED)) // set collection does not check orders
    println(mix(Color.RED, Color.PINK))

    println(mixWithoutWhenParams(Color.RED, Color.BLACK))
    println(mixWithoutWhenParams(Color.RED, Color.PINK))




}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED, Color.BLACK -> "Richard"
        Color.BLACK -> "BB"  // This BLACK will be passed
        Color.PINK -> "BP"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf<Color>(c1, c2)) {
        setOf(Color.RED, Color.BLACK) -> "RED&BLACK"
        else -> throw Exception("Weird Color")
    }

fun mixWithoutWhenParams(c1: Color, c2: Color) =
    when {
        c1 == Color.RED || c2 == Color.BLACK -> "THIS IS IT"
        else -> "Weird Color"
    }
