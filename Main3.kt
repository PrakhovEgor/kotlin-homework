
fun main() {
    var a = Complex(1, 2)
    var b = Complex(0, 12)
    var c = a * b
    println(c.toString())
}

class Complex {
    var first : Double = 0.0
    var sec : Double = 0.0

    constructor(f: Double = 0.0, s: Double = 0.0) {
        this.first = f
        this.sec = s
    }

    constructor(f: Int = 0, s: Int = 0) {
        this.first = f.toDouble()
        this.sec = s.toDouble()
    }

    operator fun plus(other: Complex): Complex {
        return Complex((first + other.first), (sec + other.sec))
    }
    operator fun minus(other: Complex): Complex{
        return Complex((first - other.first), (sec - other.sec))
    }
    operator fun div(other: Complex): Complex {
        return Complex(((first * other.first + sec * other.sec) / ((other.first * other.first) + (other.sec * other.sec))),
            ((sec * other.first - first * other.sec) / ((other.first * other.first) + (other.sec * other.sec)))
        )
    }

    operator fun times(other: Complex): Complex {
        return Complex(first * other.first - sec * other.sec,
            first * other.sec + sec * other.first
        )
    }


    override fun toString(): String {
        return first.toString() + " " + sec.toString() + "i"
    }


}
