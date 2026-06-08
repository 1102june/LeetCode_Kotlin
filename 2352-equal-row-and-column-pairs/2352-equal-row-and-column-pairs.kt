class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        //리스트 덩어리로 Map선언
        var total = 0
        val rowMap = grid.map{it.toList()}.groupingBy{it}.eachCount()

        //열을 담을 list선언후 집어넣기
        for(i in 0 until grid.size){
            val col = mutableListOf<Int>()
            for(j in 0 until grid.size){
                col.add(grid[j][i])
            }
            //행을 집어넣은 map과 열 집어넣은 col을 비교
            var counting = rowMap[col]
                if(counting != null){
                    total+=counting
                }
        }
        return total
    }
}