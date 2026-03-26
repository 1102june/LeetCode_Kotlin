<h2><a href="https://leetcode.com/problems/can-place-flowers">605. Can Place Flowers</a></h2><h3>Easy</h3><hr><p>You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in <strong>adjacent</strong> plots.</p>

<p>Given an integer array <code>flowerbed</code> containing <code>0</code>&#39;s and <code>1</code>&#39;s, where <code>0</code> means empty and <code>1</code> means not empty, and an integer <code>n</code>, return <code>true</code>&nbsp;<em>if</em> <code>n</code> <em>new flowers can be planted in the</em> <code>flowerbed</code> <em>without violating the no-adjacent-flowers rule and</em> <code>false</code> <em>otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> flowerbed = [1,0,0,0,1], n = 1
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> flowerbed = [1,0,0,0,1], n = 2
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= flowerbed.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>flowerbed[i]</code> is <code>0</code> or <code>1</code>.</li>
	<li>There are no two adjacent flowers in <code>flowerbed</code>.</li>
	<li><code>0 &lt;= n &lt;= flowerbed.length</code></li>
</ul>

# 🌷 [LeetCode 605] Can Place Flowers (Kotlin)

## 🧠 내가 배운 점 (TIL - Today I Learned)

### 1. 알고리즘: 그리디(Greedy)의 진짜 의미
* 그냥 조건 맞으면 바로 1 박고 넘어가는 이기적인 알고리즘.
* 근데 사실 내가 처음 풀땐 1을 박고 count해가면서 n과 비교한다고 생각하기 보단 단순히 0의개수랑 n의 상관관계를 생각했다가 테스트케이스 절반이 틀리는 사고를 겪음

  
### 2. 예외 처리와 단축 평가 (Short-circuit Evaluation)
* `Index Out of Bounds` (배열 범위 초과) 에러를 막기 위한 **'방패' 세우기**를 배웠다.
* 컴퓨터는 조건문을 왼쪽에서 오른쪽으로 읽는다. 
  * ❌ `(flowerbed[i-1] == 0 || i == 0)` : -1번 방을 먼저 열어보려다가 에러 발생!
  * 🟢 `(i == 0 || flowerbed[i-1] == 0)` : 내가 0번 방(벽)이면, 오른쪽 조건은 아예 읽지도 않고 통과! 

### 3. 뼈저린 실수: 대입(`=`)과 비교(`==`) 절대 헷갈리지 말기!
* 자리가 비어서 꽃을 심어야 할 때 `flowerbed[i] == 1` 이라고 쓰는 대참사를 냈다.
* `==`는 "너 1이랑 똑같냐?"라고 묻는 **비교 연산자**다. 꽃을 심으려면(값을 넣으려면) 반드시 `=` **대입 연산자**를 써야 한다. 이거 하나 때문에 테스트 케이스 25개가 터지는 나비효과를 경험했다. 기본기의 중요성!





