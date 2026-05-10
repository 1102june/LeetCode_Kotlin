class Solution {
    fun pivotIndex(nums: IntArray): Int {
        // 정수형배열 nums 피봇 인덱스를 계산
        val total = nums.sum()

        var leftSum = 0 

        for(i in nums.indices){
            if(leftSum*2 == total -nums[i]){
                return i
            }
            leftSum += nums[i]
        } 
    return -1
    }
}