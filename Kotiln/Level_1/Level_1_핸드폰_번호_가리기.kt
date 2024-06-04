fun main() {
    val phone_number = "01033334444"
    val solution = Level_1_Hide_your_cell_phone_number()
    val result = solution.solution(phone_number)
    println(result)
}

class Level_1_Hide_your_cell_phone_number {
    fun solution(phone_number: String): String {
        val size = phone_number.length - 4
        val answer = StringBuilder(phone_number.substring(size))
        repeat(size) {
            answer.insert(0, "*")
        }
        return answer.toString()
    }
}

class Level_1_Hide_your_cell_phone_number2 {
    fun solution(phone_number: String): String {
        return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
    }
}