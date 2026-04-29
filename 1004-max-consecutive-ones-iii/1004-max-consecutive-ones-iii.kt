class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var zero = 0
        var maxLen = 0

        for(right in nums.indices){ //right = 0,1,2..
            if(nums[right] == 0){  //그냥 right는 0 만나면 Zero++
                zero++
            } 
            while(zero > k){  //zero의 개수가 k보다 큰경우에만 수행
                if(nums[left] == 0){
                    zero--    //left는 0번인덱스부터 출발, 만나면 Zero--
                } 
                left++
            }
            maxLen = max(maxLen, right-left+1)  
        }  
        return maxLen 
    }
}