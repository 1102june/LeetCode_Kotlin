class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for(i in 0 until nums.size){
            val curr = nums[i]
            val a = target - curr

            if(map.containsKey(a)){
                return intArrayOf(map[a]!!, i)
            }
            map[curr] = i 
        }
        return intArrayOf() 
    }
}