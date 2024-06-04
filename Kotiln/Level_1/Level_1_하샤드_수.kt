fun main() {
    val n = 13
    val solution = Level_1_Harshad_Number()
    val result = solution.solution(n)
    println(result)
}

class Level_1_Harshad_Number {
    fun solution(x: Int): Boolean {
        val xx = x.toString().map { it.toString().toInt() }.sum()
        return x % xx == 0
    }
}
