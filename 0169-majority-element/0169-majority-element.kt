class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int,Int>()

        for(i in 0 until nums.size){
            val a = nums[i]
            map[a] = map.getOrDefault(a,0)+1
        } 

        for(j in 0 until nums.size){
            val b = nums[j]
            if(map[b]!! > (nums.size/2)){
                return nums[j]
            } 
        } 
        return  -1
    }
}