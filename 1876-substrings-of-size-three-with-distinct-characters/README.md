## 접근1: 내가 푼 방법
1. 결국 Window 크기가 3이기때문에 string을 char array로 형변환시키고 for문돌음
2. 결국 3개의 문자가 다르다는건 3번 비교하면 되기때문에
3. 가장 runtime이 빠른 방법이기도함

## 접근2: set 활용하기
1. 그냥 문자 3개를 substring 활용해서 자르고
2. set함수 사용하여 중복제거후 원래 길이인 3이랑 맞는지 확인후 result++
3. window의 크기가 3이라면 문제없지만 그 이상인 경우 set함수 활용해서 풀어야함
   ```kotlin
	class Solution {
    fun countGoodSubstrings(s: String): Int {
        var result = 0

        for(i in 0 until s.length-2){
            val sub = s.substring(i, i+3)
            val set = sub.toSet()
            if(set.size == 3){
                result++
            } 
        } 
        return result
    }
}

	```


<h2><a href="https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters">1987. Substrings of Size Three with Distinct Characters</a></h2><h3>Easy</h3><hr><p>A string is <strong>good</strong> if there are no repeated characters.</p>

<p>Given a string <code>s</code>​​​​​, return <em>the number of <strong>good substrings</strong> of length <strong>three </strong>in </em><code>s</code>​​​​​​.</p>

<p>Note that if there are multiple occurrences of the same substring, every occurrence should be counted.</p>

<p>A <strong>substring</strong> is a contiguous sequence of characters in a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;xyzzaz&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> There are 4 substrings of size 3: &quot;xyz&quot;, &quot;yzz&quot;, &quot;zza&quot;, and &quot;zaz&quot;. 
The only good substring of length 3 is &quot;xyz&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aababcabc&quot;
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 7 substrings of size 3: &quot;aab&quot;, &quot;aba&quot;, &quot;bab&quot;, &quot;abc&quot;, &quot;bca&quot;, &quot;cab&quot;, and &quot;abc&quot;.
The good substrings are &quot;abc&quot;, &quot;bca&quot;, &quot;cab&quot;, and &quot;abc&quot;.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code>​​​​​​ consists of lowercase English letters.</li>
</ul>
