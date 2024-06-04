package Level_0


fun main(){
    val n = 10
    val k = 3
    val solution = Level_0_Creating_an_Array_1()
    val result = solution.solution(n,k)
    println(result)
}

class Level_0_Creating_an_Array_1 {
    fun solution(n: Int, k: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        for(i in 1 until n+1){
            if( i % k == 0){
                answer += i
            }
        }
        return answer.toList()
    }
}