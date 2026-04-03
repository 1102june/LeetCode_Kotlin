class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        //1. 정수형 배열 [1,1,1,1... ] 구조 정의
        val n = nums.size
        val arr = IntArray(n){ 1 }

        var leftpointer = 1
        //leftpointer를 기준으로 오른쪽에 있는 인덱스 다 곱하기
        for (i in 0 until n){
            arr[i] = leftpointer
            leftpointer = leftpointer*nums[i]
        }
        var rightpointer = 1 
        //rightpointe를 기준으로 왼쪽에 있는 인덱스 다 곱하기 
        for (j in n-1 downTo 0){ //downTo
            arr[j] = arr[j] * rightpointer
            rightpointer = rightpointer * nums[j]
        }
        return arr
    }
}