class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()

        for(i in 0 until s.length){
            val a = s[i]
            map[a] = map.getOrDefault(a,0)+1
        } 
        //2차 순회하면서 map의 value가 1인값 찾으면 바로 해당 index return
        for(j in 0 until s.length){
            val b = s[j]
            if(map[b] == 1){
                return j
            } 
        }
        return -1 
    }
}