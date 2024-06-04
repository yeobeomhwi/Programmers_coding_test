fun main() {
    val n: IntArray = intArrayOf(1, 2, 3, 4)
    val solution = Level_1_Find_the_average()
    val result = solution.solution(n)
    println(result)
}


class Level_1_Find_the_average{
    fun solution(arr: IntArray): Double {
        var answer =  arr.sum()
        return answer.toDouble() / arr.size
    }
}