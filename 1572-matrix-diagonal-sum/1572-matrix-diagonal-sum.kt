class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val a = mat.size
        val b = mat[0].size
 
        var result = 0
        if(a==1 && b==1){
            return mat[0][0]
        } 
        // primary diagonal 
        for(i in 0 until a){
            result+=mat[i][i]

            result+=mat[i][a-1-i]
        } 
        // secondary diagonal
        
        if(a%2==1){  //홀수X홀수의 2차원배열인 경우 중앙값 빼버리기
            result-=mat[a/2][b/2]
        }
        return result        
    }
}