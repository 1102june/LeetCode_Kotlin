class Solution {
    fun reverseWords(s: String): String {
        //앞뒤 공백제거, 연속된 공백제거
        val a = s.trim().split(" ").filter{ it.isNotEmpty() }

        val result = StringBuilder()

        for(i in a.size-1 downTo 0){
            result.append(a[i])
            if(i != 0){ //마지막에 공백추가되지않도록 예외처리
                result.append(" ") // 단어박스 하나 집어넣고 공백추가
            }
        } 
        return result.toString()
    }
}