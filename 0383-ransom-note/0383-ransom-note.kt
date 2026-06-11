class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val result = mutableMapOf<Char, Int>()

        for(i in magazine){
            result[i] = result.getOrDefault(i,0)+1 
        }
        for(j in ransomNote){
            if(result.getOrDefault(j,0) == 0){
                return false
            } 
            result[j]=result[j]!!-1
        } 
        return true 
    }
}