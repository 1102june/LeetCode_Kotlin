class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for(i in 0 until nums.size){
            val current = nums[i]
            val compl = target - current

            if(map.containsKey(compl)){
                return intArrayOf(map[compl]!! , i)
            }
            map[current] = i 
        }
        return intArrayOf() 
    }
}