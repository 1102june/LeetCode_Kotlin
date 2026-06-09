class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        if(flowerbed.size == 1){  
            if(flowerbed[0]==1){
                return n == 0
            } 
            else{
                return n <= 1
            }
        } 
        if(flowerbed[0]==0){
            if(flowerbed[1]==0){
                flowerbed[0] = 1
                count++
            }  
        } 
        if(flowerbed[flowerbed.size-1]==0){
            if(flowerbed[flowerbed.size-2]==0){
                flowerbed[flowerbed.size-1] = 1
                count++
            }  
        }
        for(i in 1 until flowerbed.size-1){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1
                count++
            }
        }  
        return n <= count
    }
}