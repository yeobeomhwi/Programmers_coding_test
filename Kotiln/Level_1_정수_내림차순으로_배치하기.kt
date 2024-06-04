fun main() {
    val n:Long = 118372
    val solution = Level_1_Sort_by_integer_in_descending_order()
    val result = solution.solution(n)
    println(result)
}

class Level_1_Sort_by_integer_in_descending_order {
    fun solution(n: Long): Long {
        val answer = n.toString().toList().sorted().reversed().map {
            it.toString().toInt()
        }.joinToString("").toLong()
        return answer
    }
}
