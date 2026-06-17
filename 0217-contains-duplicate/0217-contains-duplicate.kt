class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = nums.toSet()

        if(set.size == nums.size){
            return false
        } 
        else{
            return true
        }
    }
}