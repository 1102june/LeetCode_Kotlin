class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var write = 0 

        for (read in 0 until nums.size){
            if(nums[read] != 0){
                nums[write] = nums[read]
                write++
            } 
        }
    while (write<nums.size){
        nums[write] = 0 
        write ++
    }
    }
}