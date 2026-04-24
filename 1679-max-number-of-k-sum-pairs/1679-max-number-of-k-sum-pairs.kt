class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        var left = 0 
        var right = nums.size -1 // right pointer
        var count = 0
        val sorted = nums.sort()
        
        while(left < right){   //어떤기준으로 포인터를 움직일것인가
            if(nums[left]+nums[right]==k){
                count++
                left++
                right--
            }//만약 합한값이 k가 아니면 어떻게 해결할것인가 
            else if(nums[left]+nums[right] > k) {
                right--
            }
            else {
                left++
            }
        } 
        return count
    }
}