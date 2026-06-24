## 접근
1. 처음에 그냥 for문 돌아서 시간복잡도 O(log(N)) 도 만족못했는데 왜풀리지? 이지랄하고있었음
2. Binary Search대로 풀어야함.

## BinarySearch
1. 전제 조건 : 데이터가 반드시 오름차순 또는 내림차순으로 Sorted
2. 핵심 포인터 3개
+ low : 현재 범위의 맨 앞 인덱스
+ high : 현재 범위의 맨 끝 인덱스
+ mid : (low + high /2) 현재 탐색범위의 정중앙 인덱스

<h2><a href="https://leetcode.com/problems/binary-search">792. Binary Search</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code> which is sorted in ascending order, and an integer <code>target</code>, write a function to search <code>target</code> in <code>nums</code>. If <code>target</code> exists, then return its index. Otherwise, return <code>-1</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 9
<strong>Output:</strong> 4
<strong>Explanation:</strong> 9 exists in nums and its index is 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> 2 does not exist in nums so return -1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt; nums[i], target &lt; 10<sup>4</sup></code></li>
	<li>All the integers in <code>nums</code> are <strong>unique</strong>.</li>
	<li><code>nums</code> is sorted in ascending order.</li>
</ul>
