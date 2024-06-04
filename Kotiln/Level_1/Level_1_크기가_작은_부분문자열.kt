package Level_1

fun main(){
    val t = "3141592"
    val p = "271"
    val solutionInstance = Level_1_Smaller_Substrain()
    val result = solutionInstance.solution(t, p)
    println("Result: $result")
}

class Level_1_Smaller_Substrain {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var p_len = p.length
        for(i in 0..t.length-p_len){
            println(t.substring(i, i+p.length))
            if(p>= t.substring(i, i+p.length)){
                answer++
            }

        }
        return answer
    }
}