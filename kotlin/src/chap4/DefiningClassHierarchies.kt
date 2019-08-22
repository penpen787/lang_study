package chap4

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun showOff() = println("I'm Focusable")
}

// Kotlin: Class 'Button' must override public open fun showOff(): Unit defined in chap4.Clickable because it inherits multiple interface methods of it
//class Button : Clickable, Focusable {
class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() = println("Clicked")
}

fun main(args: Array<String>) {
    Button().click()
    Button().showOff()

}