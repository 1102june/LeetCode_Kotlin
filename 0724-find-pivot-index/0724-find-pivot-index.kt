class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var lpivot = 0
        var rpivot = 0
        for(i in 1 until nums.size){
            rpivot+=nums[i] 
        }
        if(rpivot == 0){
            return 0
        }  
        for(j in 1 until nums.size){
            lpivot+=nums[j-1]
            rpivot-=nums[j]
            if(lpivot == rpivot){
                return j
            }
        }
        return -1
    }
}