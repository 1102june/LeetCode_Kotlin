## 접근 
1. 일단 set해서 중복된 배열 없애고
2. 그걸 숫자별 개수만큼 map한다음에 key값끼리 비교하려함
3. 이것도 맞긴한데 사실 set된 상태에서 그냥 for문으로 내부 값 비교해서 add해도됨
4. 진짜 고수라면 intersect() 사용

## Kotlin Functions
1. 리스트선언
```kotlin
	 val result = mutableListOf<Int>()
```
2. 집어넣을때 add
3. intersect 함수
   ```kotlin
	return nums1.toSet().intersect(nums2.toSet()).toIntArray()

   ```

<h2><a href="https://leetcode.com/problems/intersection-of-two-arrays">349. Intersection of Two Arrays</a></h2><h3>Easy</h3><hr><p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their <span data-keyword="array-intersection">intersection</span></em>. Each element in the result must be <strong>unique</strong> and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [9,4]
<strong>Explanation:</strong> [4,9] is also accepted.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>
