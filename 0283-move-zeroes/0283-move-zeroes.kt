class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var pt2 = 0   //최종적으로 이위치부터 0 채울거임
        
        for(pt1 in 0 until nums.size){
            if(nums[pt1] != 0){
                nums[pt2] = nums[pt1]
                pt2++
            } 
        } 

        while(pt2 < nums.size){
            nums[pt2] = 0
            pt2++
        } 
    }
}