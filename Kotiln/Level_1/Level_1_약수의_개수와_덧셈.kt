package Level_1

fun main() {
    val instance = Level_1_Number_of_factors_and_addition()
    println(instance.solution(13, 17))  // Expected output: 43
    println(instance.solution(24, 27))  // Expected output: 52
}

class Level_1_Number_of_factors_and_addition {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (num in left..right) {
            var count = 0
            for(i in 1..num){
                if(num % i == 0){
                    count++
                }
            }

            if(count % 2 ==0){
                answer += num
            }else{
                answer -= num
            }
        }
        return answer
    }
}