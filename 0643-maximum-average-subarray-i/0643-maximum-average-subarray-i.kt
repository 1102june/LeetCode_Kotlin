class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var result = 0.0
        for(i in 0 until k){
            result+=nums[i] 
        } //인덱스 0부터 k까지
        
        var max = result
        
        for(j in k until nums.size){
            result =  result-nums[j-k]+nums[j]
            if (result > max){
                max = result
            }   
        }
        return max / k 
    }
}
