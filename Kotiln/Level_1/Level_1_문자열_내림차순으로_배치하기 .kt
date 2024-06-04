package Level_1

class Level_1_Arrange_strings_in_descending_order {
    fun solution(s: String): String {
        return s.toList().sortedDescending().joinToString("")
    }
}

fun main() {
    val instance = Level_1_Arrange_strings_in_descending_order()
    println(instance.solution("Zbcdefg"))  // Expected output: "gfedcbZ"
    println(instance.solution("abcXYZ"))  // Expected output: "cbaZYX"
    println(instance.solution("123abc"))  // Expected output: "cba321"
}
