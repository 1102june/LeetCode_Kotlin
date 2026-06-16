class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        //length = m+n
        //점점 증가
        var zero = 0
        for(i in m until m+n){      
                    nums1[i] = nums2[zero]
                        zero++     
        }
        nums1.sort() 
    }
}