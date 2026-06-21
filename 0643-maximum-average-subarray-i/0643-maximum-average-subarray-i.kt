class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        if(nums.size == 1){
            return nums[0].toDouble()
        }
        var max = 0.0
        for(i in 0 until k){
            max+=nums[i]
        }
        var result = max
        for(j in k until nums.size){
            max = max + nums[j] - nums[j-k]
            if(result < max){
                result = max
            } 
        } 
        return result/k
        
    }
}