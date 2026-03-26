class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val arr = s.toCharArray()
        
        var start = 0
        var end = arr.size - 1

        // 든든한 메인 브레이크 딱 하나! 여기서만 검사합니다.
        while (start < end) {
            
            // 1. 왼쪽이 모음이 아니야? 그럼 왼쪽만 한 칸 가고 이번 턴 종료!
            if (arr[start] !in vowels) {
                start++
            }
            // 2. (왼쪽은 모음인데) 오른쪽이 모음이 아니야? 그럼 오른쪽만 한 칸 가고 이번 턴 종료!
            else if (arr[end] !in vowels) {
                end--
            }
            // 3. 둘 다 모음이라고? (위의 if문을 다 통과했으니까!) 그럼 바꿔!!
            else {
                val temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                
                // 바꾸고 나서 한 칸씩 이동
                start++
                end--
            }
        }

        return String(arr)
    }
}