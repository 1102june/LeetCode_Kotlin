class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        var result = 0
        // C는 pop 1회
        // D는 pop 한뒤 x2 해서 push
        // +는 pop 2개한뒤 + 해서 push

        for(i in 0 until operations.size){
                if(operations[i] == "C"){
                    stack.removeLast() // pop 1회
                    }
                else if(operations[i]  == "D"){
                    stack.add(stack.last() * 2)  //stack.last()는 제거안함. 
                    }
                else if(operations[i] == "+"){
                    stack.add(stack[stack.size-1] + stack[stack.size-2]) 
                }
                else{
                stack.add(operations[i].toInt())
                    }  
            } 

        for(j in stack){
            result+=j
        } 
        return result    
    }   
}