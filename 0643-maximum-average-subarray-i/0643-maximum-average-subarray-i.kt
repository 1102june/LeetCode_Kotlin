class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0.0
        for(i in 0 until k){
            sum += nums[i]
        }
        var max = sum
        for(j in k until nums.size){
            sum = sum+ nums[j] - nums[j-k]
            if(max < sum){
                max = sum
            } 
        }
        return max/k
    }
}