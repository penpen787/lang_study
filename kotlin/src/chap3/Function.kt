package chap3


fun func1(strVal: String, intVal: Int) {
    println("strVal : $strVal, intVal : $intVal")
}

fun func2(
    strVal: String = "STR", // parameter with default value
    intVal: Int
) {}

fun main(args: Array<String>) {
    func1("TEST", 777)
    func1(intVal = 777, strVal = "TEST") // Function Named Arguments
    // func1(intVal = 123) // specify all arguments needed

    func2(intVal = 777) // strVal using default value

}