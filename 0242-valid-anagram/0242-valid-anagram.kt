class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // 글자개수, value가 일치하는가 확인 
        val s1 = s.groupingBy{ it }.eachCount()
        val t1 = t.groupingBy{ it }.eachCount()

        return s1==t1
    }
}