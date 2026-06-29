class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val a = mat.size
        val b = mat[0].size 
        var result = 0

        if(a==1&&b==1){
            return mat[0][0]
        } 

        for(i in 0 until a){
            //primary diagonal
            result+=mat[i][i]
            result+=mat[i][a-1-i]
        }
        if(a%2==1){
            result -=mat[a/2][b/2]
        }
        return result  
    }
}