
fun main() {
    val seoul = arrayOf("Jane", "Kim")
    val solution = Level_1_Find_KimSeobang_in_Seoul()
    val result = solution.solution(seoul)
    println(result)
}


class Level_1_Find_KimSeobang_in_Seoul {
    fun solution(seoul: Array<String>): String {
        val kim = seoul.indexOf("Kim")
        return "김서방은 ${kim}에 있다"
    }
}
