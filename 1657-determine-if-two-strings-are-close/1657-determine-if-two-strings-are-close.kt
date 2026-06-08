class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        //swap, transform 
        //1. 예외처리: string의 길이가 다르면 false return
        if(word1.length != word2.length){
            return false
        } 
        // 문자 개수대로 map만들기
        val a1 = word1.toList().groupingBy{it}.eachCount()
        val b1 = word2.toList().groupingBy{it}.eachCount()

        //keys, values 따로
        val a2 = a1.keys.sorted()
        val b2 = b1.keys.sorted()

        val a3 = a1.values.sorted()
        val b3 = b1.values.sorted()

        return (a2==b2 && a3==b3)  //결론적으로 a2,b2 와 a3,b3가 완전히 같아야함

    }
}