package Level_1

fun main() {
    val n = 12
    val solution = Level_1_Sum_of_divisors()
    val result = solution.solution(n)
    println(result)
}

class Level_1_Sum_of_divisors {
    fun solution(n: Int): Int {
        return (1..n).filter { n % it == 0 }.sum()
    }
}