class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        //만약 nums의 길이가 1이면 [0] return하는 예외처리
        if(nums.size == 1){
            return 
        }
        var zero = 0 //0이 들어있는 위치의 인덱스값저장

        for(i in 0 until nums.size){
            if(nums[i] != 0){
                val temp = nums[zero]
                nums[zero] = nums[i]
                nums[i] = temp
                
                zero++
            }
        }
        //return type이 unit이면 void와같은거임, return 할필요 x
    }
}