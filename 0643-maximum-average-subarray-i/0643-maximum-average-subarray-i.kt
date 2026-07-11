class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var result = 0.0
        var max = 0.0

        for(i in 0 until k){
            max+=nums[i]
        } 
        result = max
        for(j in k until nums.size){
            max = max + nums[j] - nums[j-k] 
            if(result < max){
                result = max
            } 
        }
        return result/k
    }
}