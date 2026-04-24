1. 초기접근의 실패원인: 두개의 포인터 모두 배열의 시작점에서 시작하여 포인터 두개가 모두 배열을 훑어야하는 시간복잡도가 O(N^2)이 되어버리는 현상발생. 너무 비효율적
2. 최적화: Left, Right Pointer두개로 돌자. 범위 계산하는 원리는 맞기 때문에 사용.
3. 그러나 최대범위 max를 갈아엎는 과정에서 최대범위값 수정후 언제 left포인터를 증가시키고 right 포인터를 감소시킬지를 고민하다가 해결못함.
4.  결론적으로 최대범위가 나오기위해선 배열내부 Value값이 작은것을 사용하여 세로길이를 구하여 계산하기 때문에 긴것을 버리는 전략.


<h2><a href="https://leetcode.com/problems/container-with-most-water">11. Container With Most Water</a></h2><h3>Medium</h3><hr><p>You are given an integer array <code>height</code> of length <code>n</code>. There are <code>n</code> vertical lines drawn such that the two endpoints of the <code>i<sup>th</sup></code> line are <code>(i, 0)</code> and <code>(i, height[i])</code>.</p>

<p>Find two lines that together with the x-axis form a container, such that the container contains the most water.</p>

<p>Return <em>the maximum amount of water a container can store</em>.</p>

<p><strong>Notice</strong> that you may not slant the container.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg" style="width: 600px; height: 287px;" />
<pre>
<strong>Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong>Output:</strong> 49
<strong>Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> height = [1,1]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == height.length</code></li>
	<li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= height[i] &lt;= 10<sup>4</sup></code></li>
</ul>
