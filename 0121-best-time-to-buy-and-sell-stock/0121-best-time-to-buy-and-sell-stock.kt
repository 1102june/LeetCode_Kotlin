class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = 1000000

        var max = 0

        for(i in prices){
            if(i <  min){
                min = i
            } 
            else if(i - min > max){
                max = i - min
            } 
        }
        return max 
    }
}