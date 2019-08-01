package chap2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException


/**
 * Java에서는 Checked exception 은 throws 절을 붙여야 하나, Kotlin에서는 그럴 필요가 없다.
 * 기존 Java에서 checked exception을 처리하지 않고 계속 상위 throws만 하는 트렌드여서 그런것 같다.
 */

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

fun main(args: Array<String>) {
    var num = 33.3
    val percent =
            if (num in 0..100) num
            else throw IllegalArgumentException() // Kotlin 에서 throw는 '식'이기 때문에 다른 식에 포함될 수 있다.

    var reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    reader = BufferedReader(StringReader("NAN"))
    readNumber2(reader)


}