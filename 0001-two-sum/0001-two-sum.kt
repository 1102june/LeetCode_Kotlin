class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableMapOf<Int, Int>()

        for(i in nums.indices){
            val need = target - nums[i]
            if(result.containsKey(need)){
                return intArrayOf(result[need]!!, i)
            } 
            result[nums[i]] = i 
        } 
        return intArrayOf()
    }
}