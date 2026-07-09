class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var nonzero= 0 

        for(i in 0 until nums.size){
            if(nums[i] != 0){
                val temp = nums[i]
                nums[i] = nums[nonzero]
                nums[nonzero] = temp

                nonzero++
            } 
        } 
        
    }
}