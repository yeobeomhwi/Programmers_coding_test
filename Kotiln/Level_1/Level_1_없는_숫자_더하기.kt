package Level_1

class Level_1_Add_missing_numbers {
    fun solution(numbers: IntArray): Int {
        var sum = 0
        for (i in 0..9) {
            if (numbers.contains(i).not()){
                sum += i
            }
        }
        return sum
    }
}

fun main() {
    val solution = Level_1_Add_missing_numbers()

    // Test cases
    val numbers1 = intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)
    val numbers2 = intArrayOf(5, 8, 4, 0, 6, 7, 9)

    val result1 = solution.solution(numbers1)
    val result2 = solution.solution(numbers2)

    println("Result 1: $result1")
    println("Result 2: $result2")
}
