fun main() {
    val n = 123
    val solution = Level_1_Add_digits()
    val result = solution.solution(n)
    println(result)
}

class Level_1_Add_digits {
    fun solution(n: Int): Int {
        val answer = n.toString().map { it.toString().toInt() }.sum()
        return answer
    }
}