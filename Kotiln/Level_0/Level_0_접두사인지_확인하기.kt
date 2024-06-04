package Level_0

fun main(){
    val my_string = "banana"
    val is_prefix = "ban"

    val solution = Level_0_Check_prefix()
    val result = solution.solution(my_string,is_prefix)
    println(result)
}
class Level_0_Check_prefix {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        if (my_string.startsWith(is_prefix)) answer++
        return answer
    }
}