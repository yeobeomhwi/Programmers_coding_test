fun main() {
    val solution = Level_1_Remove_smallest_number()

    // Test cases
    val arr1 = intArrayOf(4, 3, 2, 1)
    val result1 = solution.solution(arr1)
    println("Result 1: ${result1.joinToString()}")

    val arr2 = intArrayOf(10)
    val result2 = solution.solution(arr2)
    println("Result 2: ${result2.joinToString()}")

    val arr3 = intArrayOf(5, 4, 3, 2, 1)
    val result3 = solution.solution(arr3)
    println("Result 3: ${result3.joinToString()}")
}


class Level_1_Remove_smallest_number {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.filter { it !=arr.minOrNull() }.toIntArray()
        if (answer.count() == 0) answer += -1
        return answer
    }
}
