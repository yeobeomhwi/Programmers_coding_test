package Level_1

fun main() {
    val n = 42
    val solution = Level_1_even_and_odd_numbers()
    val result = solution.solution(n)
    println(result) // This will print the array elements
}

class Level_1_even_and_odd_numbers {
    fun solution(num: Int): String {
        return if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }
}