class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s.length == 0){  // 예외처리
            return true
        } 
        var pointer = 0 

        for(i in 0 until t.length){
            if(s[pointer] == t[i]){
                pointer++
                if(pointer == s.length){
                    return true
                } 
            } 
        }
        return false 
        
    }
}