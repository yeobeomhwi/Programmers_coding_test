package Level_1

class Level_1_sum_between_two_integers {
    fun solution(a: Int, b: Int): Long {
        val min = minOf(a, b)
        val max = maxOf(a, b)
        var sum: Long = 0

        for (i in min..max) {
            sum += i
        }

        return sum
    }
}

fun main() {
    val solution = Level_1_sum_between_two_integers()
    val result1 = solution.solution(3, 5)
    println(result1) // 출력: 12

    val result2 = solution.solution(0, 10)
    println(result2) // 출력: 3

    val result3 = solution.solution(5, 3)
    println(result3) // 출력: 12
}
