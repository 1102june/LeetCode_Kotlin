class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if(nums.size == 1){
            return
        } 

        var zero = 0

        for (i in 0 until nums.size){
            if(nums[i] != 0){
                var temp = nums[i]
                nums[i] = nums[zero]
                nums[zero] = temp

                zero++
            }
        }
        
    }
}