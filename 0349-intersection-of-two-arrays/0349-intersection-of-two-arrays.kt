class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val a = nums1.toSet()
        val b = nums2.toSet()

        for(i in a){
            if(i in b){
                result.add(i)
            } 
        } 
        return result.toIntArray()
    }
}