fun main(args: Array<String>) {
    val(a, b) = readLine()!!.split(' ').map(String::toInt)
    var row = "*".repeat(a)
    repeat(b) {
        println(row)
    }
}