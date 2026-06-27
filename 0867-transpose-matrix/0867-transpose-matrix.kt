class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        // 2차원 배열 뒤집기
        val m = matrix.size
        val n = matrix[0].size
        val result = Array(n) { IntArray(m) }
        //n행 m열
        for(j in 0 until n){
            for(i in 0 until m){
                result[j][i] = matrix[i][j]
            }
        }
        return result  
    }
}