class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for(i in nums){
            val count = map.getOrDefault(i,0)+1
            map[i] = count
            if(count*2>nums.size){
                return i
            }  
        } 
        return -1
    }
}