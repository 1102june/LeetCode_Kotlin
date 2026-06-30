class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val a = matrix.size
        val b = matrix[0].size

        val c = BooleanArray(a)
        val d = BooleanArray(b)

        // 0 찾아서 메모
        for(i in 0 until a){
            for(j in 0 until b){
                if(matrix[i][j] == 0){
                    c[i] = true
                    d[j] = true
                }
            } 
        } 
        // 이제 0인 행,열에다가 0박아넣기
        for(i in 0 until a){
            for(j in 0 until b){
                if(c[i] || d[j]){
                    matrix[i][j] = 0
                }
            } 
        }
    }
}