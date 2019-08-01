package chap1

data class Person (val name: String, val age: Int? = 10)

fun main(args: Array<String>) {
    println("Hello World")

    val persons = listOf<Person>(Person("Jenny"), Person("Tom", age = 26))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("Oldest : $oldest")
    println(persons.get(0))




}