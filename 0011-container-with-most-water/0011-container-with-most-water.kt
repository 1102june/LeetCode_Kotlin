class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0// 왼쪽 포인터
        var right = height.size-1// 오른쪽 포인터
        var max = 0 //최대값

        while (left < right){
            if(max < ((right - left)* min(height[left], height[right]))) 
            //직사각형 넓이 구하기
                max = ((right - left)* min(height[left], height[right]))
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