class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var pt1 = 0 
        var pt2 = 0

        while(pt1 < s.length && pt2 < t.length){
            if(s[pt1] == t[pt2]){
                pt1++
                pt2++
            }
            else
                pt2++
        }
        if (pt1==s.length){
            return true
        }
        else   
            return false
        
    }
}