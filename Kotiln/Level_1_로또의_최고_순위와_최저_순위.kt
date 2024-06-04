fun main() {
    val solution = Level_1_Highest_and_lowest_lotto_rankings()

    val testCases = listOf(
        intArrayOf(44, 1, 0, 0, 31, 25) to intArrayOf(31, 10, 45, 1, 6, 19),
        intArrayOf(0, 0, 0, 0, 0, 0) to intArrayOf(38, 19, 20, 40, 15, 25),
        intArrayOf(45, 4, 35, 20, 3, 9) to intArrayOf(20, 9, 3, 45, 4, 35)
    )

    for ((lottos, win_nums) in testCases) {
        val result = solution.solution(lottos, win_nums)
        println("lottos: ${lottos.toList()}, win_nums: ${win_nums.toList()}, result: ${result.toList()}")
    }
}


class Level_1_Highest_and_lowest_lotto_rankings {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        //로또의 배열에서 0의 갯수를 세어 저장
        val countZero = lottos.filter { e -> e == 0 }.count()

        var correctNums = 0
        //로또의 배열을 순회하면서 win_nums과 맞은 갯수를 세어 저장
        lottos.forEach {
            if (win_nums.contains(it))
                correctNums++
        }

        //최대
        answer[0] = when (correctNums + countZero) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        //최소
        answer[1] = when (correctNums) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }

        return answer
    }

}