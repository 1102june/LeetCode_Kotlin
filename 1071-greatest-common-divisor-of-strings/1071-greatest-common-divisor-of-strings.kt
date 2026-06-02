class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        //1. 두 문자열 서로 뒤집어서 더했을때 일치하지않으면 "" return
        if (str1+str2 != str2+str1){
            return ""
        }
        // 2.두 문자열의 길이 활용해서 최대공약수 gcd 구하기
        var a = str1.length  // 6
        var b = str2.length // 3

        while(b!=0){   //유클리드 호제법활용한 gcd 구하기
        // a= 12 b= 8이라고 가정 
            val r = a % b  //r = 4
            a = b // a = 8
            b = r // b = 4
        }
        val gcd = a
        return str1.substring(0,gcd) // substring활용해서 자르기 
    }
}