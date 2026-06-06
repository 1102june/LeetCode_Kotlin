class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        //중복 제거를 위한 set 변환
        val a =  nums1.toSet()
        val b =  nums2.toSet()

        var a1  = (a-b).toList()
        var b1 = (b-a).toList()

        return listOf(a1,b1)
    }
}