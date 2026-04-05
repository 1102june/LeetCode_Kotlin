class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var first =  Int.MAX_VALUE
        var second = Int.MAX_VALUE   //first랑 second를 무한대값으로 설
        
        for(num in nums){
            if(num <= first){
                first = num
            } else if (num <= second){
                second = num
            }
            else {
                return true
            }
        }
        return false
        
    }
}