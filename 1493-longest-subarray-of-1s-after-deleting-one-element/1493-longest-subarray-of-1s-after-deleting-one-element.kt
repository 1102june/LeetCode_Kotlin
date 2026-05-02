class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var a = 0
        var b = 0
        var maxLen = 0 
        var zero = 0 
        
        for(a in nums.indices){
            if(nums[a]==0){
                zero++
            }
            while(zero > 1){
                if(nums[b]==0){
                    zero--
                }
                b++ 
            } 
            maxLen = max(maxLen, a-b) 
            // a-b+1할필요없음 어차피 element한개 삭제 필수.
        }
        if(maxLen==0&&nums[0]==0){
            return 0 //배열에 0이없는경우 예외처리
         }
        else{
            return maxLen
        }  
    }
}