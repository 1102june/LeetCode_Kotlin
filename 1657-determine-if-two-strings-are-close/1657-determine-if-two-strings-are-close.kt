class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        //1. 문자열 길이가 다르면 false 예외처리
        if(word1.length != word2.length){
            return false
        } 
        //2. 문자 개수대로 map만들기
        val map1 = word1.toList().groupingBy{it}.eachCount()
        val map2 = word2.toList().groupingBy{it}.eachCount()

        //3. key값 추출
        val map1_keys = map1.keys
        val map2_keys = map2.keys
        //4. value값 추출 -> sorteㅇ 되어있어야함
        val map1_values = map1.values.sorted()
        val map2_values = map2.values.sorted()

        if(map1_keys == map2_keys && map1_values == map2_values) {
            return true
        }
        else 
            return false

    }
}