class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        var left = 0
        var right = s.length-1
        var a = s.toCharArray()

        if(s.length == 1){  //예외처리
            return s
        }
        while(left < right){
            if(a[left] !in vowels){
                left++
            }
            else if(a[right] !in vowels){
                right--
            }  
            if(a[left] in vowels && a[right] in vowels){
                val temp = a[left]
                a[left] = a[right]
                a[right] = temp

                right--
                left++
            }
        }  
        return String(a)
    }
}