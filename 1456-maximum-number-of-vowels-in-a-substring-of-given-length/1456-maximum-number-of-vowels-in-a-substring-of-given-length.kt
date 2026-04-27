class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var vowels = "aeiou"
        var curr = 0  //현재값
        var max = 0 // 최댓값

        for (i in 0 until k){
            if(s[i] in vowels){  // 최초 K까지 반복
                curr++
            } 
        }
        max = curr  //일단 max에 저장

        for(j in k until s.length){
            if(s[j] in vowels){ //새로 들어오는값이 Vowel이면 curr++
             curr++ 
            }
            if(s[j-k] in vowels){ //나가는값이 Vowel이면 curr--
                curr--
            }
            if (curr > max)  //최댓값이면 Max값 교체
                max = curr 
        } 
        return max 
    }
}