class Solution {
    fun makeGood(s: String): String {
        val stack = ArrayDeque<Char>()

        for(i in s){
            if(stack.isNotEmpty()){ 
                if(stack.last()+32 == i || stack.last()-32 == i){
                    stack.removeLast()
                }
                else{
                    stack.add(i)
                }
            }
            else{
                stack.add(i)
            }
        }
        return stack.joinToString("")
    }
}