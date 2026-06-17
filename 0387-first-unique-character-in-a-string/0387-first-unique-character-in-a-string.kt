class Solution {
    fun firstUniqChar(s: String): Int {
        // 일단 문자 개수대로 map만들기
        val map = s.groupingBy{it}.eachCount()  //개수대로 map만들었음
        
        for(i in 0 until s.length){
            if(map[s[i]] == 1){
                return i
            } 
        } 

        return -1
    }
}