## 초기접근
1. row랑 col의 리스트 덩어리 묶어서 서로 비교한뒤 그 숫자만큼 return한다는 로직이구나 생각을 함
2. 당연히 맞는 로직이지만 이를 어떻게 구현할지 어떻게 선언해서 어떤방식으로 집어넣을지 생각못함

``` kotlin
class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        //리스트 덩어리로 Map선언
        var total = 0
        val rowMap = grid.map{it.toList()}.groupingBy{it}.eachCount()

        //열을 담을 list선언후 집어넣기
        for(i in 0 until grid.size){
            val col = mutableListOf<Int>()
            for(j in 0 until grid.size){
                col.add(grid[j][i])
            }
            //행을 집어넣은 map과 열 집어넣은 col을 비교
            var counting = rowMap[col]
                if(counting != null){
                    total+=counting
                }
        }
        return total
    }
}
```
## Kotlin Correction
1. 행 집어넣기: Map에다가 list를 집어넣고 리스트 덩어리의 숫자만큼 map을 생성 
```kotlin
var RowMap = grid.map{it.toList}.groupingBy{it}.eachCount()
```
2. 열 집어넣기 << for문안에 mutableListOf<Int>() 선언하는 이유는 list바구니를 계속 만들어서 집어넣음, for문 밖에선언하면 안되는지 의문이었음
3. 행의 리스트 덩어리가 들어있는 Map과 열 덩어리가 들어있는 list를 비교
   ```kotlin
	var count = RowMap[col]
   ```
4. kotlin에서 List는 append가 불가능. 오로지 add
5. for문 안에서의 ㅊol 


<h2><a href="https://leetcode.com/problems/equal-row-and-column-pairs">2428. Equal Row and Column Pairs</a></h2><h3>Medium</h3><hr><p>Given a <strong>0-indexed</strong> <code>n x n</code> integer matrix <code>grid</code>, <em>return the number of pairs </em><code>(r<sub>i</sub>, c<sub>j</sub>)</code><em> such that row </em><code>r<sub>i</sub></code><em> and column </em><code>c<sub>j</sub></code><em> are equal</em>.</p>

<p>A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/06/01/ex1.jpg" style="width: 150px; height: 153px;" />
<pre>
<strong>Input:</strong> grid = [[3,2,1],[1,7,6],[2,7,7]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/06/01/ex2.jpg" style="width: 200px; height: 209px;" />
<pre>
<strong>Input:</strong> grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == grid.length == grid[i].length</code></li>
	<li><code>1 &lt;= n &lt;= 200</code></li>
	<li><code>1 &lt;= grid[i][j] &lt;= 10<sup>5</sup></code></li>
</ul>
