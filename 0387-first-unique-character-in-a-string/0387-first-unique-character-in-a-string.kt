class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char,Int>()

        for(i in s){
            map[i] = map.getOrDefault(i,0)+1
        }
        for(j in 0 until s.length){
            val ch = s[j]
            if(map[ch]!! == 1){
                return j
            }
        }  
        return -1
    }
}