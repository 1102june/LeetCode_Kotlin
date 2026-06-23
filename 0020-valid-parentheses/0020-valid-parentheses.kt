class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for(i in s){
            if(i == '{' || i == '[' || i == '('){
                stack.add(i) 
            } 
            else {
                if(stack.isEmpty()) { return false}
                val pop = stack.removeLast()
                if(i == '}' && pop != '{' || i == ']' && pop != '[' || i == ')' && pop != '(') {
                    return false
                } 
            }
        } 
        return stack.isEmpty()
    }
    }
