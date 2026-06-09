class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var arr = IntArray(2)
        var left = 0 
        var right = numbers.size-1

        if(numbers.size == 2){
            arr[0]=1
            arr[1]=2
        } 
        while(left < right){
            var sum = numbers[left] + numbers[right]
            if(sum < target){
                left++
            } 
            else if(sum > target){
                right--
            } 
            else{
                arr[0] = left+1
                arr[1] = right+1
                break
            }
        }        
        return arr 
    }
}