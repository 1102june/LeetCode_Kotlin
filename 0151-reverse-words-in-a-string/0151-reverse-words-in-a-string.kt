class Solution {
    fun reverseWords(s: String): String {
        val a = s.trim().split(" ").filter{it.isNotEmpty()}
        var result = StringBuilder() //어떻게 선언해야하는가

        for(i in a.size-1 downTo 0){
            result.append(a[i])
            if(i != 0 ){ 
                result.append(" ")
            }
        } 
        return result.toString()
    }
}