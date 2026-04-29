class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var a = 0 
        var b = 0
        var maxLen = 0
        var zero = 0

        for (a in nums.indices){ // a= 0,1,2,3..
            if(nums[a] == 0){
                zero++
            } 
            while(zero > k){
                if(nums[b] == 0){
                    zero--
                } 
                b++
            } 
            maxLen = max(maxLen, a-b+1) //a가 더 앞으로 달려감
        }
        return maxLen
    }
}