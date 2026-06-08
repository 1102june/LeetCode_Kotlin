class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        //extra candy를 부여했을때 해당 Array에서 최대값인지 True, false
        //새로운 List선언
        val result = mutableListOf<Boolean>()
        val max = candies.maxOrNull()!!
        /*val sort = candies.sorted()
        val max = sort[candies.size-1]
*/
        for(i in 0 until candies.size){
            if(candies[i]+extraCandies >= max){
                result.add(true)
            }
            else{
                result.add(false)
            }
        } 
        return result
    }
}