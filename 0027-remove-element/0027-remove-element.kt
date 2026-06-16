class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        //일단 k무시
        var left = 0
        var right = nums.size-1

        while(left<=right){
            if(nums[left] == `val`){
                nums[left] = nums[right]
                right--
                }
                else{
                    left++
                } 
            }
    return left
    }
}