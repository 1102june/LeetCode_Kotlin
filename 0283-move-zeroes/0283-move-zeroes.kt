class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var pt2 = 0

        for(pt1 in 0 until nums.size){ 
            //pt1이 가리키는 인덱스가 0이 아닌 숫자를 pt2인덱스 자리에 꽂음
            if(nums[pt1]!=0){
                nums[pt2] = nums[pt1]
                pt2++
            } 
        } 
        while(pt2 < nums.size){ //pt2가 가리키는 곳에서부터 끝까지 0으로 채움
            nums[pt2] = 0
            pt2++
        }
    }
}