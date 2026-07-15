class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size == 1){
            return 1
        } 
        //set, sort하고 다음인덱스랑 1차이나면 result++
        //O(n) time, sorted 하는순간부터 O(NlogN)

        val set = nums.toSet() // 중복제거, O(N)
        var maxStreak = 0 

        for(i in set){
            if(!set.contains(i-1)){  //맨앞칸이 아니라면. 결국 시작점 찾기
                var currNum = i
                var currStreak = 1  //기차 길이가 1로시작함. 
                while(set.contains(currNum +1)){ 
                    currNum++
                    currStreak++
                }
                maxStreak = maxOf(maxStreak, currStreak)
            }
        }
        return maxStreak
    }
}