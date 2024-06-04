package Level_1

fun main() {
    val n = 12
    val solution = Level_1_Find_a_number_whose_remainder_is_1()
    val result = solution.solution(n)
    println(result)
}

class Level_1_Find_a_number_whose_remainder_is_1 {
    fun solution(n: Int): Int {
        for (i in 2..n) {
            if (n % i == 1) {
                return i
            }
        }
        return n
    }
}
