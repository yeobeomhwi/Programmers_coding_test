package Level_1

fun main() {
    val s = "1234"
    val solution = Level_1_Replace_string_with_an_integer()
    val result = solution.solution(s)
    println(result) // This will print the integer 1234
}

class Level_1_Replace_string_with_an_integer {
    fun solution(s: String): Int {
        return s.toInt()
    }
}
