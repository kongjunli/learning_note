**1.内部命令和外部命令**
>   type查看命令的类型，hive python等命令是安装的

**2.管道命令 |**
>管道命令是将前面命令的结果传递给后面的命令

>例如：
- cat data.csv | python test.py
- cat data.csv | grep hello

**3.重定向命令**
> 重定向命令表示将命令的结果重定向到指定文件分为>和>>，其中>表示覆盖 >>表示追加

>    例如：
- hive -f test.sql > data.csv
- cat data.csv > data1.csv

**4.grep**
> grep命令是用来查找文件中包含指定内容的字符串

>    例如：
- grep hello data.csv 在data.csv中查找含有hello的记录
- grep hello \*file 在当前目录下所有后缀带有file的文件中包含hello的文件
- grep hello \*.csv 在当前目录下所有csv文件中查找包含hello的文件


**5.more less tail head**
>    more:类似cat,但是当文件内容较多时，单屏无法完全显示，使用more命令可以逐页显示，按**空格键**向下翻页**b**向上翻页
>    例如：
- more data.csv
- less:分页查看，同时还可以方便查找回翻
- tail:查看尾部的n行，head:查看头部的n行
- 例如：tail -10 head -10

**6.通配符使用**
>    liunx中使用的通配符有?、\*、\[ ]、\[！ ]
- \*:匹配任何字符、任何数量的字符，常用来匹配以某个字符开头的或结尾的所有文件
- ?:匹配单一数量的任何字符
- \[! ]:匹配除了\[! ]之外的**任意一个**字符
-  \[   ]:匹配\[   ]内的任意一个字符
> 例如：
-  ls  /usr/bin/w\*	该目录下所有以w开头的文件
-    ls /usr/bin/w?? 该目录下所有以w开头名称长度为3的文件
-    ls  /usr/bin/\[xyz]\* 该目录下文件名以x或y或z开头的文件名
-    ls  /usr/bin/\[!a-h]\* 该目录下不以a到h开头的文件名

**7.进程相关命令**
>    ps aux 显示进程信息
>    ps -ef 显示进程信息
>    ps -ef | grep java 显示java进程
>    kill -9 ID 杀死某个进程


**8.环境变量**
>    linux变量分为永久变量和临时变量，永久变量需要更改配置文件，临时变量只需要在bash中export，关闭bash则失效
>    永久变量设置：
- /etc/profile: 对liunx下所有用户有效，且是永久的(全局)
- \~./bash_profile:** login shell**，对liunx下当前工作用户有效，存在于当前用户主目录下(~)且是永久的(单一用户)
- \~./bashrc:** no login shell**，对liunx下当前工作用户有效，存在于当前用户主目录下(~)且是永久的(单一用户)

>    **永久变量定义后要使用source 命令使其生效**

**9.alias定义别名**
>    alias 别名='原命令'

**10.yum wget**
>    yum为安装工具 yum install
>    wget 为下载工具类似迅雷

**11.文件目录相关**
>    用户主目录：liunx存在多个用户，每个用户都存在一个主目录 /home/xxxx
>    - -:表示上一个工作目录
>    - ~:表示当前用户的主目录

**12.su sudo**
>    su:切换用户，默认切换到root
>    sudo :以root身份执行，但是可以不用切换以及root登录