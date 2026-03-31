class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        
        val result = IntArray(n){ 1 } //결과 담을 배열 생성

        // 기준으로 오른쪽 값 다 곱해서 result에 집어넣기
        var leftMulti = 1
        for (i in 0 until n){
            result[i] = leftMulti
            leftMulti = leftMulti * nums[i]
        }

        var rightMulti = 1
        for(i in n-1 downTo 0){
            result[i] = result[i] * rightMulti
            rightMulti = rightMulti * nums[i]
        } 
        return result
    }
}