class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var m = accounts.size
        var n = accounts[0].size

        var max = 0
        for(i in 0 until m){
            var sum = 0
            for(j in 0 until n){
                sum += accounts[i][j]
            }
            if(sum > max)
                max = sum 
        }    
    return max
    }
}