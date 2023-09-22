package lab07

abstract class Shape {
    abstract val perimeter: Int
//    open val perimeter: Int = 0
}

interface Pritable {
    fun print()
}

data class Triangle(var a: Int, var b: Int, var c: Int) : Shape(), Pritable {
    override val perimeter: Int
        get() = a + b + c

    override fun print() {
        println("Triangle")
    }
}

data class TriangleImmutable(val a: Int, val b: Int, val c: Int) : Shape(), Pritable {
    override val perimeter = a + b + c

    override fun print() {
        println("TriangleImmutable")
    }
}

data class Rectangle(var a: Int, var b: Int) : Shape(), Pritable {
    override val perimeter: Int
        get() = 2 * (a + b)

    override fun print() {
        println("Rectangle")
    }
}

data class Geksagon(var a: Int, var b: Int, var c: Int, var d: Int) : Shape(), Pritable {
    override val perimeter: Int
        get() = (a + b + c + d) * 3

    override fun print() {
        println("Geksagon")
    }
}

fun main() {
    val shapes: List<Pritable> = listOf(
//        Shape(),  // prohibited since Shape is abstract
        Triangle(3, 4, 5).apply { a = 12 },
        Rectangle(4, 5),
        Geksagon(1,2, 3, 4),
        TriangleImmutable(2, 3, 4)
    )

    for (shape in shapes) {
        println(shape.toString())
//        println("perimeter = ${shape.perimeter}")
        shape.print()
    }
}