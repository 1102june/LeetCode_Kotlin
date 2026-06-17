class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        //Duplicate 나오면 set 변환할생각하기
        val set = nums.toSet()

        if(set.size == nums.size){
            return false
        } 
        else{
            return true
        }
    }
}