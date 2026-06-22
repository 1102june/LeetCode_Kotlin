class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double { 
        var max = 0.0
        for(i in 0 until k){
            max+=nums[i]
        } 
        var result = max
        for(j in k until nums.size){
            max = max + nums[j] - nums[j-k]
            if(max > result){
                result = max
            } 
        }
        return result/k
    }
}