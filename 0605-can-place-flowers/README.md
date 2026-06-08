## 초기접근
1. 그냥 배열안에 0이 연속 3번 들어있으면 1박고서 진행하려했음
2. 그러나 배열길이가 1인경우 예외처리와
3. 0번인덱스가 0인경우엔 1번인덱스가 0이면 바로 0번 인덱스에 1박고 진행
4. 마지막 인덱스도 이와 마찬가지 맨끝 인덱스와 그 앞 인덱스가 0이 연속되어있으면 바로 1 박고진행
5. 1박을때마다 count는 ++ 해주기 Greedy 알고리즘

## Greedy Algorithm
### "숲을 안보고 나무만 본다" 
당장 가장 이득이 되는 최적의 선택을 하며 이어나감

왜? 그리디 알고리즘인가?
> 뒤에 어떤 것들이 있던간에 1을 심을수있는 순간만 오면 무조건 1을 심고 넘어가는 구조
>  이렇게 하는 이유는 꽃을 최대한 많이 심어야하기 때문 

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


