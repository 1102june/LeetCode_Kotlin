class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var max = 0

        val result = mutableListOf<Char>()

        for(i in 0 until s.length){
            val curr = s[i]
            while(curr in result){
                result.remove(s[left])
                left++
            }
            result.add(curr)
            if(result.size > max){
                max = result.size
            }   
        }
        return max 
    }
}