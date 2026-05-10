class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        if(gain[0] > max){
            max = gain[0]
        }
        //처음엔 i+1로 돌리려 했는데 그러니까 outofBounds떠서 수정
        //만약 0번인덱스에서 최대 altitude 나오는 경우를 따지지를 않는 상황 발생
        for(i in 1 until gain.size){
            gain[i] = gain[i]+gain[i-1]
            if(gain[i] > max){
                max = gain[i]
            }
        }
        return max
         
    }
}