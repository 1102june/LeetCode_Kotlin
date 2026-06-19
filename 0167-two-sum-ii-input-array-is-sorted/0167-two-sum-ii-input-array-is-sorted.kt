class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // index 2개 리턴
        // 원래 numbers가 오름차순이란점 
        val result = IntArray(2)
        var left = 0
        var right = numbers.size-1

        if(numbers.size == 2){
            result[0] = numbers[0]
            result[1] = numbers[1]
        }

        while(left < right){
            if(numbers[left] + numbers[right] < target){
                left++
            }
            if(numbers[left] + numbers[right] > target){
                right--
            }
            else if(numbers[left] + numbers[right] == target)  {
                result[0] = left+1
                result[1] = right+1
                break
            }
        }
        
        return result 
    }
}