class MetalBeam(
    val width: Double,
    val height: Double,
    val length: Double,
    val density: Double
) {

    fun volume(): Double {
        return width * height * length
    }

    fun weight(): Double {
        return volume() * density
    }
}

fun main() {
    println("Металлический брус")

    print("Введите ширину: ")
    val width = readln().toDouble()
    print("Введите высоту: ")
    val height = readln().toDouble()
    print("Введите длину: ")
    val length = readln().toDouble()
    print("Введите удельный вес: ")
    val density = readln().toDouble()

    val beam = MetalBeam(width, height, length, density)

    println("Вес бруса: ${beam.weight()}")
}