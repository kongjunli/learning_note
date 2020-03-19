**1.sort() sorted()**

> * sort()是**list**的方法，对list进行***原地**排序，即不会产生新的list
> * sorted() 能够对所有的iterable排序，会返回一个新的**list** iterable->list
> 常见总结

>> * sorted()

```
####对字典的key进行排序
sorted({1: 'D', 2: 'B', 3: 'B', 4: 'E', 5: 'A'})  #[1,2,3,4,,5]
```
```
####key参数的使用
'''
key参数是一个函数，会作用于iterable的每个元素，将函数的返回结果作为排序对象
'''
student_tuples = [
...     ('john', 'A', 15),
...     ('jane', 'B', 12),
...     ('dave', 'B', 10),
... ]
sorted(student_tuples,key=lambda s:s[2])
##[('dave', 'B', 10), ('jane', 'B', 12), ('john', 'A', 15)]
```