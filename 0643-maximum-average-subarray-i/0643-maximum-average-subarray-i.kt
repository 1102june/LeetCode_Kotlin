class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
    
    var current = 0.0
    var max = 0.0

    for (i in 0 until k){
        current += nums[i]
    }
    max = current

    for (j in k until nums.size){
        current = current - nums[j-k] +nums[j]
        if(current >  max)
            max = current 
    }
    return (max/k)
        
    }
}