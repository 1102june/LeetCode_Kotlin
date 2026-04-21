1. Gcd 최대공약수를 활용해서 그 해당 범위까지 잘라야한다는것을 인지못한다 -> 계산 지옥
2. str1+str2 != str2+str1 인경우엔 그냥 시작할 필요도없다는것을 인지
3. gcd구하는 함수 인지. -> 유킬리드 호제법 사용
" 큰 수를 작은 수로 나눴을때 나오는 나머지를 계속 돌려막기하다가 0나오면 종료"
```
var a = 24
var b = 18

// b(나누는 수)가 0이 될 때까지 계속 릴레이를 돈다!
while (b != 0) {
    val remainder = a % b  // 1. 나머지를 구한다! (1라운드: 24 % 18 = 6)
    
    a = b                  // 2. a에다가 b를 넘겨준다! (a는 이제 18)
    b = remainder          // 3. b에다가 아까 구한 나머지를 넘겨준다! (b는 이제 6)
}

// b가 0이 돼서 반복문이 박살나고 나오면, a에 남아있는 값(6)이 최종 정답!
return a
```


<h2><a href="https://leetcode.com/problems/greatest-common-divisor-of-strings">1146. Greatest Common Divisor of Strings</a></h2><h3>Easy</h3><hr><p>For two strings <code>s</code> and <code>t</code>, we say &quot;<code>t</code> divides <code>s</code>&quot; if and only if <code>s = t + t + t + ... + t + t</code> (i.e., <code>t</code> is concatenated with itself one or more times).</p>

<p>Given two strings <code>str1</code> and <code>str2</code>, return <em>the largest string </em><code>x</code><em> such that </em><code>x</code><em> divides both </em><code>str1</code><em> and </em><code>str2</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">str1 = &quot;ABCABC&quot;, str2 = &quot;ABC&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;ABC&quot;</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">str1 = &quot;ABABAB&quot;, str2 = &quot;ABAB&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;AB&quot;</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">str1 = &quot;LEET&quot;, str2 = &quot;CODE&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;&quot;</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">str1 = &quot;AAAAAB&quot;, str2 = &quot;AAA&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;&quot;</span>​​​​​​​</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= str1.length, str2.length &lt;= 1000</code></li>
	<li><code>str1</code> and <code>str2</code> consist of English uppercase letters.</li>
</ul>
