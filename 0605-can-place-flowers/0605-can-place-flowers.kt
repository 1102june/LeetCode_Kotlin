class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        //0. 1을 박을건데 1을 박을수를 count함.
        var count = 0
        //1. n=0이면 true return
        if (n==0) return true
        // 2. for문으로 flowerbed돌기 
        for(i in 0 until flowerbed.size){
            if(flowerbed[i] == 0){ //flowerbed[i]가 0일때
                val left = (i==0 || flowerbed[i-1]==0)  //[i]를 기준으로 좌측 인덱스가 0이거나 0번째 인덱스인 경우 
                val right = (i==flowerbed.size-1 || flowerbed[i+1]==0) //[i]를 기준으로 우측 인덱스가 0이거나 맨 끝 인덱스인 경우
                if (left && right){
                    flowerbed[i] = 1
                    count++
                }
            }
        }
        if (count >= n){
            return true
        }
        else
            return false
    }
}