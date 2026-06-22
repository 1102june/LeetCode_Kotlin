class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var min = 100000

        for(i in prices){
            if(i < min){
                min = i
            } 
            if(i - min> max){
                max = i - min
            } 
        }
        return max 
    }
}