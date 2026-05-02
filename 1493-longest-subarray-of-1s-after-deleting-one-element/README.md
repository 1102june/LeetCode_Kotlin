1.초기접근: 그전에 풀었던 1004번과 굉장히 비슷하게 a는 미리 출발해서 0의개수 세고 b는 특정조건에서만 발동하여 a-b로 최대길이를 계속 구하면 되겠다 생각해서 코드 쓰니까 돌아감.
2. 예외처리: 그러나 86개의 Testcase중 83개만 Pass함 => [0,0,0]인경우엔 답이 0이어야하는데 안되길래 원래도 예외처리 코드를 썼으나 이번엔 nums[0] = 0 일땐 그냥 0 Return하는 코드를 넣으니까 Pass됨
3. 근데 놀라운 사실 [1,1,1], [0,0,0] 이어도 예외처리 필요없이 그냥 제대로 답나옴. 결국 다 1이면 a가 다 Pass하고 B는 0인 그대로라서 정답이 나옴. 다 0이면 그냥 0-0이라 결론적으로 0이 나옴.

<h2><a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element">1586. Longest Subarray of 1's After Deleting One Element</a></h2><h3>Medium</h3><hr><p>Given a binary array <code>nums</code>, you should delete one element from it.</p>

<p>Return <em>the size of the longest non-empty subarray containing only </em><code>1</code><em>&#39;s in the resulting array</em>. Return <code>0</code> if there is no such subarray.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,0,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1&#39;s.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1,1,0,1,1,0,1]
<strong>Output:</strong> 5
<strong>Explanation:</strong> After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1&#39;s is [1,1,1,1,1].
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> You must delete one element.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
