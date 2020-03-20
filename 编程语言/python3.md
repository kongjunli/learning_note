**1.sort() sorted()**
> **基本知识点**

	sort()是**list**的方法，对list进行**原地**排序，即不会产生新的list
	 sorted() 能够对所有的iterable排序，会返回一个新的**list** iterable->list

> **常用总结**

>> * sorted()

>>>  <font color=red>对字典的key进行排序</font>
```python
sorted({1: 'D', 2: 'B', 3: 'B', 4: 'E', 5: 'A'})  #[1,2,3,4,,5]
```
>>> <font color=red>key参数的使用</font>
```python
#key参数是一个函数，会作用于iterable的每个元素，将函数的返回结果作为排序对象
student_tuples = [
...     ('john', 'A', 15),
...     ('jane', 'B', 12),
...     ('dave', 'B', 10),
... ]
sorted(student_tuples,key=lambda s:s[2])
##[('dave', 'B', 10), ('jane', 'B', 12), ('john', 'A', 15)]
```

**2.& and**
> **基本知识点**

	& 是位运算
	and 逻辑运算 （or:逻辑运算"或"，not:逻辑运算"否"

**3.map使用**
> **基本知识点**

	map报出KeyError错误时，是因为key不存在。因此在使用map时，正确使用为m.get('key',default_value)

**4.json**
> **基本知识点**

	json.loads() 将json对象(str)转为python对象,即将字符串中包裹的内容转为本来的类型,例如'map'->map,'int'->int
	json.dumps() 将python对象转为json(str)
	注意：
	json.loads() 不能处理**'None',None以及空字符串**，因此使用前先判断

**5.eval**
> **基本知识点**

	和json的作用很像，参数为字符串，但是还可以做运算。与json.loads()的对比
	*可以处理'None'，返回Nonetype
	*不可以处理None和空字符串''
	*可以做运算 eval('4'+'+'+'5') 9