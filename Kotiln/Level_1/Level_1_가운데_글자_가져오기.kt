package Level_1

class Level_1_Get_middle_letter {
    fun solution(s: String): String {
        var ss = s.length / 2
        var answer = ""
        if (s.length % 2 == 0) {
            for (i in ss - 1..ss) {
                answer += s[i]
            }
        } else {
            for (i in ss..ss) {
                answer += s[i]
            }
        }
        return answer
    }
}

fun main() {
    val solution = Level_1_Get_middle_letter()

    // 테스트 케이스
    val testCases = listOf("abcde", "qwer")

    for ((index, s) in testCases.withIndex()) {
        val result = solution.solution(s)
        println("테스트 ${index + 1}: 입력값 = \"$s\", 결과 = \"$result\"")
    }
}
