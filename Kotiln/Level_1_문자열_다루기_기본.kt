fun main() {
    val instance = Level_1_String_handling_basics()
    println(instance.solution("1234"))      // Expected output: true
    println(instance.solution("abc123"))    // Expected output: false
    println(instance.solution("123ABC"))    // Expected output: false
    println(instance.solution("!@#$%^&*"))  // Expected output: true
}

class Level_1_String_handling_basics {
    fun solution(s: String): Boolean {
        if (s.length != 4 && s.length != 6) {
            return false
        }
        // 숫자로만 구성되어 있는지 확인
        return s.all { it.isDigit() }
    }
}