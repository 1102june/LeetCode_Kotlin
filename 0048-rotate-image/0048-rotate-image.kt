class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val a = matrix.size
        val b = matrix[0].size
        //어차피 n x n 행렬이라 둘다 선언 안해도되긴함
        
        matrix.reverse() // kotlin reverse funtions

        for(i in 0 until a){
            for(j in i+1 until b){
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }

    }
}