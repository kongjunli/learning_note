**1.矩形重叠问题**

> * 解决思路：寻找不满足情况的条件

> * 题解
不满足情况就4种情况，矩形B在矩形Ade上下左右侧，含边（顶点）重合的情况，因此只要找到这四种情况下的坐标关系即可

 题目

矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。

如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。

给出两个矩形，判断它们是否重叠并返回结果。
示例 1：

输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
输出：true
示例 2：

输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
输出：false

####java代码

```java
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||   // left
                 rec1[3] <= rec2[1] ||   // bottom
                 rec1[0] >= rec2[2] ||   // right
                 rec1[1] >= rec2[3]);    // top
    }
}
//当坐标情况是以上四种关系时，则是不重合的情况
```

####python代码

```python
class Solution:
    def isRectangleOverlap(self, rec1: List[int], rec2: List[int]) -> bool:
        x1=rec1[0]
        y1=rec1[1]
        x2=rec1[2]
        y2=rec1[3]
        x_1=rec2[0]
        y_1=rec2[1]
        x_2=rec2[2]
        y_2=rec2[3]
        not_inter=False
        if (x_2<=x1) or (x2<=x_1) or (y2<=y_1) or (y_2<=y1):
            not_inter=True
        return ~not_inter
```