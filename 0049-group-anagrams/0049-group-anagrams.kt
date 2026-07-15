class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for(i in strs){
            val sortedKey = i.toCharArray().sorted().joinToString("")
            if(!map.containsKey(sortedKey)){
                map[sortedKey] = mutableListOf()
            }
            map[sortedKey]?.add(i)
        } 
        return map.values.toList()
    }
}