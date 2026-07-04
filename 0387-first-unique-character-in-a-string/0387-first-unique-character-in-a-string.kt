class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()

        for(i in 0 until s.length){
            val ch1 = s[i]
            map[ch1] = map.getOrDefault(ch1, 0)+1 
        } 
        for(j in 0 until s.length){
            val ch2 = s[j]
            if(map[ch2] == 1){
                return j
            } 
        }
        return -1 
    }
}