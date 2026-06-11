class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        //magazine에 있는 문자들로 ransomNote를 만들수 있냐 없냐
        val result = mutableMapOf<Char,Int>()

        for(i in magazine){
            result[i] = result.getOrDefault(i,0)+1 
            // result라는 map에다가 magazine의 문자인 i가있는지, 없으면 1추가
        }
        for(j in ransomNote){
            if(result.getOrDefault(j,0)==0){
                return false
            } 
            result[j] = result[j]!!-1
        } 
        return true
    }
} 