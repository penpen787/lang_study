package chap3

// public fun <T> listOf(vararg elements: T): List<T>......
// vararg is same as '...' in Java
val someList = listOf(1, 2 ,3 ,4, 5)
val someArr = arrayOf("A", "B", "C")


/**
 * infix call
 * if
 */
val someMap = mapOf(1 to "one") // 'to' is used as 'infix call'(중위호출)
val someMap2 = mapOf(1.to("one")) // call 'to' method(usual way)



fun main(args: Array<String>) {
    val list = listOf("args: ", *someArr) // to spread the array, use keyword '*'
    val list2 = listOf("args: ", someArr) // only two elemets, [args: , [Ljava.lang.String;@85ede7b]

    println(list) // [args: , A, B, C]
    println(list.size)

    println(list2) // [args: , [Ljava.lang.String;@85ede7b]
    println(list2.size) // 2
    val strArr = list2[1]
    println(strArr::class.simpleName) // Array
    println(strArr::class.qualifiedName) // kotlin.Array
    if (strArr is Array<*>) {
        println(strArr.size) // 3
        strArr.forEach { str -> print(str) }
    }
}




