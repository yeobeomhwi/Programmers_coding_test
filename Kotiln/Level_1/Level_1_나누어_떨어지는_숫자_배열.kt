
class Level_1_array_of_numbers_that_fall_apart {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answerList = mutableListOf<Int>()
        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                answerList.add(arr[i])
            }
        }
        if (answerList.isEmpty()) {
            answerList.add(-1)
        }
        return answerList.sorted().toIntArray()
    }
}

fun main() {
    val solution = Level_1_array_of_numbers_that_fall_apart()

    // Test cases
    val arr1 = intArrayOf(5, 9, 7, 10)
    val divisor1 = 5
    val result1 = solution.solution(arr1, divisor1)
    println("Result 1: ${result1.joinToString()}")

    val arr2 = intArrayOf(2, 36, 1, 3)
    val divisor2 = 1
    val result2 = solution.solution(arr2, divisor2)
    println("Result 2: ${result2.joinToString()}")

    val arr3 = intArrayOf(3, 2, 6)
    val divisor3 = 10
    val result3 = solution.solution(arr3, divisor3)
    println("Result 3: ${result3.joinToString()}")
}
