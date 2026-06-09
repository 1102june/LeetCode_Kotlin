class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        if(numbers.size == 2){
            result[0]=1
            result[1]=2
        } 
        var left = 0
        var right = numbers.size-1

        while(left<right){
            val sum = numbers[left] + numbers[right] 
            if(sum < target){
                left++
            }
            else if(sum > target){
                right--
            } 
            else{
                result[0] = left+1
                result[1] = right+1
                break
            }
        }
        return result 
    }
}