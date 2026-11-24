class House(
    val number: Int,
    val flats: Int,
    val year: Int,
    val district: String
) {

    fun calcQ(currentYear: Int): Double {
        return flats + 2.0 * (currentYear - year)
    }

    fun calcQp(currentYear: Int): Double {
        val q = calcQ(currentYear)
        if (district == "центр") {
            return 2 * q
        } else {
            return 0.5 * q
        }
    }
}

fun main() {
    println("Дом")

    print("Введите номер дома: ")
    val number = readln().toInt()
    print("Введите число квартир: ")
    val flats = readln().toInt()
    print("Введите год сооружения: ")
    val year = readln().toInt()
    print("Введите район (центр или окраина): ")
    val district = readln().lowercase()

    val currentYear = 2026

    val house = House(number, flats, year, district)

    println("Дом №${house.number}")
    println("Q = ${house.calcQ(currentYear)}")
    println("Qp = ${house.calcQp(currentYear)}")
}