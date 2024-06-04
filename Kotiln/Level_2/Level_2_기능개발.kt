package Level_2

fun main() {
    val functionDevelopment = Function_development()
    val progresses = intArrayOf(93, 30, 55)
    val speeds = intArrayOf(1, 30, 5)
    val result = functionDevelopment.solution(progresses, speeds)

    println(result.joinToString(", ")) // 예상 출력: 2, 1
}

class Function_development {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        //progresses = 작업진도, speeds = 하루에 증가하는 작업속도
        var answer = mutableListOf<Int>()
        var daysRequired = progresses.mapIndexed{ index, progress ->
            Math.ceil((100-progress)/ speeds[index].toDouble()).toInt()
        }.toMutableList()
        while (daysRequired.isNotEmpty()) {
            var currentDay = daysRequired[0]
            var count = 0

            while (daysRequired.isNotEmpty() && daysRequired[0] <= currentDay) {
                daysRequired.removeAt(0)
                count++
            }
            answer.add(count)
        }
        return answer.toIntArray()
    }
}