class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = mutableListOf<Boolean>()
        // mutableListOf 뚜껑이 열린 빈상
        val maxCan = candies.max() //리스트에서 최댓값 구하는 함수
        //cadies 배열에서의 최댓값 maxCan
        //candies 배열에서 최댓값을 어떻게 구할것인가
        //반복문을 통해 extraCandies를 더했을때의 값과 maxCan 비교
        for (i in 0 until candies.size){
            if((candies[i] + extraCandies) >= maxCan)
                result.add(true) //list에선 .add()
            else 
                result.add(false)
        }
        // Result 에 true or false 집어넣고 return
        return result
    }
}