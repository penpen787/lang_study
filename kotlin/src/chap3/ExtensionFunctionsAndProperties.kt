package chap3

import java.lang.StringBuilder


/**
 * define "extension function" to existing class
 * in this case, String is "receiver type" and "this" is "receiver object
 *
 * in bytecodes, it does not add the method to the target class.
 * it works as wrapper method
 * decompiled below :
 * <pre>
 * public final class ExtensionFunctionsAndPropertiesKt {
 *   public static final char lastChar(@NotNull String $this$lastChar) {
 *     Intrinsics.checkParameterIsNotNull($this$lastChar, "$this$lastChar");
 *     return $this$lastChar.charAt($this$lastChar.length() - 1);
 *   }
 * }
 *   </pre>
 */
fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastChar2(): Char = get(length - 1) // can access receiver object without "this"

/**
 * ExtensionProperties
 */
val String.lastCharValue: Char
    get() = get(length - 1) // getter

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    var str = "STRING"
    println(str.lastChar())
    println(str.lastCharValue)

    println("Kotlin".lastChar())

    println()

    val sb = StringBuilder("SB")
    println(sb)
    println(sb.lastChar)

    sb.lastChar = 'C'
    println(sb)
    println(sb.lastChar)


}