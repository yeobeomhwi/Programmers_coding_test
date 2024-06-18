fun main(){
    val players: Array<String> = arrayOf("mumu","soe","poe","kai","mine")
    val callings: Array<String> = arrayOf("kai","kai","mine","mine")
    val solution = Level_1_running_race()
    val result = solution.solution(players, callings)
    println(result.joinToString(", "))
}

class Level_1_running_race {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val nameToRank: MutableMap<String, Int> = HashMap()

        players.forEachIndexed { index, player ->
            nameToRank[player] = index
        }

        callings.forEach { player ->
            val findIndex = nameToRank[player]!!
            if (findIndex > 0) {
                val switchedPlayer = players[findIndex - 1]

                // Swap players in the array
                players[findIndex] = switchedPlayer
                players[findIndex - 1] = player

                // Update the map with new ranks
                nameToRank[player] = findIndex - 1
                nameToRank[switchedPlayer] = findIndex
            }
        }
        return players
    }
}
