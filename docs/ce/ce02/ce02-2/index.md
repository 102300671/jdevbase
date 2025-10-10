<title>课堂练习2-2</title>
<link rel="stylesheet" href="../../../css/style.css">
<h1>课堂练习2-2</h1>

## 分支-学生的成绩分级
**【问题描述】**
根据学生的成绩进行分级，级别包括excellent、good、pass和fail四个等级，若score变量存放成绩，其中  
 `excellent：` `score>= 90`  
 `good：` `score>=75`且`score < 90`  
 `pass：` `score>=60` 且`score < 75`  
 `fail：` `score <60`  
**【输入形式】**
从键盘读入学生0~100的学生成绩  
**【输出形式】**
输出成绩等级  
**【样例输入】**
95  
**【样例输出】**
excellent

{% highlight java linenos %}
{% include ce/ce02/ce02-2/Grade.java %}
{% endhighlight %}
