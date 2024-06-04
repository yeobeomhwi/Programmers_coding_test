package Level_1
fun main() {
    val solution = Level_1_N_numbers_spaced_apart_by_x()
    val result1 = solution.solution(2, 5)
    println(result1.joinToString(", ")) // 출력: 2, 4, 6, 8, 10

    val result2 = solution.solution(4, 3)
    println(result2.joinToString(", ")) // 출력: 4, 8, 12

    val result3 = solution.solution(-4, 2)
    println(result3.joinToString(", ")) // 출력: -4, -8
}

class Level_1_N_numbers_spaced_apart_by_x {
    fun solution(x: Int, n: Int): LongArray {
        return LongArray(n) { i -> x.toLong() * (i + 1) }
    }
}
