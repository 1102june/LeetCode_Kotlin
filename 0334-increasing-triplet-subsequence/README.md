# 🍏 [LeetCode 334] Increasing Triplet Subsequence

## 💡 핵심 패턴: 탐욕 알고리즘 (Greedy Algorithm)
"미래를 걱정하지 말고, 현재 상태에서 최선의 '낮은 허들'을 유지한다."

### 1. 왜 그리디인가?
3단 콤보($i < j < k$)를 찾으려면, 앞의 두 숫자($i, j$)가 **최대한 작을수록** 뒤에 더 큰 숫자($k$)가 나타날 확률이 높아진다. 따라서 숫자를 만날 때마다 `first`와 `second`를 가능한 가장 작은 값으로 계속 갱신한다.

### 2. `Int.MAX_VALUE`의 정체
* **의미:** 정수형(`Int`)이 가질 수 있는 최대값 (약 21억).
* **용도:** 초기 비교 대상을 설정할 때 쓴다. 어떤 숫자가 들어와도 `num <= Int.MAX_VALUE`는 무조건 참이 되므로, 배열의 첫 번째 숫자가 자연스럽게 `first` 자리를 차지하게 만든다.

---

## 🛠️ 핵심 로직 (The 3-Step Trap)

배열을 한 번 순회하며 세 가지 함정을 판다:

1. **[1단 함정]** 현재 숫자가 `first`보다 작거나 같으면? 👉 `first` 갱신 (가장 낮은 시작점 확보)
2. **[2단 함정]** `first`보단 큰데 `second`보다 작거나 같으면? 👉 `second` 갱신 (가장 낮은 중간 지점 확보)
3. **[최종 승리]** 둘 다 통과해서 `else`로 빠지면? 👉 **True!!** (나보다 작은 놈이 앞에 두 명이나 있었다는 증거)



<h2><a href="https://leetcode.com/problems/increasing-triplet-subsequence">334. Increasing Triplet Subsequence</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, return <code>true</code><em> if there exists a triple of indices </em><code>(i, j, k)</code><em> such that </em><code>i &lt; j &lt; k</code><em> and </em><code>nums[i] &lt; nums[j] &lt; nums[k]</code>. If no such indices exists, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> true
<strong>Explanation:</strong> Any triplet where i &lt; j &lt; k is valid.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,4,3,2,1]
<strong>Output:</strong> false
<strong>Explanation:</strong> No triplet exists.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,1,5,0,4,6]
<strong>Output:</strong> true
<strong>Explanation:</strong> One of the valid triplet is (1, 4, 5), because nums[1] == 1 &lt; nums[4] == 4 &lt; nums[5] == 6.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>


<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you implement a solution that runs in <code>O(n)</code> time complexity and <code>O(1)</code> space complexity?


