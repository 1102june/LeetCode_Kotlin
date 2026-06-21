class Solution {
    fun countGoodSubstrings(s: String): Int {
        val arr = s.toCharArray()
        var result = 0

        for(i in 0 until arr.size-2){
            if(arr[i] != arr[i+1] && arr[i] != arr[i+2] && arr[i+1] != arr[i+2]){
                result++
            } 
        }
        return result
    }
}