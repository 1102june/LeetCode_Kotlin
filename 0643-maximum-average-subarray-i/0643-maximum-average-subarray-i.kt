class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var currentSum = 0.0
        //0번 인덱스부터 4개 더함 
        for (k in 0 until k){
            currentSum+=nums[k]
        }

        var maxSum = currentSum

        for (i in k until nums.size){ 
            currentSum = currentSum + nums[i] - nums[i-k] 
            if (maxSum < currentSum) { 
                maxSum = currentSum
            }
        }  
        return maxSum / k
    }
}