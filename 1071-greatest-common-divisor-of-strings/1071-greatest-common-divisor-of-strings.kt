class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        // 문제를 보고 GCD최대공약수 활용 못하면 나가리.
        //합체순서를 다르게 했을때. 
        if(str1+str2 != str2+str1){
            return "" 
    }
    var a = str1.length
    var b = str2.length

    while (b != 0) {
            val temp = b
            b = a % b  // b에는 나머지를 넣고
            a = temp   // a에는 아까의 b를 넣음
        }

    return str1.substring(0,a)
}
}