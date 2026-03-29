## 🧠 [LeetCode 151] Reverse Words in a String - 투 포인터와 공백의 사투

### 1. 내가 시도한 접근법 (하드코어 투 포인터)
* 배열의 맨 뒤에서부터 두 개의 포인터(`pointer1`, `pointer2`)를 이동시키며 **직접 공백을 찾고 단어를 발라내는 방식**으로 구현했다.
* 단순히 내장 함수(`split`, `reverse`)에 의존하지 않고, 인덱스의 흐름을 직접 컨트롤하여 메모리를 효율적으로 쓰는 근본적인 접근(C/C++ 스타일)을 시도함.

### 2. 🚨 오늘 마주친 핵심 트러블슈팅 (Edge Cases)

**① 포인터 갱신 오류 (연속 공백 방어 실패)**
* 단어를 바구니에 담고 나서 `pointer2 = pointer1`로 갱신했더니, `pointer2`가 현재의 '공백' 위치를 가리키게 되어 연속 공백 방어 로직(`if(p1 < p2)`)이 뚫려버리는 나비효과가 발생했다.
* **해결:** `pointer2`는 다음 단어의 끝부분을 대기해야 하므로, 공백을 건너뛴 **공백 바로 앞 칸(`pointer1 - 1`)**으로 명확히 넘겨줘야 완벽하게 연속 공백을 스킵할 수 있다.

**② 👻 가장 치명적이었던 '맨 앞 단어 증발' 사건**
* 내 메인 로직은 **"뒤에서부터 앞으로 가다가 '공백'을 만나면 단어를 잘라서 복사한다"** 였다.
* 하지만 문장의 맨 첫 단어(예: `"the sky"`의 `"the"`) 앞에는 공백이 없기 때문에, 루프가 인덱스 0번까지 도달해 끝나버리면 **맨 첫 단어는 복사될 타이밍을 놓치고 그대로 증발**해버린다.
* **해결:** 루프가 완전히 종료된 직후, `if(pointer1 < pointer2)` 조건을 통해 아직 바구니에 들어가지 못한 맨 앞 단어가 남아있는지 확인하고, **마지막으로 한 번 더 담아주는 '구출 작전' 코드**가 반드시 필요하다. (투 포인터의 대표적인 맹점 파악!)

### 3. 💡 코틀린의 마법 (Standard Approach)
투 포인터로 인덱스를 직접 다루는 하드코어한 구현을 끝내고 나니, 예외 케이스(연속 공백, 첫 단어 등) 처리가 얼마나 까다로운지 뼛속 깊이 깨달았다. 실무나 일반적인 코테에서는 아래와 같이 코틀린의 내장 함수를 파이프라인처럼 연결하는 것이 가독성과 유지보수 면에서 훨씬 우수하다.

```kotlin
// 내일 다시 풀어볼 코틀린 정석(Standard) 풀이
return s.trim()
        .split("\\s+".toRegex()) // 정규식: 연속된 공백도 하나로 취급해서 쪼갬
        .reversed()              // 단어 순서 뒤집기
        .joinToString(" ")       // 다시 공백 한 칸씩 넣어서 합치기












<h2><a href="https://leetcode.com/problems/reverse-words-in-a-string">151. Reverse Words in a String</a></h2><h3>Medium</h3><hr><p>Given an input string <code>s</code>, reverse the order of the <strong>words</strong>.</p>

<p>A <strong>word</strong> is defined as a sequence of non-space characters. The <strong>words</strong> in <code>s</code> will be separated by at least one space.</p>

<p>Return <em>a string of the words in reverse order concatenated by a single space.</em></p>

<p><b>Note</b> that <code>s</code> may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;the sky is blue&quot;
<strong>Output:</strong> &quot;blue is sky the&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;  hello world  &quot;
<strong>Output:</strong> &quot;world hello&quot;
<strong>Explanation:</strong> Your reversed string should not contain leading or trailing spaces.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;a good   example&quot;
<strong>Output:</strong> &quot;example good a&quot;
<strong>Explanation:</strong> You need to reduce multiple spaces between two words to a single space in the reversed string.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> contains English letters (upper-case and lower-case), digits, and spaces <code>&#39; &#39;</code>.</li>
	<li>There is <strong>at least one</strong> word in <code>s</code>.</li>
</ul>

<p>&nbsp;</p>
<p><b data-stringify-type="bold">Follow-up:&nbsp;</b>If the string data type is mutable in your language, can&nbsp;you solve it&nbsp;<b data-stringify-type="bold">in-place</b>&nbsp;with&nbsp;<code data-stringify-type="code">O(1)</code>&nbsp;extra space?</p>





