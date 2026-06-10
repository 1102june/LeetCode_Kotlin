class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>() // map 만들기

        for(i in magazine){
            map[i] = map.getOrDefault(i,0)+1
        }
        for(j in ransomNote){
            if(map.getOrDefault(j,0)==0){
                return false
            } 
            map[j] = map[j]!!-1
        }  
        return true
        
    }
}