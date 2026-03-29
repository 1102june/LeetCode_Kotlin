# ✌️ [LeetCode 345] Reverse Vowels of a String (Kotlin)

## 🧠 내가 배운 점 (TIL - Today I Learned)

### 1. 코틀린의 String은 '돌덩이'다 (불변성)
* 처음에 이거 보고 그냥 String문자열인 상태 그대로 가져다가 박으려했음. 그냥 너무 안일한 생각.
*  TwoPointer라는것 까지의 생각 확장을 못했음.
*  그리고 Vowels를 묶어서 선언하고 비교하는게 아니라 그냥 CharArray전환 한다음에 Vowel인지 확인하는 함수로 확인하면 되는거 아님? 이란 생각햇음 ==> 사실 이것도 틀린말은 아니긴함 그렇게 할수있음. 그러나 아직 그정도 Level은 내가 아닌
* 투 포인터로 자리를 바꾸려면, 반드시 `s.toCharArray()`를 이용해 수정 가능한 **배열(CharArray)**로 변환한 뒤 작업하고, 마지막에 다시 `String(arr)`으로 묶어줘야 한다.

### 2. 투 포인터(Two Pointers)의 핵심 조건
* `for`문으로 끝까지 달려버리는 대신, 양 끝에 포인터(`start`, `end`)를 두고 **서로 엇갈리기 전까지(`while (start < end)`)** 가운데로 좁혀오는 것이 핵심이다.
* "두 포인터가 만날 때 종료"라고 해서 `while (start == end)`라고 쓰면 아예 실행조차 되지 않는다. 반복문의 조건은 '종료 조건'이 아니라 **'계속 실행할 조건'**임을 명심하자.

(단일 `while` + `if/else` 사용 )
  * 실전 코테에서 긴장하여 이중 조건을 빼먹는 실수를 방지하기 위해, 안쪽에서 폭주기관차처럼 도는 `while` 대신 **`if - else if - else`** 구조를 채택했다.
  * 한 턴에 딱 한 칸만 이동하고 바로 바깥쪽의 메인 브레이크(`start < end`) 검사를 받기 때문에, 배열 범위를 벗어날 위험이 0%인 아주 안전하고 직관적인 방식이다. 앞으로 투 포인터는 이 방식으로 굳힌다!



## 혼자 한번 더 풀어봄
### 4. 🚨 [문법 함정 1] `!=` (다르다) vs `!in` (포함되지 않다)
* **내 실수:** 모음이 아닌 것을 찾기 위해 `if(arr[pointer1] != vowels)` 라고 작성했다.
* **이유:** * `!=` 는 **"너네 둘이 완전히 똑같이 생겼냐?"**를 묻는 비교 연산자다. 즉, 사과 1개(`'a'`)랑 과일바구니(`"aeiou"`)를 갖다 놓고 "둘이 똑같이 생겼어?"라고 묻는 꼴이라 컴퓨터가 에러를 뱉은 것이다.
  * `!in` 은 **"이 바구니 안에 네가 없니?"**를 묻는 포함(Membership) 연산자다. 
* **해결:** 내가 짚은 글자 하나(`arr[pointer]`)가 모음 뭉텅이(`vowels`) 안에 **들어있는지 없는지**를 확인해야 하므로 `!in`을 쓰는 것이 논리적으로 정확하다!

### 5. 🚨 [문법 함정 2] 배열을 합칠 때 `.toString()`의 배신
* **내 실수:** 마지막에 Char 배열을 다시 String으로 돌려주기 위해 `return arr.toString()`을 썼다.
* **결과:** 글자가 합쳐져서 나오는 게 아니라 `[C@5a07e868` 같은 정체불명의 외계어가 반환되었다.
* **이유:** * 코틀린(Java 기반)에서 배열에 대고 그냥 `.toString()`을 부르면, 배열 안의 내용물을 보여주는 게 아니라 **"나 Char 배열(`[C`)이고, 내 메모리 주소(집 주소)는 `@5a07e868`이야"** 라고 자기소개를 해버린다.
* **해결:** 배열 안의 찰흙(글자)들을 꾹꾹 눌러서 하나의 단단한 돌덩이(문자열)로 새로 만들려면, **`String(arr)`** 처럼 String의 괄호 안에 배열을 집어넣어 줘야(생성자 호출) 예쁘게 합쳐진다.



<h2><a href="https://leetcode.com/problems/reverse-vowels-of-a-string">345. Reverse Vowels of a String</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code>, reverse only all the vowels in the string and return it.</p>

<p>The vowels are <code>&#39;a&#39;</code>, <code>&#39;e&#39;</code>, <code>&#39;i&#39;</code>, <code>&#39;o&#39;</code>, and <code>&#39;u&#39;</code>, and they can appear in both lower and upper cases, more than once.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;IceCreAm&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;AceCreIm&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>The vowels in <code>s</code> are <code>[&#39;I&#39;, &#39;e&#39;, &#39;e&#39;, &#39;A&#39;]</code>. On reversing the vowels, s becomes <code>&quot;AceCreIm&quot;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;leetcode&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;leotcede&quot;</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 3 * 10<sup>5</sup></code></li>
	<li><code>s</code> consist of <strong>printable ASCII</strong> characters.</li>
</ul>


