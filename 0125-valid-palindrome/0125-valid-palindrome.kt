class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.isEmpty()){ return true}
        val result1 = StringBuilder()
        val result2 = StringBuilder()

        for(i in 0 until s.length){
            if (s[i] in 'a'..'z' || s[i] in 'A'..'Z' || s[i] in '0'..'9'){
                result1.append(s[i].lowercase())
            } 
        } 
        for(j in s.length-1 downTo 0){
            if(s[j] in 'a'..'z' || s[j] in 'A'..'Z'|| s[j] in '0'..'9'){
                result2.append(s[j].lowercase())
            } 
        }
        return result1.toString() == result2.toString()
         
    }
}