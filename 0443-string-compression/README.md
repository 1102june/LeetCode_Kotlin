# 🍏 [LeetCode 443] String Compression
ㄴ 못풀었음 내가 작성한 코드대로하면 그냥 입구컷 당하는 구조. 밑에는 내 초기코드. StringBuilder를 활용해서 새로운 바구니를 만들고 거기다가 결과값을 집어넣으려고 했음.

```kotlin
class Solution {
    fun compress(chars: CharArray): Int {
        //s를 stringbuilder로 만들기
        val s = StringBuilder()
        var alha = 0 // 해당 알파벳
        var num = 1 // 알파벳 개수

        // 예외처리. 0번 인덱스랑 1번 인덱스가 다를때. 혹은 CharArray의 길이가 1일때.
        if(chars.size == 1 || chars[0] != chars[1]){
            append.s(chars[0])
        }
        else {
                alpha = chars[i]
                num++
            }  // 1번 인덱스 까지는 처리 완료
        for (i in 1 until chars.size){
            if(chars[i] == chars[i+1]){
                num++
            }
            else{
                append.s(num)
                num = 1
                alpha = chars[i+1] //num값과 alpha값 초기화
            }
        }
        return s.length
        }
```
"You must write an algorithm that uses only constant extra space." 
그냥 직역하면 너는 알고리즘을 사용해야한다. 오직 지속적인 남은 공간을.

근데 이게 일반 영어와 CS영어가 다름. constant는 상수의 의미임.
"네가 코드를 돌리기 위해 새로 가져다 쓰는 추가 메모리(Extra space)의 용량이, 입력 배열이 커지든 작아지든 상관없이 항상 똑같은 크기(상수, Constant)여야 한다."

## 🤬 빡침 포인트 & 배운 점
문제 지문에서 *"Begin with an empty string s..."* 라고 써있어서 `StringBuilder`를 썼더니 개같이 멸망했다.
**이유:** 지문의 저 문장은 '압축의 원리'를 설명하는 페이크였고, 진짜 핵심은 제약조건(Constraints)에 숨어있었음.

### 💡 핵심 제약 조건: `constant extra space` (O(1) 공간)
* `StringBuilder`나 `ArrayList`처럼 데이터 길이에 따라 늘어나는 새로운 바구니를 쓰면 무조건 오답 처리됨.
* **"Modify the input array in-place"**: 무조건 원본 배열(`chars`) 안에서 제자리 조작으로 덮어씌워야 함.

## 🛠️ 해결 전략: Two Pointers (읽기 & 쓰기)
배열을 훑고 지나가는 눈(`read`)과, 제자리에 덮어씌우는 손(`write`) 딱 2개의 변수만 사용한다.
1. `read` 포인터로 같은 알파벳이 몇 개인지 쭉 훑으면서 카운트한다.
2. 다 세었으면, `write` 포인터 위치에 알파벳을 덮어씌운다.
3. 알파벳 개수가 2개 이상이면, 개수(숫자)를 문자열로 쪼개서 `write` 위치에 이어서 덮어씌운다.
4. `read`는 무조건 `write`보다 앞서가기 때문에, 아직 안 읽은 문자를 덮어씌울 걱정은 안 해도 된다!




<h2><a href="https://leetcode.com/problems/string-compression">443. String Compression</a></h2><h3>Medium</h3><hr><p>Given an array of characters <code>chars</code>, compress it using the following algorithm:</p>

<p>Begin with an empty string <code>s</code>. For each group of <strong>consecutive repeating characters</strong> in <code>chars</code>:</p>

<ul>
	<li>If the group&#39;s length is <code>1</code>, append the character to <code>s</code>.</li>
	<li>Otherwise, append the character followed by the group&#39;s length.</li>
</ul>

<p>The compressed string <code>s</code> <strong>should not be returned separately</strong>, but instead, be stored <strong>in the input character array <code>chars</code></strong>. Note that group lengths that are <code>10</code> or longer will be split into multiple characters in <code>chars</code>.</p>

<p>After you are done <strong>modifying the input array,</strong> return <em>the new length of the array</em>.</p>

<p>You must write an algorithm that uses only constant extra space.</p>

<p><strong>Note: </strong>The characters in the array beyond the returned length do not matter and should be ignored.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> chars = [&quot;a&quot;,&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;c&quot;,&quot;c&quot;,&quot;c&quot;]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The groups are &quot;aa&quot;, &quot;bb&quot;, and &quot;ccc&quot;. This compresses to &quot;a2b2c3&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> chars = [&quot;a&quot;]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only group is &quot;a&quot;, which remains uncompressed since it&#39;s a single character.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> chars = [&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The groups are &quot;a&quot; and &quot;bbbbbbbbbbbb&quot;. This compresses to &quot;ab12&quot;.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= chars.length &lt;= 2000</code></li>
	<li><code>chars[i]</code> is a lowercase English letter, uppercase English letter, digit, or symbol.</li>
</ul>
