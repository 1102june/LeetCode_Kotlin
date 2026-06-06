class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        var map = arr.toList().groupingBy{it}.eachCount() // 개수 세서 맵으로 만들어냄
        var values = map.values.toSet()

        return values.size == map.size
    }
}