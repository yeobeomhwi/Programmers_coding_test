package Level_1

fun main() {
    val a = intArrayOf(1, 2, 3, 4)
    val b = intArrayOf(2, 3, 4, 5)

    val level1DotProduct = Level_1.Level_1_dot_product()
    val result = level1DotProduct.solution(a, b)

    println("The dot product of the arrays is: $result")
}


class Level_1_dot_product {
    fun solution(a: IntArray, b: IntArray): Int {
        var dot = 0
        for(i in 0 until a.size) {
           dot += (a[i] *b[i])
        }
        return dot
    }
}