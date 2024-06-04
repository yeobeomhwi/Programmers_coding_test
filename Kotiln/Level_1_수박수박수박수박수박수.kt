class Leverl_1_Watermelon {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 0 until n) {
            if (i % 2 == 0) {
                answer += "수"
            } else {
                answer += "박"
            }
        }
        return answer
    }
}

fun main() {
    val solution = Leverl_1_Watermelon()

    // 테스트 케이스
    val testCases = listOf(3, 4, 5)

    for ((index, n) in testCases.withIndex()) {
        val result = solution.solution(n)
        println("테스트 ${index + 1}: 입력값 = $n, 결과 = $result")
    }
}
