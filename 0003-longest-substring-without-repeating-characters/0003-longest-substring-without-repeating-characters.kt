class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val result = mutableListOf<Char>()

        var left = 0  // left는 규칙위반시(새로 들어오는 애랑 중독되면) result에서 제거함
        var max = 0

        for(right in 0 until s.length){
            //right는 그냥 전진
            while(s[right] in result){
                result.remove(s[left])
                left++    
                }
            result.add(s[right])
            if(result.size > max){
                max = result.size
            }            
        } 
        return max
    }
}