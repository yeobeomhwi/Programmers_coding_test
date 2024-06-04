package Level_0

fun main() {
    val num_list:IntArray = intArrayOf(2,1,6)
    val n = 3
    val solution = Level_0_From_the_Nth_element()
    val result = solution.solution(num_list,n)
    println(result.joinToString ())
}

class Level_0_From_the_Nth_element {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return  num_list.sliceArray(n-1 until num_list.size)
    }
}