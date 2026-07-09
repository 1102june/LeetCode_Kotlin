class Solution {
    fun maxArea(height: IntArray): Int {
        if(height.size == 2){
            return minOf(height[0],height[1])
        }
        var max = 0
        var left = 0
        var right = height.size-1

        while(left < right){
            val sum = (right-left) * (minOf(height[left], height[right]))
            if(sum > max){
                max = sum
            }
            // left, right pointer를 어떻게 움직일것인가
            if(height[left] < height[right]){
                left++
            }
            else{
                right--
            }
        } 
        return max
    }
}