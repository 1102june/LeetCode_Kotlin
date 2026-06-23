class Solution {
    fun removeDuplicates(s: String): String {
        //stack에 담으면서 연속된 두개 문자면 그냥 pop해버림
        val stack = ArrayDeque<Char>()
        val result = StringBuilder()

        for(i in s){
            if(stack.isEmpty() || stack.lastOrNull()!= i){
                stack.add(i)
            }
            else{
                stack.removeLast()  //stack위에있는게 같은 문자면 그냥 pop
                //removeLast는 맨위에꺼 무조건 꺼내는 함
            }
        }
        //stack에서 맨앞부터빼야함
        for(j in stack){
            result.append(j) 
        }
        return result.toString() 
        
    }
}