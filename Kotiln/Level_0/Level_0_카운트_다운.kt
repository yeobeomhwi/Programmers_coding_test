package Level_0

fun main(){
    val start_num:Int = 10
    val end_num:Int = 3
    val solution = Level_0_Count_down()
    val result = solution.solution(start_num,end_num)
    println(result)
}

class Level_0_Count_down {
    fun solution(start: Int, end_num: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        for (i in start downTo end_num) {
            answer += i
        }
        return answer.toList()
    }
}