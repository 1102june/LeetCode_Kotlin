class Solution {
    fun firstUniqChar(s: String): Int {
        val map = s.groupingBy{it}.eachCount()

        for(i in s.indices){
            if(map[s[i]] == 1){
                return i
            } 
        }
        return -1
    }
}