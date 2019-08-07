package etc

import chap3.lastChar
import chap3.lastChar2 as last // rename

fun main(args: Array<String>) {
    /**
     * import package.method name needed
     * in the same package, can call without import
     */
    var test= "STR"
    test.lastChar()
    test.last()
}