# [Medium] 238. Product of Array Except Self


## 💡 문제 미션 & 억까 조건
* **목표:** 배열에서 '나 자신(현재 인덱스)'을 제외한 나머지 모든 숫자의 곱을 구해서 배열로 반환하라. 나누기금지. O(n)의 시간 복잡도.


## 🤬 회고
* 처음 문제 봤을 때는 나누기 없이 이중 for문도 없이 어떻게 풀지 사고가 전혀 안됨. -> 처음 부터 끝까지 어떻게 풀어야할지 생각 못해낸 문제가 처음임 
* 배열 전체를 보지 않고 **'내 왼쪽 벽'과 '내 오른쪽 벽'을 분리해서 생각한 다음 합친다**는 발상을 할수 있냐 없냐가 핵심.
* **'양방향 휩쓸기 패턴'**을 암기하자

# 📚 [알고리즘 핵심 패턴] Prefix & Suffix (양방향 휩쓸기)

## 💡 이 패턴은 언제 쓰는가? (문제 출제자의 의도 파악하기)
코테 문제를 읽다가 아래와 같은 **'억까 조건'**이 보인다면 99% 이 패턴을 묻는 문제입니다.
1. **"O(n) 시간 안에 풀어라" (이중 for문 절대 금지 ❌)**
2. **"나누기(`/`) 연산을 쓰지 마라"**
3. **"나를 제외한 나머지 요소들의 계산(합이나 곱)을 구해라"**

내가 스스로 이 로직을 발명해 낼 확률은 0%에 수렴한다. 이건 지능의 문제가 아니라 **'알고리즘 레시피'**를 아느냐 모르느냐의 싸움이다. 쫄지 말고 패턴을 꺼내 쓰자.

---

## 🔑 핵심 개념: "전체를 못 건드리면, 내 양옆의 벽을 세워라"

나를 기준으로 배열을 두 동강 냅니다.
* **Prefix (접두 누적):** 맨 앞에서부터 나까지 오면서 쌓인 누적 값 (내 왼쪽 덩어리)
* **Suffix (접미 누적):** 맨 뒤에서부터 나까지 오면서 쌓인 누적 값 (내 오른쪽 덩어리)

👉 **정답 = [내 왼쪽 덩어리] ✖️ [내 오른쪽 덩어리]**



---

## 🛠️ 구현 공식 (O(n)으로 끝내는 2-Pass 전략)

배열을 딱 두 번만 훑으면 끝납니다. (그래서 O(n) 만족!)
핵심은 **"일단 내 자리에 값을 적고 👉 그다음 사람을 위해 내 숫자를 누적해서 넘겨준다"** 는 엇박자 리듬입니다.

### 1단계: ➡️ 왼쪽에서 오른쪽으로 (Prefix 구하기)
* 목적: 내 기준 **'왼쪽에 있는 숫자들의 곱'**을 배열에 싹 다 적어둔다.
* 초기값: `leftPointer = 1`
```kotlin
for (i in 0 until n) {
    result[i] = leftPointer              // 1. 일단 내 자리에 지금까지 누적된 왼쪽 값을 쓴다.
    leftPointer = leftPointer * nums[i]  // 2. 다음 칸으로 넘어가기 전, 내 숫자를 곱해서 봇짐을 불린다.
}
```


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
