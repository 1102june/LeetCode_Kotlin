class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val totalSum = nums.sum() 
        var leftSum = 0           
        for (i in nums.indices) {
            // 오른쪽 합 = 전체 합 - 왼쪽 합 - 현재 숫자(피벗 후보)
            val rightSum = totalSum - leftSum - nums[i]

            // 왼쪽과 오른쪽이 같다면? 여기가 바로 피벗(Pivot)!
            if (leftSum == rightSum) {
                return i
            }
            leftSum += nums[i]
        }
        // 끝까지 못 찾으면 -1
        return -1
    }
}