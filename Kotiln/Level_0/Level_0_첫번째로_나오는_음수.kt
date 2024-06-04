package Level_0
fun main(){
    val num_list:IntArray =intArrayOf(13,22,53,24,15,6)
    val solution = Level_0_the_first_negative_number()
    val result = solution.solution(num_list)
    println(result)
}

class Level_0_the_first_negative_number {
    fun solution(num_list: IntArray): Int {
        return num_list.indexOfFirst { it < 0 }
    }
}