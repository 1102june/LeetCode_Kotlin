class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for(i in strs){
            val sortedKey = i.toCharArray().sorted().joinToString("")
            if(!map.containsKey(sortedKey)){ //key값의 방이 없으면 방만들기
                map[sortedKey] = mutableListOf()
            }
            map[sortedKey]?.add(i) //방이 존재하다면 거기다가 방 집어넣음 
        } 
        return map.values.toList()
    }
}