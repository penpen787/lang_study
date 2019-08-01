package chap2

enum class Color (var r: Int, val g: Int, val b: Short) {
    RED(255, 0, 0),
    BLACK(0, 0, 0),
    PINK(0, 0, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}