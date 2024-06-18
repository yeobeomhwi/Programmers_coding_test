package Level_1

import java.util.*

fun main(){
    val s ="try hello world"
    val solution = Level_1_Create_Strange_Char()
    val result = solution.solution(s)
    println(result)
}

class Level_1_Create_Strange_Char {
    fun solution(s: String): String {
        var answer = s.split(" ").joinToString(" "){
            it.mapIndexed{index,c -> if(index % 2 == 0) c.uppercaseChar() else c.lowercaseChar() }.joinToString("")
        }
        return answer
    }
}