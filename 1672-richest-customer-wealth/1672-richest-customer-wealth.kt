class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val a = accounts.size
        val b = accounts[0].size

        var result = 0

        for(i in 0 until a){
            var sum = 0 
            for(j in 0 until b){
                sum += accounts[i][j]
            }
            if(result < sum){
                result = sum
            } 
        }
        return result   
    }
}