class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var rpivot = 0 //right pivot
        // 0번 인덱스 제외하고 다 더하기
        for(i in 1 until nums.size){
            rpivot += nums[i]
        }
        //0번 인덱스, 끝번 인덱스 제외 다 더한값이 0이면 0 return
        if(rpivot == 0){
            return 0
        } 
        var lpivot = 0 //leftpivot

        for(j in 1 until nums.size){
            lpivot += nums[j-1]  //leftpivot에는 피봇값 점점추가
            rpivot -= nums[j] //rightpivot에는 피봇값 점점삭제
            if(lpivot == rpivot){ //좌측 우측 피봇값 같으면 해당 인덱스값 i return
                return j
            } 
        }
        return -1 
    }
}