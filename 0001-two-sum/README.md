## 초기접근
1. two pointer활용해서 맨앞 인덱스와 맨끝 인덱스를 left, right로 선언하고 점점 줄이면서 더하려했음
2. 그러나 너무 광범위한 배열길이로 runtime error남
3. 그래서 target값과 해당 인덱스에 들어가있는값과의 차이를 기억해서
4. map에다가 집어넣음 근데 여기서 킥이 value에다가 배열값 집어넣는게 아닌 key에다가 집어넣음
5. O(n)의 시간복잡도로 해결가능

## Kotlin Functions
1. map.containKeys(needed)
2. !! 닥치고 꺼내와라 , null일어날일 없다
3. intArrayOf(a,b) /// 즉시반환 

<h2><a href="https://leetcode.com/problems/two-sum">1. Two Sum</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code><font face="monospace">&nbsp;</font>time complexity?
