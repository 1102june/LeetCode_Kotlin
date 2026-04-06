class Solution {
    fun compress(chars: CharArray): Int {
        var write = 0 // 결과를 덮어씌울 진짜 위치 (최종 길이)
        var read = 0  // 원본 배열을 탐색하는 정찰병 위치

        while (read < chars.size) {
            val currentChar = chars[read]
            var count = 0

            // 1. 같은 문자가 몇 개 연속되는지 싹 다 카운트
            while (read < chars.size && chars[read] == currentChar) {
                read++
                count++
            }

            // 2. 다 셌으면, write 위치에 현재 알파벳을 딱! 박아줌
            chars[write] = currentChar
            write++

            // 3. 개수가 2개 이상이면, 숫자도 쪼개서 뒤에 박아줌 (예: 12 -> '1', '2')
            if (count > 1) {
                for (c in count.toString()) {
                    chars[write] = c
                    write++
                }
            }
        }
        
        // 최종적으로 조작된 배열의 길이가 바로 write 값!
        return write
    }
}