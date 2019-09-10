package chap4

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonA: View {
    override fun getCurrentState(): State {return ButtonState()}
    class ButtonState: State {}
}

class Outer {
    inner class Inner {
        fun getOuterReference() : Outer = this@Outer
        fun thisInstanceReference() : Inner = this
    }
}