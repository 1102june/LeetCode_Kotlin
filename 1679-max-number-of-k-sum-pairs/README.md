1. 초기접근: two pointer를 0번 인덱스에 두개박고 시작하면 결국 시간넘어가서 불가. left, right포인터 사용하는것까지도 이해하고 만약 두개를 합했을때 일치하면 left++ right-- 하는것까지 이해
2. 그렇다면 일치하지않는 경우엔 어떻게 해야할지 고민 -> 문제에 배열을 건들이지마라는 말이 없다는것을 너무 늦게 캐치함. 바로 Sort한뒤 시작
3. sort한값에서 합한값이 k값보다 작으면 right--  더 크면 left++하면 됨
4. 되게 간단한 로직이지만 포인터를 어떻게 처리해야할지를 생각


<h2><a href="https://leetcode.com/problems/max-number-of-k-sum-pairs">1798. Max Number of K-Sum Pairs</a></h2><h3>Medium</h3><hr><p>You are given an integer array <code>nums</code> and an integer <code>k</code>.</p>

<p>In one operation, you can pick two numbers from the array whose sum equals <code>k</code> and remove them from the array.</p>

<p>Return <em>the maximum number of operations you can perform on the array</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4], k = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,1,3,4,3], k = 6
<strong>Output:</strong> 1
<strong>Explanation:</strong> Starting with nums = [3,1,3,4,3]:
- Remove the first two 3&#39;s, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>1 &lt;= k &lt;= 10<sup>9</sup></code></li>
</ul>
