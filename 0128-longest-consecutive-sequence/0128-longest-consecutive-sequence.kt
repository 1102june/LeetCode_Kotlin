class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size==1){
            return 1
        } 
        var result = 0
        val a = nums.toSet() // O(n)

        for(i in a){
            if(!a.contains(i-1)){
                var curr = i
                var count = 1
            while(a.contains(curr+1)){
                curr++
                count++
                }
                result = maxOf(result, count) 
            }
        } 
        return result
    }
}