## 접근 
1. 어떻게 접근할건지 부터 생각해야함. 근데 난 이걸 포인터 두개 활용해서 sliding 할 생각까지만 하고 어떻게 해야할지 제대로 생각하진 못함.
2. right pointer는 그냥 직진, left pointer는 규칙 위반시에만 움직임
3. 규칙 위반하는 기준이 무엇일까? 문제 있는 그대로 result라는 우리의 공간에 rightpointer가 달리면서 duplicate가 발생하는 순간이 규칙위반
4. duplicate하면 바로 떠올라야할것이 set. 아 그럼 빈바구니를 HashSet으로 선언하면 되겠구나
5. HashSet으로 풀진못함. 난 여전히 선언을 mutableListOf<>() 로 선언하는게 편함..

## HashSet
1. 그렇다면 우리가 Time Complexity 측면에서 왜 HashSet으로 선언하는게 이득일까?
2. 일단 우리가 right pointer로 무조건 전진하는 구조라 result안에 들어있는지 확인하는 s[right] in result << 이 검사를 하게된다.
3. HashSet으로 선언할 경우 in 연산이 O(1) 이 걸리지만
4. mutableListOf 으로선언시 in 연산이 O(N) 걸린다.


<h2><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">3. Longest Substring Without Repeating Characters</a></h2><h3>Medium</h3><hr><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without duplicate characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3. Note that <code>&quot;bca&quot;</code> and <code>&quot;cab&quot;</code> are also correct answers.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>
