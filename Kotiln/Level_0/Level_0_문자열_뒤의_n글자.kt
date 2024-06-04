package Level_0

fun main(){
    val my_string = "ProgrammerS123"
    val n = 11
    val solution = Level_0_n_letters_after_string()
    val result = solution.solution(my_string, n)
    println(result)
}

class Level_0_n_letters_after_string {
    fun solution(my_string: String, n: Int): String {
        var answer: String = my_string.takeLast(n)
        return answer
    }
}