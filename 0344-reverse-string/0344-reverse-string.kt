class Solution {
    fun reverseString(s: CharArray): Unit {
        if(s.size == 1){
            return 
        } 
        var left = 0 
        var right = s.size - 1  
        while(left < right){
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left++
            right--
        }
        return
        
    }
}