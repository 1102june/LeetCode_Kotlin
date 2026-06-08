class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        //1. flowerbed 길이가 1인경우 예외 처리
        var count = 0

        if(flowerbed.size == 1){
            if(flowerbed[0] == 0){
                count++
            }
            return count >= n   
        }

        //2. 0번 인덱스가 0인경우 
        if(flowerbed[0] == 0 && flowerbed[1]==0){
            flowerbed[0]=1
            count++
        } 
        //3. 마지막 인덱스가 0인경우
        if(flowerbed[flowerbed.size-1] == 0 && flowerbed[flowerbed.size-2]==0){
            flowerbed[flowerbed.size-1]= 1
            count++
        } 
        //4. 중간 인덱스계산
        for(i in 2 until flowerbed.size-1){
            if(flowerbed[i-1] == 0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i] = 1
                count ++
            }
        }
        return count >= n       
}
}