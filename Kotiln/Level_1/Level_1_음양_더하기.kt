package Level_1

fun main() {
    val absolutes = intArrayOf(4, 7, 12)
    val signs = booleanArrayOf(true, false, true)

    val result = Level_1_yin_yang_plus.solution(absolutes, signs)

    println("결과: $result")
}


class Level_1_yin_yang_plus {
    companion object {
        fun solution(absolutes: IntArray, signs: BooleanArray): Int {
            var sum = 0
            for (i in 0 until absolutes.size) {
                if (signs[i]) {
                    sum += absolutes[i]
                } else {
                    sum -= absolutes[i]
                }
            }
            return sum
        }
    }
}
