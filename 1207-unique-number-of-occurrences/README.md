## 초기접근
1. value개수 추출하는 함수인 groupingBy{it}.eachCount()함수 활용
2. value값만 들어간 map의 value끼리 비교하는 for문활용하려했음 근데 이러면 너무 비효율적이고 error발생 확률 높아짐
3. 그래서 value개수 추출해서 중복제거하는 set함수를 활용
4. map에서 value값들만 set함수로 중복제거
5. 해당 set이랑 map이랑 길이 비교해서 맞으면 true 아니면 false return

<h2><a href="https://leetcode.com/problems/unique-number-of-occurrences">1319. Unique Number of Occurrences</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>arr</code>, return <code>true</code> <em>if the number of occurrences of each value in the array is <strong>unique</strong> or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2,2,1,1,3]
<strong>Output:</strong> true
<strong>Explanation:</strong>&nbsp;The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2]
<strong>Output:</strong> false
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> arr = [-3,0,1,-3,1,1,1,-3,10,0]
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 1000</code></li>
	<li><code>-1000 &lt;= arr[i] &lt;= 1000</code></li>
</ul>
