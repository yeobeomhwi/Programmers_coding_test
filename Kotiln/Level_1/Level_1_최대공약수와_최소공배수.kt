package Level_1

fun main() {
    val n = 12
    val m = 18

    val gcdLcmCalculator = Level_1_GCD_LCM()
    val result = gcdLcmCalculator.solution(n, m)

    println("GCD of $n and $m is: ${result[0]}")
    println("LCM of $n and $m is: ${result[1]}")
}

class Level_1_GCD_LCM {

    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)

        return intArrayOf(gcd, n * m / gcd(n,m))
    }

    tailrec fun gcd(n: Int, m: Int): Int = if (n == 0) m else gcd(n - 1, m)
}
