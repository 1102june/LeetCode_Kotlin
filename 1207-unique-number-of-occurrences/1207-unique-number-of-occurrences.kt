class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val a = arr.toList().groupingBy(){it}.eachCount() //map

        val a_set = a.values.toSet() //value값 set으로 변환
        return a.count() == a_set.count()
        }
}