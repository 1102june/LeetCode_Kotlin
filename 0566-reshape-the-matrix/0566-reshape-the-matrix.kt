class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val a = mat.size 
        val b = mat[0].size

        val arr = Array(r){IntArray(c)}
        var count = 0

        if(r*c != a*b){
            return mat
        }
        for(i in 0 until a){
            for(j in 0 until b){
                arr[count/c][count%c] = mat[i][j]
                count++
            } 
        } 
        return arr
    }
}