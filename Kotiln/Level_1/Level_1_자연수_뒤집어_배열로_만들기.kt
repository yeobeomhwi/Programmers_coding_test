package Level_1

fun main() {
    val n: Long = 12345
    val solution = Level_1_Flip_natural_numbers_into_array()
    val result = solution.solution(n)
    println(result.joinToString()) // This will print the array elements
}

class Level_1_Flip_natural_numbers_into_array {
    fun solution(n: Long): IntArray {
        val reversedDigits = n.toString().reversed().map { it.toString().toInt() }
        return reversedDigits.toIntArray()
    }
}
