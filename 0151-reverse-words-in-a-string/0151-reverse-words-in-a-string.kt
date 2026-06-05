class Solution {
    fun reverseWords(s: String): String {
        val a = s.trim().split(" ").filter{it.isNotEmpty()}
//양쪽 공백, split을 활용해서 empty 공백인경우를 제외하고 잘라서 배열에 담기
        val result = StringBuilder()
        for(i in a.size-1 downTo 0){
            result.append(a[i])
        if(i != 0){
            result.append(" ")
        } 
    }
        return result.toString()

    }
}