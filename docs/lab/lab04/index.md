---
layout: md
title: 上机作业4
---

<h1>上机作业4</h1>

## 1. 方法-质因数
**【问题描述】**  
每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为`2x3`，而24可以被分解为`2x2x2x3`。  
现在，你的程序要读入一个`[2,100000]`范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。  

<font color = "red">注意：在程序中要使用除main之外的方法！</font>

**【输入形式】**
一个整数，范围在`[2,100000]`内。  
**【输出形式】**
形如：  
`n=axbxcxd`  
或  
`n=n`  
所有的符号之间都没有空格，x是小写字母x。  
**【样例输入】**
18  
**【样例输出】**
`18=2x3x3`

{% highlight java linenos %}
{% include lab/lab04/PrimeFactorization.java %}
{% endhighlight %}

## 2. java语言基础-数组和方法
**【问题描述】**
定义静态方法`findPrime(int []arr)`，找出数组arr中的全部素数。  
素数也称质数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数。  

<font color = "red">注意：你定义main函数的写法如下，不要修改main函数中的代码，否则会扣分！</font>  

```java
public static void main(String[] args) {
  int arr[]= {3,5,7,8,10,12,35,37,4583,8457};
  findPrime(arr);
}
```

**【输入形式】**
无输入   
**【输出形式】**
arr数组中的全部素数  
**【样例输入】**
无  
**【样例输出】**  
3  
5  
7  
37  
4583

{% highlight java linenos %}
{% include lab/lab04/FindPrime.java %}
{% endhighlight %}