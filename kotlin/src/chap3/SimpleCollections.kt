package chap3

val list = listOf<Int>(1, 3, 5)
val set = hashSetOf<Int>(1, 3, 5)
val map = hashMapOf(1 to "one", 7 to "seven")

fun main(args: Array<String>) {
    println(list.javaClass) // .javaClass is equivalent to Java's getClass()
    println(set.javaClass)
    println(map.javaClass)
}