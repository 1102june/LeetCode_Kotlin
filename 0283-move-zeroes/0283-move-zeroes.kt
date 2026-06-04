class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var n_zero = 0
        if(nums.size == 1){
            return
        } 

        for(i in 0 until nums.size){
            if(nums[i] != 0){
                var temp = nums[i]
                    nums[i] = nums[n_zero]
                    nums[n_zero] = temp
                
                n_zero++
            }
        } 
    }
}