class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if(nums.size == 1){
            return //예외처리
        }
        var insert = 0 //삽입위치

        for (i in 0 until nums.size){
            if(nums[i] != 0 ){
                val temp = nums[i]
                nums[i] = nums[insert]
                nums[insert] = temp

                insert++
            }
        }
        return
    }
}