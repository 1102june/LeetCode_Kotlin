class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stack1 = ArrayDeque<Char>()
        val stack2 = ArrayDeque<Char>()

        for(i in 0 until s.length){
                if(s[i] == '#'){
                    if(stack1.isNotEmpty()){ 
                    stack1.removeLast()
                    }
            }
                else{
                    stack1.add(s[i])
                }
        }
        for(j in 0 until t.length){
            if(t[j] == '#'){
                if(stack2.isNotEmpty()){ 
                stack2.removeLast()
                }
            }
            else{
                stack2.add(t[j])
            } 
        }
        return stack1 == stack2
    }
}