class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = 10000
        var max = 0

        for(i in prices){
            if(i < min){
                min = i // 최소값 갱신
            } 
            else if(i-min > max){
                max = i - min 
        }
    }
    return max 
    }
}