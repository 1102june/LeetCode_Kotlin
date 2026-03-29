class Solution {
    fun reverseVowels(s: String): String {
        //0. String으론 계산이 불가능하니까 Char 배열로 변경
        val arr = s.toCharArray()
        //1. 모음 모아둔 변수설정
        val vowels = "aeiouAEIOU"
        //2. pointer1, pointer2 정의
        var pointer1 = 0
        var pointer2 = arr.size-1

            while(pointer1 < pointer2) {
            if(arr[pointer1] !in vowels){
                pointer1++
            } 
            else if(arr[pointer2] !in vowels){
                pointer2-- 
        }
        else{
            val temp = arr[pointer1]
            arr[pointer1] = arr[pointer2]
            arr[pointer2] = temp

            pointer1++
            pointer2--
        }
    }
    return String(arr)
}
}