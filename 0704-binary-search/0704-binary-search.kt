class Solution {
    fun search(nums: IntArray, target: Int): Int {
        // nums = [-1,0,3,5,9,12]
        var left = 0
        var right = nums.size-1

        for(i in 0 until nums.size){
            val mid = (left + right)/2
            if(nums[mid] == target){
                return mid
            } 
            if(nums[mid] < target){
                left = mid+1
            }
            if(nums[mid] > target){
                right = mid-1
            }
        }
        return -1 
    }
}