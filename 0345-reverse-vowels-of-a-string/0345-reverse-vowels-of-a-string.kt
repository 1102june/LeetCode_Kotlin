class Solution {
    fun reverseVowels(s: String): String {
        // 1. 문자열 s에서 모음 찾기 -> 배열로 변경 (질문자님 아이디어 100% 적중!)
        val arr = s.toCharArray()
        
        // 우리가 컴퓨터에게 알려줄 '모음 리스트' (대소문자 모두 포함)
        val vowels = "aeiouAEIOU"
        
        // 투 포인터 준비 (양끝 손가락)
        var left = 0
        var right = arr.size - 1
        
        // 두 손가락이 교차하기 전까지 계속 반복
        while (left < right) {
            
            // 왼쪽 손가락: 모음이 아니면 계속 오른쪽으로 한 칸씩 전진!
            while (left < right && arr[left] !in vowels) {
                left++
            }
            
            // 오른쪽 손가락: 모음이 아니면 계속 왼쪽으로 한 칸씩 전진!
            while (left < right && arr[right] !in vowels) {
                right--
            }
            
            // 둘 다 모음을 찾아서 멈췄다면? 서로 위치 바꾸기! (질문자님 아이디어: 모음 reverse)
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            
            // 바꿨으니 다음 칸으로 마저 이동
            left++
            right--
        }
        
        // 다시 집어넣고 string 변환 후 return (질문자님 아이디어 100% 적중!)
        // CharArray를 다시 String으로 만드는 방법입니다.
        return String(arr) 
    }
}
