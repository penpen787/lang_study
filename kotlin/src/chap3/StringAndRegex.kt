package chap3



fun main(args: Array<String>) {
    println("12.345-6.A".split("-")) // in Java's String.split requires regex parameter
    println("12.345-6.A".split("\\.|-".toRegex())) // kotlin use toRexex() instead of ambiguous String parameter

    """\.|-""".toRegex() // in triple-quoted strings, don't need to escape any characters

    // triple-qouted strings is also used to make multi-line strings
    val multiLineStr = """
    .QWER
        .ASDF
            .ZXCV        
    """

    println(multiLineStr)
    println()
    println(multiLineStr.trimIndent())
    println()
    println(multiLineStr.trimMargin("."))
    println()


    val dir = "/Users/Test/lang-study/t.pdf"

    val directory = dir.substringBeforeLast("/")
    val fullName = dir.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val fileExt = fullName.substringAfterLast(".")

    println("Dir : $directory, name : $fileName, ext : $fileExt")

}