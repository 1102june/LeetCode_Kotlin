class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val needed = target - nums[i]
            if (map.containsKey(needed)) {
                return intArrayOf(map[needed]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}