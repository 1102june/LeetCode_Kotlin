class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //map 선언
        val map = HashMap<Int, Int>()

        for(i in 0 until nums.size){
            val curr = nums[i]
            val find = target - curr

            if(map.containsKey(find)){
                return intArrayOf(map[find]!!, i)
            } 
            map[curr] = i
        }
        return intArrayOf() 
    }
}