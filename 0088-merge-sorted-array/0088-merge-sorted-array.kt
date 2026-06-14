class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        //nums1를 수정 
        //nums1.length == m+n 
        if(n==0){
            return 
        }

        var pointer = 0
        
        for(i in m until m+n){
            nums1[i] = nums2[pointer]
            pointer++
        }
        nums1.sort()
    }
}