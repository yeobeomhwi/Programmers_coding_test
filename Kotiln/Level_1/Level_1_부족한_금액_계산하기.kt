class Level_1_Calculate_your_shortfall {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0

        for(i in 1..count){
            answer += price * i
        }

        val sum = answer-money
        if(sum<0) return 0
        return sum
    }
}

fun main() {
    val instance = Level_1_Calculate_your_shortfall()
    println(instance.solution(3, 20, 4))  // Expected output: 10
    println(instance.solution(1, 100, 10))  // Expected output: 0
}