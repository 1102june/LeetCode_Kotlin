class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val a = matrix.size
        val b = matrix[0].size
        val arr = Array(b) {IntArray(a)} 

        for(i in 0 until a){
            for(j in 0 until b){
                arr[j][i] = matrix[i][j]
            } 
        } 
        return arr
    }
}