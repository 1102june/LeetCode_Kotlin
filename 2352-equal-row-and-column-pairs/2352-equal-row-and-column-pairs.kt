class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        //결론적으로 values만 일치하면그만
        //행, 열을 따로 집어넣어서 서로 일치하는 values 비교?
        var count = 0 
        val rowMap = grid.map{it.toList()}.groupingBy{it}.eachCount()

        for(c in 0 until grid.size){
            val col = mutableListOf<Int>()
            for(r in 0 until grid.size){
                col.add(grid[r][c])
                }
                val matchCount = rowMap[col]
                if(matchCount != null){
                count+=matchCount
            } 
        }
    return count
    }
}