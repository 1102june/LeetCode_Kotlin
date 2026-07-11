class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size-1
        var result = 0
        while(left < right){
            val sum = (right - left) * minOf(height[left], height[right])
            if(result < sum){
                result = sum
            } 
            if(height[left] < height[right]){ //벽끼리 높이 비교해서 더 짧은쪽 포인터 버리기
                left++
            }
            else {
                right--
            }
        }
        return result
    }
}