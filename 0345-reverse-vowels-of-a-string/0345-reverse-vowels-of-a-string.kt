class Solution {
    fun reverseVowels(s: String): String {
        //stringbuilder x
        val a = s.toCharArray() // char형 배열로 변경
        val vowels = "aeiouAEIOU"

        var left = 0 
        var right = s.length -1 
        while(left < right){
            if(a[left] !in vowels){
                left++
            } 
            else if(a[right] !in vowels){
                right--
            } 
            else if(a[left] in vowels && a[right] in vowels){
                val temp = a[left]
                a[left] = a[right]
                a[right] = temp
                left++
                right--
            }  
        }
        return String(a)
    }
}