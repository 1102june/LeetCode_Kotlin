class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        //return할 결과값 선언
        val result = StringBuilder()

        //최대 길이값 선언
        val MaxLength = maxOf(word1.length, word2.length)

        for(i in 0 until MaxLength){
            //for(i in 0 until MaxLength) 이렇게 써도됨 
            if(i < word1.length)
                result.append(word1[i])
        
        if(i < word2.length)
                result.append(word2[i])
        }
    
    return result.toString()
    }
}