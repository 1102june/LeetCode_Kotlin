class Solution {
    fun largestAltitude(gain: IntArray): Int {
        // start altitude = 0
        var max = 0
        if(gain[0]> max){
            max = gain[0]
        }
        for(i in 1 until gain.size){
            gain[i] = gain[i-1] + gain[i] // 다음 고도값이랑 현고도값이랑 합해서 넣기
            if(gain[i] > max){  //고도값이 이전보다 높아지면 교체
                max = gain[i]
            } 
        } 
        return max
        
    }
}