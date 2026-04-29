### 가변크기 Sliding Window
창문의 크기가 고정되어있지 않고, 특정 조건을 만족할때까지 늘어났다가 줄어드는 가변 슬라이딩 윈도우 기법.

🎭 투 포인터의 역할 분담
right (탐색조 / 포식자): for문을 타고 배열의 끝을 향해 무조건 전진합니다. 새로운 원소를 창문 안으로 들이며 상태를 업데이트합니다.
left (수습조 / 청소기): 평소엔 가만히 있다가, 창문 안의 상태가 '조건을 위반'했을 때만 움직입니다. 조건이 다시 정상화될 때까지 창문의 왼쪽을 당겨 원소를 방 뺍니다.
📝 마법의 공식 템플릿 (for - while 구조)어떤 가변 슬라이딩 윈도우 문제든 이 뼈대를 크게 벗어나지 않습니다.

```kotlin
fun slidingWindowTemplate(nums: IntArray, k: Int): Int {
    var left = 0
    var state = 0 // 현재 창문의 상태 (예: 0의 개수, 원소의 합 등)
    var maxLen = 0

    // 1. right는 무조건 전진하며 창문을 넓힘
    for (right in nums.indices) {
        
        // [Step 1] 새로 들어온 원소(nums[right])를 state에 반영
        // 예: if (nums[right] == 0) state++
        
        // 2. 조건이 깨졌다면? 정상화될 때까지 left를 당겨서 창문을 좁힘
        while (/* 창문의 상태가 조건을 위반했을 때 (예: state > k) */) {
            
            // [Step 2] 빠져나가는 원소(nums[left])를 state에서 제거
            // 예: if (nums[left] == 0) state--
            
            left++ // 왼쪽 포인터 전진
        }

        // 3. while문을 빠져나왔다는 건 창문이 '정상 상태'라는 뜻
        // [Step 3] 현재 창문의 길이나 최댓값/최솟값을 갱신
        maxLen = maxOf(maxLen, right - left + 1)
    }

    return maxLen
}
```
🧠 동작 원리 (왜 빠른가?)right 포인터가 0부터 끝까지 $N$번 움직이고, left 포인터도 최악의 경우 0부터 끝까지 $N$번 움직입니다. 이중 루프(for 안에 while)처럼 보이지만, 실제로는 두 포인터가 절대 뒤로 돌아가지 않고 앞으로만 가기 때문에 최대 $2N$번의 연산만 수행하여 시간 복잡도 $O(N)$을 보장합니다.

🎯 이 패턴이 쓰이는 대표적인 문제 유형
0을 k개 바꿀 수 있을 때 최대 연속된 1의 길이 구하기 (LeetCode 1004)
합이 S 이상이 되는 가장 짧은 연속 부분 배열의 길이 구하기 (LeetCode 209)
중복 문자가 없는 가장 긴 부분 문자열의 길이 구하기 (LeetCode 3)

<h2><a href="https://leetcode.com/problems/max-consecutive-ones-iii">1046. Max Consecutive Ones III</a></h2><h3>Medium</h3><hr><p>Given a binary array <code>nums</code> and an integer <code>k</code>, return <em>the maximum number of consecutive </em><code>1</code><em>&#39;s in the array if you can flip at most</em> <code>k</code> <code>0</code>&#39;s.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
<strong>Output:</strong> 6
<strong>Explanation:</strong> [1,1,1,0,0,<u><strong>1</strong>,1,1,1,1,<strong>1</strong></u>]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
<strong>Output:</strong> 10
<strong>Explanation:</strong> [0,0,<u>1,1,<strong>1</strong>,<strong>1</strong>,1,1,1,<strong>1</strong>,1,1</u>,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
	<li><code>0 &lt;= k &lt;= nums.length</code></li>
</ul>
