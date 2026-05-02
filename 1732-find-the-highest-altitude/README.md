1. 초기접근: 그냥 단순하게 다음배열에 앞에배열값 더해서 교체하는 방식으로 접근함 근데 코드 다짜고 돌리니까
   
2. 바로 IndexOutOfBounds떠버림 그래서 0번인덱스가 초기 max값 0보다 크면 max를 교체해주고 돌림
   
3. For문에서는 1부터 시작해서 i-1값 더해서 집어넣기, 만약 i번 인덱스가 max보다 크다면 해당값으로 max값 교체 

<h2><a href="https://leetcode.com/problems/find-the-highest-altitude">1833. Find the Highest Altitude</a></h2><h3>Easy</h3><hr><p>There is a biker going on a road trip. The road trip consists of <code>n + 1</code> points at different altitudes. The biker starts his trip on point <code>0</code> with altitude equal <code>0</code>.</p>

<p>You are given an integer array <code>gain</code> of length <code>n</code> where <code>gain[i]</code> is the <strong>net gain in altitude</strong> between points <code>i</code>​​​​​​ and <code>i + 1</code> for all (<code>0 &lt;= i &lt; n)</code>. Return <em>the <strong>highest altitude</strong> of a point.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> gain = [-5,1,5,0,-7]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> gain = [-4,-3,-2,-1,4,3,2]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == gain.length</code></li>
	<li><code>1 &lt;= n &lt;= 100</code></li>
	<li><code>-100 &lt;= gain[i] &lt;= 100</code></li>
</ul>
