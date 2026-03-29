class Solution {
    fun reverseWords(s: String): String {
        val arr = s.toCharArray()
        val result = StringBuilder()

        var pointer1 =  arr.size-1
        var pointer2 =  arr.size-1
        
        for(i in 0 until arr.size){  //길이만큼 수행
            if(arr[pointer1] != ' '){ //해당 인덱스가 공백이 아니면 왼쪽으로 한칸이동
                pointer1--
            }
            else { // 공백일경우.
            
                if(pointer1 < pointer2) {  //연속공백인 상황을 배제
                    for(j in (pointer1 + 1)..pointer2){  
                        result.append(arr[j]) 
                    }
                    result.append(' ') // 단어 뒤에 공백 한칸 추가
                }
                
                pointer2 = pointer1 - 1 
                pointer1--
            } 
        }

        // OutOfBounds 때문에 범위를 벗어나는 상황 발생. 첫단어 잘림
        if (pointer1 < pointer2) {
            for(j in (pointer1 + 1)..pointer2) {
                result.append(arr[j])
            }
        }
        return result.toString().trim()
    }
}