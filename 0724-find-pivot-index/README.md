1. 초기접근: 그냥 어케해야할지 감을 못잡음. 전체 합을 구한다음에 pivot값을 특정하게 잡아서 비교해가야한다는것을 알지만 만약 pivot값을 안다고 한들 정확히 어떻게 계산해야 효율적일지만 생각하다가 제대로 해결못함
2. 먼저 Kotlin이니까 그냥 total값을 sum함수 써서 해결가능하긴함.
3. 그 다음엔 무조건 알아야하는 Prefix Sum 관련된 공식들
4. Right Sum = Total Sum - Left Sum - nums[i] 우측 전체합은 전체합에서 내 왼쪽합과 나자신을 빼면 나온다.
5. LeftSum = TotalSum - Left Sum - nums[i]  ///우리가 오른쪽합을 아직 모르니까, 왼쪽 합을 기준으로 식을 세워서 지금 왼쪽합이 계산된 오른쪽합과 같은 구조냐?  <- 이게 핵심


<h2><a href="https://leetcode.com/problems/find-pivot-index">724. Find Pivot Index</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code>, calculate the <strong>pivot index</strong> of this array.</p>

<p>The <strong>pivot index</strong> is the index where the sum of all the numbers <strong>strictly</strong> to the left of the index is equal to the sum of all the numbers <strong>strictly</strong> to the index&#39;s right.</p>

<p>If the index is on the left edge of the array, then the left sum is <code>0</code> because there are no elements to the left. This also applies to the right edge of the array.</p>

<p>Return <em>the <strong>leftmost pivot index</strong></em>. If no such index exists, return <code>-1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,7,3,6,5,6]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> -1
<strong>Explanation:</strong>
There is no index that satisfies the conditions in the problem statement.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,1,-1]
<strong>Output:</strong> 0
<strong>Explanation:</strong>
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Note:</strong> This question is the same as&nbsp;1991:&nbsp;<a href="https://leetcode.com/problems/find-the-middle-index-in-array/" target="_blank">https://leetcode.com/problems/find-the-middle-index-in-array/</a></p>
