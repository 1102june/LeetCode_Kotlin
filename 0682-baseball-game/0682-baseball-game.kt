class Solution {
    fun calPoints(operations: Array<String>): Int {
        //+는 앞에 두개 더한뒤 push
        //D는 앞에 점수 두배한뒤 push
        //C는 앞에 점수 삭제
        val stack = ArrayDeque<Int>()
        var result = 0

        for(i in 0 until operations.size){
            if(operations[i] == "+"){
                stack.add(stack[stack.size-1] + stack[stack.size-2])
            } 
            else if(operations[i] == "D"){
                stack.add(stack.last()*2)
            }
            else if(operations[i] == "C"){
                stack.removeLast()
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