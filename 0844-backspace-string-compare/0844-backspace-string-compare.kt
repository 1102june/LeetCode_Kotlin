class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stack1 = ArrayDeque<Char>()
        val stack2 = ArrayDeque<Char>()

        for(i in s){
            if(i == '#'){
                    if(stack1.isNotEmpty()){
                        stack1.removeLast()
                    } 
            }
            else{
                stack1.add(i) 
            } 
        }
        for(j in t){
            if(j == '#'){
                if(stack2.isNotEmpty()){
                        stack2.removeLast()
                    } 
            }
            else{
                stack2.add(j) 
            } 
        }
        return stack1.joinToString("") == stack2.joinToString("")
    }
}