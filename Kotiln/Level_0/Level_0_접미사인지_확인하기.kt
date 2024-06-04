package Level_0

fun main(){
    val my_string = "banana"
    val is_suffix = "ana"
    val solution = Level_0_Check_suffix()
    val result = solution.solution(my_string, is_suffix)
    println(result)
}

class Level_0_Check_suffix {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        if (my_string.endsWith(is_suffix)) answer++
        return answer
    }
}