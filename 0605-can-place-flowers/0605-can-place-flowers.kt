class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        // n이 0이면 아무것도 안 심어도 되니까 무조건 true
        if (n == 0) return true
        
        var count = 0 // 내가 새로 심은 꽃의 개수
        
        for (i in 0 until flowerbed.size) {
            // 1. 내 자리가 비어있는지 먼저 확인
            if (flowerbed[i] == 0) {
                
                // 2. 왼쪽과 오른쪽이 비어있는지 확인 (안전 점검)
                // i가 0이면 맨 앞이라 왼쪽을 확인할 필요가 없으므로 true로 넘어감 (|| 연산자 활용)
                val leftEmpty = (i == 0 || flowerbed[i - 1] == 0)
                val rightEmpty = (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
                
                // 3. 양옆이 다 비어있다면?
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1 // ⭐ 핵심: 진짜로 꽃을 심었다고 1로 표시해 둠 (그래야 다음 칸이 얘를 인식함)
                    count += 1       // 심은 개수 1 증가
                    
                    // 만약 목표치(n)만큼 다 심었다면 더 볼 필요 없이 바로 성공!
                    if (count >= n) {
                        return true
                    }
                }
            }
        }
        
        // 끝까지 다 돌았는데도 목표치(n)만큼 못 심었으면 false
        return count >= n 
    }
}