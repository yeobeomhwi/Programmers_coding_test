package Level_1

fun main(){
    val converter = Level_1_Numeric_strings_and_English()

    val test1 = "one4seveneight"
    val test2 = "23four5six7"
    val test3 = "2three45sixseven"
    val test4 = "123"

    println(converter.solution(test1))
    println(converter.solution(test2))
    println(converter.solution(test3))
    println(converter.solution(test4))

}


class Level_1_Numeric_strings_and_English {
    fun solution(s: String) = s.toString()
        .replace("zero", "0")
        .replace("one", "1")
        .replace("two", "2")
        .replace("three", "3")
        .replace("four", "4")
        .replace("five", "5")
        .replace("six", "6")
        .replace("seven", "7")
        .replace("eight", "8")
        .replace("nine", "9")
        .toInt()
}