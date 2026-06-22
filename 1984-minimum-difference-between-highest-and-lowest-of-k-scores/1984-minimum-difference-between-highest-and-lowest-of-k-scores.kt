class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        if(nums.size == 1 || k==1){
            return 0
        } 
        // sort를 하고 시작할 생각을 할 수있는가
        //k개씩 sliding window하면서 어떻게 뺀값중 최소값을 구할수있는가
        var sort = nums.sorted()
        var min = 100000

        for(i in 0..nums.size-k){
            val low = sort[i] //창문 시작
            val high = sort[i+k-1] // 창문
            val diff = high - low

            if(diff < min){
                min = diff
            } 
        } 
        return min
    }
}