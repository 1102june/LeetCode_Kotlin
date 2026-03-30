# [Medium] 238. Product of Array Except Self


## 💡 문제 미션 & 억까 조건
* **목표:** 배열에서 '나 자신(현재 인덱스)'을 제외한 나머지 모든 숫자의 곱을 구해서 배열로 반환하라. 나누기금지. O(n)의 시간 복잡도.

## 🔑 핵심 발상 
전체 곱에서 나를 나누는 게 불가능하다면? 시야를 좁혀서 양옆을 보자!
👉 **"내 왼쪽 무리들 싹 다 곱한 값 ✖️ 내 오른쪽 무리들 싹 다 곱한 값 = 나 빼고 다 곱한 값"**

1. `➡️ 왼쪽 휩쓸기`: 앞에서부터 차례대로 내 기준 '왼쪽 누적 곱'을 배열에 싹 적어둔다.
2. `⬅️ 오른쪽 휩쓸기`: 뒤에서부터 거꾸로 오면서 내 기준 '오른쪽 누적 곱'을 구하고, 아까 구해둔 왼쪽 값이랑 냅다 곱해버린다!

## 🤬 오늘의 회고 & 깨달음
* 처음 문제 봤을 때는 나누기 없이 이중 for문도 없이 풀라길래 욕이 절로 나왔다. -> 처음 부터 끝까지 어떻게 풀어야할지 생각 못해낸 문제가 처음임 
* 배열 전체를 보지 않고 **'내 왼쪽 벽'과 '내 오른쪽 벽'을 분리해서 생각한 다음 합친다**는 발상을 할수 있냐 없냐가 핵심.
* **'양방향 휩쓸기 패턴'**을 암기하자

<h2><a href="https://leetcode.com/problems/product-of-array-except-self">238. Product of Array Except Self</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, return <em>an array</em> <code>answer</code> <em>such that</em> <code>answer[i]</code> <em>is equal to the product of all the elements of</em> <code>nums</code> <em>except</em> <code>nums[i]</code>.</p>

<p>The product of any prefix or suffix of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</p>

<p>You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time and without using the division operation.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> [24,12,8,6]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [-1,1,0,-3,3]
<strong>Output:</strong> [0,0,9,0,0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-30 &lt;= nums[i] &lt;= 30</code></li>
	<li>The input is generated such that <code>answer[i]</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong>&nbsp;Can you solve the problem in <code>O(1)</code>&nbsp;extra&nbsp;space complexity? (The output array <strong>does not</strong> count as extra space for space complexity analysis.)</p>
