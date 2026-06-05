class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var a = nums1.toSet() 
        var b = nums2.toSet()

        val a1 = (a-b).toList()
        val b1 = (b-a).toList()

        return listOf(a1,b1)
        
    }
}