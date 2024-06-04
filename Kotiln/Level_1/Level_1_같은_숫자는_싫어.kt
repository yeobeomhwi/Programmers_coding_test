fun main() {
    val arr1 = intArrayOf(1, 1, 3, 3, 0, 1, 1)
    val arr2 = intArrayOf(4, 4, 4, 3, 3)

    val solutionInstance = Level_1_I_hate_the_same_numbers()
    println(solutionInstance.solution(arr1).joinToString(", "))  // [1, 3, 0, 1]
    println(solutionInstance.solution(arr2).joinToString(", "))  // [4, 3]
}

class Level_1_I_hate_the_same_numbers {
    fun solution(arr: IntArray): IntArray {
        if (arr.isEmpty()) return intArrayOf()

        val answer = mutableListOf<Int>()
        var previous = arr[0]
        answer.add(previous)

        for (i in 1 until arr.size) {
            if (arr[i] != previous) {
                answer.add(arr[i])
                previous = arr[i]
            }
        }

        return answer.toIntArray()
    }
}
