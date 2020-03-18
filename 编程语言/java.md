**1.String类**

> 基本知识点

>> * String 类继承自object类，实现了compareable等接口
>> * 不可变，一旦定义了该字符串常量的内容、长度等就不能发生改变

> 方法
>>  * public int compareTo()：该方法用于比较两个字符串的大小，若str1< str2则返回一个负整数，若str1> str2则返回一个正整数,如果相等返回0

>> * valueof()：将int等基本数据类型或者字符型数组(char[] )转为字符串。为static方法，即类方法，由String类直接调用，无需创建实例