class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        // reverse 할 생각을 할 수 있는가?
        matrix.reverse()
        val a = matrix.size
        val b = matrix[0].size

        for(i in 0 until a){
            for(j in i+1 until b){
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            } 
        } 
        
    }
}