class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var set1 =  nums1.toSet()
        var set2 = nums2.toSet()   //중복제거를 위한 set으로 변환

        var fset1 = (set1-set2).toList()
        var fset2 = (set2-set1).toList() //차집합으로 해결한 뒤 List변환

        return listOf(fset1,fset2)
    }
}