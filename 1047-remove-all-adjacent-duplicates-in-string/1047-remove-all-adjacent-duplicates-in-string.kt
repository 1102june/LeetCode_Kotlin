class Solution {
    fun removeDuplicates(s: String): String {
        val stack = ArrayDeque<Char>()
        val result = StringBuilder()

        for(i in s){
            if(stack.isEmpty() || stack.lastOrNull() != i){
                stack.add(i) 
            } 
            else{
                stack.removeLast()
            } 
        }
        for(j in stack){
            result.append(j) 
        }  
        return result.toString()
    }
}