package Level_0

fun main(){
    val start_num = 3
    val end_num = 10
    val solution = Level_0_Count_up()
    val result = solution.solution(start_num, end_num)
    println(result).toString()
}

class Level_0_Count_up {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in start_num .. end_num) {
            answer += i
        }
        return answer
    }
}