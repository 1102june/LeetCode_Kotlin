class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val a = matrix.size
        val b = matrix[0].size

        var c = BooleanArray(a) //크기가 a인 불대수 배열 
        var d = BooleanArray(b) // [false, false, false....]
        
        // 0 을 찾아라
        for(i in 0 until a){
            for(j in 0 until b){
                if(matrix[i][j] == 0){
                    c[i] = true
                    d[j] = true
                } 
            } 
        } 
        // 불대수 배열에서 true라고 되어있는곳 0으로 덮기
        for(i in 0 until a){
            for(j in 0 until b){
                if(c[i] || d[j]){
                    matrix[i][j] = 0
                } 
            } 
        } 
        
    }
}