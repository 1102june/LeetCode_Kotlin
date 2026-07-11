class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()

        var left = 0
        var max = 0
        for(right in 0 until s.length){
            val curr = s[right]

            while(curr in set){
                set.remove(s[left])
                left++
            }
            set.add(curr)

            if(right-left+1 > max){
                max = right - left+1
            }  
        }
        return max 
    }
}