#包说明

	java.lang: java语言的基础类，如String,Array,Object等
	java.util : java的collection集合相关的类，以及工具类

**1.String类**

> **基本知识点**

	String 类继承自java.lang.object类，实现了compareable等接口
	不可变，一旦定义了该字符串常量的内容、长度等就不能发生改变

> **常用总结**

	public int compareTo()：该方法用于比较两个字符串的大小，若str1< str2则返回一个负整数，若str1> str2则返回一个正整数,如果相等返回0
	valueof()：将int等基本数据类型或者字符型数组(char[] )转为字符串。为static方法，即类方法，由String类直接调用，无需创建实例

**2.StringBuilder类**

**3.StringBuffer类**

**4.Lsit接口**

> **基本知识点**

	属于java.util包，List接口继承自Collection 和  Iterable两个接口(接口可以多继承)，实现类有ArrayList,LinedList,Stack,Vector等
	 与常用的Collection，ArrayList之间的关系 ：Collection(接口)<-List(接口)<-ArrayList(类)
**List接口继承自Collection接口，ArrayList类是实现LIst接口的一个类**

> **常用总结**

	public int compareTo()：该方法用于比较两个字符串的大小，若str1< str2则返回一个负整数，若str1> str2则返回一个正整数,如果相等返回0
	valueof()：将int等基本数据类型或者字符型数组(char[] )转为字符串。为static方法，即类方法，由String类直接调用，无需创建实例

**5.Collection Collections**

> **基本知识点**

	Collection 是集合的顶级接口，多个类对其进行实例化，提供对集合操作的基本操作
	Collections 是集合的包装类，提供一系列静态方法供操作集合使用，**该类不能被实例化**

> **常用总结**

	 Collections.sort(List l)：对列表进行升序排序
	 Collections.sort(List l, Comparator c)：对列表按照指定的比较器进行升序排序

**6.Array  Arrays ArrayList**

> **基本知识点**

	Array ([]): 属于java.lang.reflect包，属于基础类，父类为java.lang.Object  ，创建数组和访问数组
	Arrays:  属于java.util包，即属于java的collection框架,提供排序、搜索、转换等操作，数组(Array)作为其参数，方法基本为static方法，即由类直接调用Arrays.function
	ArrayList: 属于java.util包，实现了List接口,主要功能是提供了一个可变长度的数组
	关系：Array是java里数组的基本类型，长度不可变，即插入和删除操作很困难;ArrayList是java集合类，是实现了List的接口，即改变了Array的上述弊端，使数组具备了List的性质，可变长度，插入删除操作方便;Arrays是提供了更丰富的数组操作


> **常用总结**

	 ArrayList->[]: toArray()
	 []->ArrayLsit: Arrays.aslist([])
	 [] 和Arrays: Arrays.sort([]) Arrays.toString()

**7.& &&**

> **基本知识点**

	& 是位运算，A & B 会判断两个条件是否满足，将两个条件的判断结果按位相与
	&& 是逻辑运算，如果第一个条件A不满足，则不会判断第2个