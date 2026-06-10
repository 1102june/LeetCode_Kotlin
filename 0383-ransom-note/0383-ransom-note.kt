class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = mutableMapOf<Char, Int>()
        
        for (char in magazine) {
            magazineMap[char] = magazineMap.getOrDefault(char, 0) + 1
        }

        for (char in ransomNote) {
            if (magazineMap.getOrDefault(char, 0) == 0) {
                return false
            }
            magazineMap[char] = magazineMap[char]!! - 1
        }

        return true
    }
}