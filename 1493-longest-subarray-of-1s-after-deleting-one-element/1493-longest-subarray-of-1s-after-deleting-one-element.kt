class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var a = 0
        var b = 0 
        var maxLen = 0 
        var zeroNum = 0
        
        for(a in nums.indices){
            if(nums[a] == 0){
                zeroNum++
            }
            while(zeroNum > 1){
                if(nums[b] == 0){
                    zeroNum--
                } 
                b++
            } 
            maxLen = max(maxLen, a-b)
        }
    return maxLen
    }
}