class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val n = accounts.size 
        val m = accounts[0].size
        var result = 0
        for(i in 0 until n){
            var sum = 0
            for(j in 0 until m){
                sum+= accounts[i][j]
            } 
            if(result < sum) 
            result = sum
        } 
        return result
    }
}