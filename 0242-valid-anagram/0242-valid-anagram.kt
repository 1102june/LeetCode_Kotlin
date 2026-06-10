class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val smap = s.toList().groupingBy{it}.eachCount()
        val tmap = t.toList().groupingBy{it}.eachCount()

        return smap == tmap

    }
}