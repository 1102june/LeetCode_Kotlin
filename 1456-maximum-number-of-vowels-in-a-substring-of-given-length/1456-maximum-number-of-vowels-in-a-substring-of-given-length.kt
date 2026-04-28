class Solution {
    fun maxVowels(s: String, k: Int): Int {
    //k개씩 배열검사해서 최대 모음개수 Return
    var curr = 0 
    var max = 0
    val vowel = "aeiou"

    for(i in 0 until k){ // 0번 인덱스부터 k번까지 돌기
        if(s[i] in vowel){
            curr++
        } 
    } 
    max = curr
    
    for(j in k until s.length){
        if(s[j-k] in vowel){
            curr--
        }
        if(s[j] in vowel){
            curr++
        } 
        if(curr > max){
            max = curr
        } 
    }
    return max

    }
}