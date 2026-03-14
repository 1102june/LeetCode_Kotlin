class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        // 1. 심을 꽃이 0개면 화단을 볼 필요도 없이 성공! (빠른 퇴근)
        if (n == 0) return true
        
        var planted = 0 // 내가 심은 꽃의 개수
        
        // 2. 화단을 0번부터 끝까지 걸어갑니다 (이게 Greedy의 시작)
        for (i in 0 until flowerbed.size) {
            
            // 3. 내 자리가 비어있을 때만 양옆을 살핍니다
            if (flowerbed[i] == 0) {
                
                // 4. 왼쪽, 오른쪽이 비어있는지(또는 벽인지) 확인
                val emptyLeft = (i == 0 || flowerbed[i - 1] == 0)
                val emptyRight = (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
                
                // 5. 심을 수 있는 완벽한 조건이라면? 
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1 // 당장 심는다! (이 행동이 Greedy의 핵심)
                    planted += 1     // 심은 개수 추가
                    
                    // 6. 목표량을 다 채웠으면 남은 화단은 검사할 필요도 없이 성공!
                    if (planted >= n) {
                        return true
                    }
                }
            }
        }
        
        // 끝까지 다 돌았는데도 목표량을 못 채웠으면 실패
        return planted >= n
    }
}