1. 초기접근: 그냥 While문안에 For문 넣어서 k개수만큼 돌면서 count하려했음
2. 근데 애초에 문법적으로 틀린것도 있고 최대 Vowel이 들어있는 개수 return하는거라 잘못접근
3. 근데 이런식이면 Sliding이 아닌 반복문안에 반복문이 들어있는구조. 최초 k개만큼의 Vowel개수를 구한다음에 빠져나가는 string과 들어오는 String이 vowel인지 아닌지만 판단해서 curr을 증가, 감소시키고 max랑 비교하면 되는구조. [코드참조]

<h2><a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length">1567. Maximum Number of Vowels in a Substring of Given Length</a></h2><h3>Medium</h3><hr><p>Given a string <code>s</code> and an integer <code>k</code>, return <em>the maximum number of vowel letters in any substring of </em><code>s</code><em> with length </em><code>k</code>.</p>

<p><strong>Vowel letters</strong> in English are <code>&#39;a&#39;</code>, <code>&#39;e&#39;</code>, <code>&#39;i&#39;</code>, <code>&#39;o&#39;</code>, and <code>&#39;u&#39;</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abciiidef&quot;, k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> The substring &quot;iii&quot; contains 3 vowel letters.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aeiou&quot;, k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> Any substring of length 2 contains 2 vowels.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;leetcode&quot;, k = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> &quot;lee&quot;, &quot;eet&quot; and &quot;ode&quot; contain 2 vowels.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
	<li><code>1 &lt;= k &lt;= s.length</code></li>
</ul>
