class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        if(nums.size == 1 || k == 1){
            return 0
        }
        var result = 100000
        nums.sort()  // sorted()는 새로운 함수 반환
        for(i in 0 until nums.size - k+1){
            val max = nums[i+k-1]
            val min = nums[i]
            if(max - min < result){
                result = max-min
            }
        } 
        return result
    }
}