class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (i in s) {
            // 1단계: 열린 괄호면 무조건 스택에 쌓는다!
            if (i == '(' || i == '{' || i == '[') {
                stack.add(i)
            } 
            // 2단계: 닫힌 괄호면 else로 들어온다! (i는 이제 ), }, ] 중 하나임)
            else {
                // [방어] 통이 비어있으면 닫을 수가 없으니 아웃!
                if (stack.isEmpty()) {
                    return false
                } 
                
                // 🔴 꺼내는 행위(removeLast)는 무조건 이 'else' 안에서만 일어나야 합니다!
                val top = stack.removeLast()  
                
                // 🔴 i(현재 글자)는 닫힌 모양, top(꺼낸 글자)은 열린 모양!
                if ((i == ')' && top != '(') || 
                    (i == ']' && top != '[') || 
                    (i == '}' && top != '{')) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}