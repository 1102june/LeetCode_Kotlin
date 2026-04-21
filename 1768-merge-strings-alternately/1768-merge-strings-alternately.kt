class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        // 복습
        val result = StringBuilder()
        val max = maxOf(word1.length, word2.length)

        for(i in 0 until max){

            if(i < word1.length){
                result.append(word1[i])
            } 
            if (i < word2.length){
                result.append(word2[i])
            }
        }
        return result.toString()
        
    }
}