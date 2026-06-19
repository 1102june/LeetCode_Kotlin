class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val arr= s.toCharArray()
        var left = 0 
        var right = s.length-1
        while(left < right){
            val a = arr[left] in vowels
            val b = arr[right] in vowels

            if(a==true && b==true){
                val temp = arr[left]
                arr[left] = arr[right]
                arr[right] = temp
                left++
                right--
            }
            if (a==true && b==false){
                right--
            } 
            if (a==false && b==true){
                left++
            } 
            if (a==false && b==false){
                left++
                right--
            } 
        } 
    return String(arr)
    }
}