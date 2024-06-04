class Level_1_K_number {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

        for(i in 0 until commands.size){
            var arrIn = array.sliceArray(commands[i][0]-1 until commands[i][1])
            arrIn.sort()
            answer[i] = arrIn[commands[i][2]-1]
        }
        return answer
    }
}