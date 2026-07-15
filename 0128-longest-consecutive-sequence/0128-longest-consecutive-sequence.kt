class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size == 1){
            return 1
        }
        val set = nums.toSet() // toSet() -> O(n) 
        var max = 0

        for(i in set){
            if(!set.contains(i-1)){ // 만약 이게 시작점이면 
                var curr = i
                var currMax = 1
            
            while(set.contains(curr+1)){
                curr++
                currMax++
            }
            max = maxOf(max, currMax)
            }
        }
        return max  
    }
}