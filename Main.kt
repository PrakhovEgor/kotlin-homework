fun main() {
    val a = Fraction(2, 4)
    val b = Fraction(1, -8)
    val c = a + b
    c.reduction()
    c.print()


}

class Fraction(a: Int, b: Int) {
    var up = a
    var down = {
        if (b == 0) {
            println("Недопустимое значение знаменателя. 0 замняется на 1")
            1
        } else if (b < 0) {
            up = up * -1
            -b
        } else
            b
    }.invoke()

    fun reduction() {
        if (up < 0) {
            val nod = gcd_3(-up, down)
            up = up / nod
            down = down / nod
        } else {
            val nod = gcd_3(up, down)
            up = up / nod
            down = down / nod
        }
    }

    operator fun plus(second: Fraction): Fraction {
        if (down == second.down) {
            return Fraction(up + second.up, down)
        } else {
            return Fraction(up * second.down + second.up * down, down * second.down)
        }
    }
    operator fun minus(second: Fraction): Fraction {
        if (down == second.down) {
            return Fraction(up - second.up, down)
        } else {
            return Fraction(up * second.down - second.up * down, down * second.down)
        }
    }
    operator fun times(second: Fraction): Fraction {
        return Fraction(up * second.up, down * second.down)
    }
    operator fun div(second: Fraction): Fraction{
        return Fraction(up * second.down, down * second.up)
    }
    fun print(){
        println(up.toString() + "/" + down.toString())
    }
}

fun gcd_3(a: Int, b: Int): Int {
    var a = a
    var b = b
    while (a != b) {
        if (a > b) {
            a = a - b
        } else {
            b = b - a
        }
    }
    return a
}

