class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        //1. for문을 돌아
        if (n == 0) return true
        for (i in 0 until flowerbed.size){
            //flowerbed의 i번째 인덱스가 0일때
            if(flowerbed[i] == 0){  //i번 인덱스 값이 0 이면 
                var leftempty = (i==0 || flowerbed[i-1]==0)  //그 기준 좌측값이 0이거나 범위 안인지 확인
                var rightempty = (i == flowerbed.size-1 || flowerbed[i+1]==0)
            if (leftempty && rightempty) {  //둘다 만족한다면 해당 i번째 인덱스에 심고 
                flowerbed[i] = 1
                count ++
            }
        }
        }
        if (count >= n)
            return true
            else return false
        
    }
}
