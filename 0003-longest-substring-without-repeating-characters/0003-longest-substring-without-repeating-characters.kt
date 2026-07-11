class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val result = mutableListOf<Char>()

        var left = 0
        var right = 0
        var max = 0

        while(right < s.length) {
            if(s[right] in result){
                result.remove(s[left])
                left++
            }
            else{
                result.add(s[right])
                right++
            }
            if(max < result.size){
                max = result.size
            }   
        }
        return max
    }
}