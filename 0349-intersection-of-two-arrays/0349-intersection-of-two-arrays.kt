class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>() // arrayListOf<Int>()
        
        val nums3 = nums1.toSet()
        val nums4 = nums2.toSet()
        
        for(i in nums3){
            if(i in nums4){
                result.add(i)
            } 

        } 
        return result.toIntArray()
    }
}