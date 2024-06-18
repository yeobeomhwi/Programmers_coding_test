package Level_0

fun main() {
    val n = 0
    val control: String = "wsdawsdassw"
    val solution = Level_0_Manipulating_numbers_1()
    val result = solution.solution(n, control)
    println(result)
}

class Level_0_Manipulating_numbers_1 {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for (i in control.indices) {
            when (control[i]) {
                'w' -> answer += 1
                's' -> answer -= 1
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }
        return answer
    }
}
