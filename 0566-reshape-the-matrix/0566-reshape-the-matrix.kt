class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val a = mat.size
        val b = mat[0].size

        if(a*b != r*c){   //데이터 개수가 같지않은 예외처리 
            return mat
        } 

        val arr = Array(r){IntArray(c)} 
        // r,c
        var count = 0 // 1차원 배열의 번호표
        for(i in 0 until a){
            for(j in 0 until b){
                arr[count/c][count%c] = mat[i][j]

                count++
            } 
        } 
        return arr
    }
}