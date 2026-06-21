class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        val result = mutableListOf<Int>() 
        for(i in set1){
            if(i in set2){
                result.add(i)
            } 
        }
        return result.toIntArray()
    }
}