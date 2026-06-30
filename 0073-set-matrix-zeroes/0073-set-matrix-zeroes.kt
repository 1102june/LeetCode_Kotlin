class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        // 1,1 이 0이라면
        // 일단 같은 열은 무조건 다 0
        // 그 행도 다 0
        // 0을 만나면 그 모든 행,열 0으로 만들고 넘어가기
        val a = matrix.size
        val b = matrix[0].size

        val rowMemo = BooleanArray(a)
        val colMemo = BooleanArray(b)

// 먼저 0의 위치를 기억해두기 
        for(i in 0 until a){
            for(j in 0 until b){
                if(matrix[i][j] == 0){
                    rowMemo[i] = true
                    colMemo[j] = true
                    } 
                } 
            }  
        
        for(i in 0 until a){
            for(j in 0 until b){
                if(rowMemo[i] || colMemo[j]){
                    matrix[i][j]=0
                } 
            }  
        }
    }
}