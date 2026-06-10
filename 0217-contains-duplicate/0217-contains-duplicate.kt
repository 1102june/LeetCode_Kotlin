class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = nums.toList().groupingBy{it}.eachCount()
        val values = map.values.sorted()
        if(values[values.size-1] < 2){
            return false
        } 
        else{
            return true
        }

    }
}