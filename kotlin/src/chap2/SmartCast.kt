package chap2

import java.lang.IllegalArgumentException


interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval (e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        val s = e as Sum
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun simpleEval (e: Expr): Int {

       if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        val s = e as Sum
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown Expression")
}


fun moreSimpleEval (e: Expr): Int =
    when (e) {
        is Num -> e.value  // smart cast
        is Sum -> eval(e.left) + eval(e.right)  // smart cast
        else -> throw IllegalArgumentException("Unknown Expression")
    }
