class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
    //패턴이 있는지 어떻게 알아낼것인가
    //1. 완전탐색 방식 - str1과 str2를 비교해서 문자개수 구해서 합치기
    //2. GCD 방식 - str1,str2를 합쳤을때의 패턴이 같은가
    var maxnum = 0 //가변상수 var
    if (str1+str2 == str2+str1){
        for (i in 1..minOf(str1.length, str2.length)){   //두 문자열 중 더 짧은 
            if(str1.length % i == 0 && str2.length % i == 0) { 
                // 최대공약수 만족하는 조건 
                maxnum = i
            }
        }
    }
    else return ""
    return str1.substring(0,maxnum)   //substring으로 자르기 
    }
}
