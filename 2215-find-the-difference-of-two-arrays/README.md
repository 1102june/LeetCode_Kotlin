## 초기접근
1. 단순하게 for문돌면서 nums1의 0번인덱스부터 nums2의 0,1,2번 인덱스 비교해서 같으면 제거하는 방식으로 진행하려했음 사실상 이중 for문도는 형식
2. 그러나 일단 배열의 중복을 제거해야한다는 사실도 놓침
3. set으로 변환후 차집합하여 list변환한뒤 listof함수를 활용

# Kotlin Collection
1.listOf(): 새로운 List만들기
정답을 묶어서 리스트로 반환할때
```kotlin
val a = listOf(1,2)
val b = listOf(3,4)

val result= listOf(a,b)  // result: [[1,2],[3,4]]
```
2. .toSet() , .toList()
Set으로 중복값 날릴때 "O(1)보다 빠르다는게 핵심"

3. .groupingBy{it}.eachCount()  등장횟수세기
   배열안에서 각 숫자가 몇번 나왔는지 Map 사전으로 만들어야할때
java나 python의 이중 for문이나 Map로직을 단한줄로 끝내는 kotlin의 사기 함수

```kotlin
val arr = intArrayOf(1,2,2,3,3,3)
val countMap = arr.toList().groupingBy{it}.eachCount()
val counts = countMap.values // Map의 횟수만 뽑기 [1,2,3] 
```
   



<h2><a href="https://leetcode.com/problems/find-the-difference-of-two-arrays">1392. Find the Difference of Two Arrays</a></h2><h3>Easy</h3><hr><p>Given two <strong>0-indexed</strong> integer arrays <code>nums1</code> and <code>nums2</code>, return <em>a list</em> <code>answer</code> <em>of size</em> <code>2</code> <em>where:</em></p>

<ul>
	<li><code>answer[0]</code> <em>is a list of all <strong>distinct</strong> integers in</em> <code>nums1</code> <em>which are <strong>not</strong> present in</em> <code>nums2</code><em>.</em></li>
	<li><code>answer[1]</code> <em>is a list of all <strong>distinct</strong> integers in</em> <code>nums2</code> <em>which are <strong>not</strong> present in</em> <code>nums1</code>.</li>
</ul>

<p><strong>Note</strong> that the integers in the lists may be returned in <strong>any</strong> order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,3], nums2 = [2,4,6]
<strong>Output:</strong> [[1,3],[4,6]]
<strong>Explanation:
</strong>For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,3,3], nums2 = [1,1,2,2]
<strong>Output:</strong> [[3],[]]
<strong>Explanation:
</strong>For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>-1000 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>
