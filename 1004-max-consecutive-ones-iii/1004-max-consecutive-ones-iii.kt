class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        // k개수 만큼 0을 1로 Flip가능, 그때 연속된 1의 최대길이
        var a = 0 
        var b = 0 
        var maxLen = 0 
        var zero = 0

        for(a in nums.indices){
            if(nums[a] == 0){
                zero++ 
                //a는 처음부터 그냥 출발하여 0의 개수를 Count하면서 지나감
            } 
            while(zero > k){
                if(nums[b] == 0){
                    zero--               
                }
                b++
                //b는 a가 센 0의개수가 k의 수보다 많은 조건에만 발동
                // 0인경우를 찾아서 빼버림
            } 
            maxLen = max(maxLen, a-b+1)
        } 
        return maxLen
    }
}