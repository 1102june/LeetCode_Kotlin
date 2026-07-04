class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int,Int>()

        for(i in nums){
            map[i] = map.getOrDefault(i,0)+1
        }


        for(j in nums){
            if(map[j]!! > (nums.size/2)){
                return j
            }
        }
        return -1
    }
}