package Level_1

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) { IntArray(arr1[0].size) }


        for(i in arr1[0].indices){
            for(j in arr1[0].indices){
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }


        return answer
    }
}