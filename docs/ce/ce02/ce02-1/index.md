---
layout: md
title: 课堂练习2-1
---

<h1>课堂练习2-1</h1>

## 摄氏华氏温度转换 （无输入）
**【问题描述】**
假如用C表示摄氏温度，F表示华氏温度，则有：F=C*9/5+32。给定一个摄氏温度值，根据该公式编程求对应的华氏温度，结果小数点后保留一位有效数字。  
**【输入】**  
给定摄氏温度101  
**【输出】**
213.8  
提示：输出保留小数点后一位有效数字，可以使用如下形式：  
`System.out.printf("%.1f",f);`  
printf和C语音的printf非常类似。

{% highlight java linenos %}
{% include ce/ce02/ce02-1/Tem.java %}
{% endhighlight %}
