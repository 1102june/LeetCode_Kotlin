## 초기 접근
1. 일단 pivot 위치를 두개 설정
2. 첫피봇 예외처리 그니까 0번인덱스가 피봇인경우를 예외처리하기위해 0번인덱스빼고 다 더해서 r pivot에 넣고 그게 0이면 0 return
3. for문 돌면서 piovot값 기준으로 leftpivot엔 지나온 인덱스 넣고 rightpivot엔 pivot자리라서 추가되지못한값을 추가함
4. 그리고서 leftpivot rightpivot 비교해서 같으면 i값 return
5. 근데 여기서 내가 한가지 실수한게 처음부터 예외처리를 하려다보니 rightpivot 관련해서 맨 우측값 제외해서 다 더한뒤 0인지 비교함
6. 근데 이거 내가 만든 for문에서 알아서 걸러지는구조라 문제없음.


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
