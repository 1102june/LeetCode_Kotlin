class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val arr = s.toCharArray() //string을 CharArray로 수정
        var pointer1 = 0
        var pointer2 = s.length-1

        while(pointer1 < pointer2){
            if(arr[pointer1] !in vowels){
                pointer1++
                }
            else if(arr[pointer2] !in vowels){
                pointer2--
            }
            else if(arr[pointer1] in vowels && arr[pointer2] in vowels){
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