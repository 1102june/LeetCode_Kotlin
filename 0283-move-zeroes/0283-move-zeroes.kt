class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if(nums.size == 1){
            return 
        }
        var pointer = 0

        for(i in 0 until nums.size){
            if(nums[i] != 0){   //0이 아닌것을 찾았을때 Swap
                val temp = nums[i]
                nums[i] = nums[pointer]
                nums[pointer] = temp
                pointer++
            } 
        }
        return
    }
}