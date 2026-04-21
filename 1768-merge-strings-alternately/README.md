1. StringBuilder선언, maxof()함수 활용한 선언
2. 굳이 차례대로 조건문 나눌필요없이 그냥 word1부터 조건문으로 비교하면서 대입하면됨

### StringBuilder를 언제 써야하는가
String은 애초에 불변이라 돌판임. 따라서 StringBuilder라는 화이트보드를 가져와서 활용.
그냥 StringBuilder라는 화이트보드를 가져와서 append하면 그만이니까. 
무조건 Stringbuilder를 써야하는 상황

```
// ❌ 끔찍한 코드 (돌판 10만 번 새로 깎기 = 시간 초과 폭발)
var result = ""
for (i in 1..100000) {
    result += "A" 
}

// 🟢 완벽한 코드 (화이트보드에 10만 번 펜으로 쓱쓱 적기 = 초고속 통과)
val result = StringBuilder()
for (i in 1..100000) {
    result.append("A")
}
```

문제지문에서의 메모리공간을 제한하는 경우 "constant extra space" 사용불가

<h2><a href="https://leetcode.com/problems/merge-strings-alternately">1894. Merge Strings Alternately</a></h2><h3>Easy</h3><hr><p>You are given two strings <code>word1</code> and <code>word2</code>. Merge the strings by adding letters in alternating order, starting with <code>word1</code>. If a string is longer than the other, append the additional letters onto the end of the merged string.</p>

<p>Return <em>the merged string.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> word1 = &quot;abc&quot;, word2 = &quot;pqr&quot;
<strong>Output:</strong> &quot;apbqcr&quot;
<strong>Explanation:</strong>&nbsp;The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> word1 = &quot;ab&quot;, word2 = &quot;pqrs&quot;
<strong>Output:</strong> &quot;apbqrs&quot;
<strong>Explanation:</strong>&nbsp;Notice that as word2 is longer, &quot;rs&quot; is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> word1 = &quot;abcd&quot;, word2 = &quot;pq&quot;
<strong>Output:</strong> &quot;apbqcd&quot;
<strong>Explanation:</strong>&nbsp;Notice that as word1 is longer, &quot;cd&quot; is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word1.length, word2.length &lt;= 100</code></li>
	<li><code>word1</code> and <code>word2</code> consist of lowercase English letters.</li>
</ul>
