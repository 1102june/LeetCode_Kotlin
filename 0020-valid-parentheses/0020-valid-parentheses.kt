class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(i in s){
            if(i == '('|| i == '['|| i == '{'){
                stack.add(i)
            }
            else{
                if(stack.isEmpty()){return false} 
                val top = stack.removeLast()
                if(i == ')' && top!= '('|| i == ']' && top!= '[' || i =='}' && top!= '{'){
                    return false
                }
            } 
        }
        return stack.isEmpty()
    }
}