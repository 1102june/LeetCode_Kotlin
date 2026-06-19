class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()  //이거 크기 지정안한 IntArray 어떻게 선언하는지.
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        for(i in set1){
            if(i in set2){
                result.add(i) 
            } 
        } 
        return result.toIntArray()
    }
}