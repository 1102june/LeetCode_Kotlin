class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val arr = s.toCharArray()
        
        var start = 0
        var end = arr.size - 1
        
        while (start < end) {
            if (arr[start] !in vowels) {
                start++
            }
            else if (arr[end] !in vowels) {
                end--
            }
            else {
                val temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                
                start++
                end--
            }
        }

        return String(arr)
    }
}
