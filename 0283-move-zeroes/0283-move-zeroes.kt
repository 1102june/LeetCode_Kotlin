class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var zero = 0
        for(i in 0 until nums.size){
            if(nums[i] != 0){
                val temp = nums[i]
                nums[i] = nums[zero]
                nums[zero] = temp

                zero++
            }
        } 
    }
}