class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0 
        var right = nums.size-1

        while(left <= right){
            var mid = (left+right)/2
            if(nums[mid] == target){
                return mid
            } 
            if(nums[mid] < target){
                left = mid + 1
            } 
            if(nums[mid] > target){
                right = mid-1
            } 
        }
        return left
    }
}