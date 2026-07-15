class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var left = 0
        
        val result = mutableListOf<Char>()

        for(i in 0 until s.length){
            val curr = s[i]
            while(curr in result){ // 추가하려는 값이 없을때까지
                if(curr in result){
                    result.remove(s[left])
                    left++
                }
            }
            result.add(curr) 
            if(max < result.size){
                max = result.size
            } 
        }
        return max
    }
}