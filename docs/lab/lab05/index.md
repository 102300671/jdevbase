---
layout: md
title: 上机作业5
---

<h1>上机作业5</h1>

## 1. 简单类的定义和使用
设计一个工人类Worker，属性有姓名（String）、年龄（int）、工资（double）、级别（String），设计一个方法显示工人的基本信息。  
设计一个Main类，包含main方法，创建Worker类的对象，输出工人的信息。  
无输入！  
输出结果为：  
name:Worker Zhang  
age:28  
salary:8888.0  
level:SeniorEngineer  
[Worker.zip](../../../_includes/zip/lab/lab05/Worker.zip)
主类名:Main

{% highlight java linenos %}
{% include lab/lab05/Worker/Worker.java %}
{% endhighlight %}

{% highlight java linenos %}
{% include lab/lab05/Worker/Main.java %}
{% endhighlight %}

## 2. 类的基本定义和使用
设计一个矩形类Rect，属性有边1（side1）和边2（side2），类型是double；  
设计两个方法，  
一个方法计算矩形的面积，方法头声明如下：  
`public double getArea()`  
，一个方法计算矩形的周长，方法头声明如下：  
`public double getPerimeter()`。  
设计一个Main类，包含main方法，创建MyRect类的对象，计算任意矩形的面积和周长。  
若输入：3 4  
则输出为：  
area is:12.0  
perimeter is:14.0  
若输入：5 8  
则输出为：  
area is:40.0  
perimeter is:26.0  
[Rect.zip](../../../_includes/zip/lab/lab05/Rect.zip)
主类名:Main

{% highlight java linenos %}
{% include lab/lab05/Rect/Rect.java %}
{% endhighlight %}

{% highlight java linenos %}
{% include lab/lab05/Rect/Main.java %}
{% endhighlight %}

## 3. 类的属性和方法
**【问题描述】**
设计一个公共类手机类MobilePhone，包含三个属性：品牌（字符串类型）、号码（字符串类型）、价格（int类型），设计一个方法display显示手机的基本信息，设计一个带3个参数的构造方法初始化对象属性。设计测试类Test，创建MobilePhone类的对象，显示手机的基本信息。运行结果如下：  

```
brand:HUAWEIMate30  
TelePhoneNum:16945678999  
price:3380  
```

**【输入形式】**
无  
**【输出形式】**  

```
brand:HUAWEIMate30  
TelePhoneNum:16945678999  
price:3380
```

**【样例输入】**  
**【样例输出】**  
**【样例说明】**  
**【评分标准】**  
注意下面几点，否则会扣分：  
（1）必须定义两个类，分别是MobilePhone类和测试类；  
（2）必须定义display方法  
（3）输出的“HUAWEIMate30”、“16945678999”和“3380”是属性值。  
[MobilePhone.zip](../../../_includes/zip/lab/lab05/MobilePhone.zip)
主类名:test

{% highlight java linenos %}
{% include lab/lab05/MobilePhone/MobilePhone.java %}
{% endhighlight %}

{% highlight java linenos %}
{% include lab/lab05/MobilePhone/Test.java %}
{% endhighlight %}