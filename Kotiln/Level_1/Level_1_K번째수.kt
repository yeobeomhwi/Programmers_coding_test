 fun main(){
     val array = arrayOf(1,5,2,6,3,7,4)
     val commands :Array<Array<Int>> = arrayOf(arrayOf(2,5,3), arrayOf(4,4,1), arrayOf(1,7,3))
     var solution = Level_1_K_number()
     var result = solution.solution(array,commands)
     println(result.joinToString(", "))
 }

class Level_1_K_number {
    fun solution(array: Array<Int>, commands: Array<Array<Int>>): IntArray {
        var answer = IntArray(commands.size)

        for(i in 0 until commands.size){
            var arrIn = array.sliceArray(commands[i][0]-1 until commands[i][1])
            arrIn.sort()
            answer[i] = arrIn[commands[i][2]-1]
        }
        return answer
    }
}