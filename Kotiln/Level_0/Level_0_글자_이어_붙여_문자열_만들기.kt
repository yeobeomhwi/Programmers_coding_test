package Level_0

fun main(){
    val my_string = "cvsgiorszzzmrpaqpe"
    val index_list = intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)
    val solution = Level_0_Create_a_string_by_concatenating_letters()
    val result = solution.solution(my_string, index_list)
    println(result)
}

class Level_0_Create_a_string_by_concatenating_letters {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        index_list.forEach {
            answer += my_string[it]
        }
        return answer
    }
}