package Level_0


fun main(){
    val num_list:IntArray = intArrayOf(2,1,6)
    val solution = Level_0_last_two_elements()
    val result = solution.solution(num_list)
    println(result)
}

class Level_0_last_two_elements {
    fun solution(num_list: IntArray): MutableList<Int> {
        var answer= num_list.toMutableList()
        println(num_list.size)
        if(num_list.size >= 2){
            val last = num_list.last()
            val beforeLast = num_list[num_list.size - 2]

            if( last > beforeLast){
                answer.add(last-beforeLast)
            }else{
                answer.add(last * 2)
            }
        }
        return answer
    }
}