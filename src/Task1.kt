import kotlin.math.sqrt

class Parallelepiped(val width: Double, val height: Double, val length: Double) {

    fun volume(): Double {
        return width * height * length
    }

    fun diagonal(): Double {
        return sqrt(width * width + height * height + length * length)
    }
}

fun main() {
    println("Параллелепипед")

    print("Введите сторону ширину: ")
    val width = readln().toDouble()
    print("Введите сторону высоту: ")
    val height = readln().toDouble()
    print("Введите сторону длину: ")
    val length = readln().toDouble()

    val box = Parallelepiped(width, height, length)

    println("Объем: ${box.volume()}")
    println("Наибольшая диагональ: ${box.diagonal()}")
}