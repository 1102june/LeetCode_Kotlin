class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        //key값에다가 인덱스 위치집어넣고 비교
        val result = mutableMapOf<Int, Int>()

        for(i in nums.indices){
            if(result.containsKey(nums[i])){
                val pastIndex = result[nums[i]]!! // 옛날 장부 가져오기
                val a = i - pastIndex //찾은 키값이랑 현재 키값이랑 빼버림
                if(a<= k){
                    return true
                } 
            }
            result[nums[i]] = i //장부에 [숫자:방번호] 집어넣기 
        } 
        return false
    }
}