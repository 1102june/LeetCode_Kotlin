class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()
        var leftsum = 0 

        for(i in nums.indices){
            if(leftsum == total-leftsum-nums[i]){
                return i
            } 
            leftsum += nums[i]   
        }
        return -1     
    }
}