**1.矩形重叠问题**

> * 解决思路：
		寻找不满足情况的条件

> * 题解
		不满足情况就4种情况，矩形B在矩形Ade上下左右侧，含边（顶点）重合的情况，因此只要找到这四种情况下的坐标关系即可

 > * 题目
 			矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。 给出两个矩形，判断它们是否重叠并返回结果。
			示例 1：
			输入：rec1 = [0,0,2,2], rec2 = [1,1,3,3]
			输出：true
			示例 2：
			输入：rec1 = [0,0,1,1], rec2 = [1,0,2,1]
			输出：false

<font color=red>java代码</font>

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

<font color=red>python代码</font>

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

**2.把数组组成最小的数**

> * 解决思路：
		利用字符串进行大小比较，自己定义比较规则

> * 题解：
		将int数组转为string，如果ab < ba则认为a < b，按照该字符串大小比较规则，将所有元素从小到大排序，最后直接输出即可

> * 题目
		输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
		示例 1:
		输入: [10,2]
		输出: "102"
		示例 2:
		输入: [3,30,34,5,9]
		输出: "3033459"
		提示: 0 < nums.length <= 100 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0

<font color=red>java代码</font>

```java
class Solution {
    public String minNumber(int[] nums) {
        //1.int[]->List<String>借用List的sort函数
        List<String> strList=new ArrayList();
        for(int num : nums){
            strList.add(String.valueOf(num));
        }
        strList.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder sb = new StringBuilder();
        for (String str : strList) {
            sb.append(str);
        }
        return sb.toString();

    }
}
//当坐标情况是以上四种关系时，则是不重合的情况
```

<font color=red>python代码</font>

```python
class cmpSmaller(str):
    def __lt__(self, y):
        return self + y < y + self  # 字符串拼接比较(两两比较)
    # 按由小到大来排列

class Solution:
    def minNumber(self, nums: List[int]) -> str:
        res=sorted(map(str, nums),key=cmpSmaller)
        smallest = ''.join(res)
        return smallest

```

**3.摆动排序**

> * 解决思路：

	将数组逆序排序，分为一大一小两部分，然后交叉
	实现时可以不用逆序排序，在交叉时逆序交叉。数组被分为 小[0,(len-1)/2]和大[(len+1)/2,len-1]，交叉时分别从(len-1)/2和len-1开始进行
	tips: (len-1)/2是数组中间值索引 对长度为奇数偶数都适用
	注意：while循环时需要考虑两部分数组长度不等，不会同时走完
> * 题目
	给定一个无序的数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
	示例 1:
	输入: nums = [1, 5, 1, 1, 6, 4]
	输出: 一个可能的答案是 [1, 4, 1, 5, 1, 6]
	示例 2:
	输入: nums = [1, 3, 2, 2, 3, 1]
	输出: 一个可能的答案是 [2, 3, 1, 3, 1, 2]

<font color=red>java代码</font>

```java
class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> result=new ArrayList();
        int ps=(n-1)/2;
        int pl=n-1;

        while(pl>(n-1)/2 && ps>=0){
            result.add(nums[ps--]);
            result.add(nums[pl--]);
        }
        while(ps>=0)
            result.add(nums[ps--]);
        while(pl>(n-1)/2)
            result.add(nums[pl--]);
        for (int i=0;i<n;i++){
            nums[i]=result.get(i);
        }
    }
}
//当坐标情况是以上四种关系时，则是不重合的情况
```

<font color=red>python代码</font>

```python
class Solution:
    def wiggleSort(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        tmp=[]
        nums.sort()#不逆序，升序排序
        l=len(nums)
        ps=int((l-1)/2)
        pl=l-1
        while (ps>=0 and pl>int((l-1)/2)):
            tmp.append(nums[ps])
            ps=ps-1
            tmp.append(nums[pl])
            pl=pl-1
        while(ps>=0):
            tmp.append(nums[ps])
            ps=ps-1
        while(pl>int((l-1)/2)):
            tmp.append(nums[pl])
            pl=pl-1
        for i in range(0,l):
            nums[i]=tmp[i]

```