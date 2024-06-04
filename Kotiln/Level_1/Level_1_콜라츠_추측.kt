package Level_1

class Level_1_Colatz_Guess {
    fun solution(num: Int): Int {
        var n = num
        var count = 0

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2
            } else {
                n = n * 3 + 1
            }
            count++

            if (count > 400) {
                return -1
            }
        }
        return count
    }
}

fun main() {
    val solution = Level_1_Colatz_Guess()

    // 테스트 케이스
    val testCases = listOf(6, 16, 626331)

    for ((index, num) in testCases.withIndex()) {
        val result = solution.solution(num)
        println("테스트 ${index + 1}: 입력값 = $num, 결과 = $result")
    }
}
