class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        var result = 100000
        nums.sort()

        for(i in 0 until nums.size-k+1){
            var min = nums[i]
            var max = nums[i+k-1]
            if(max-min < result){
                result = max-min
            }
        } 
        return result    
    }
}