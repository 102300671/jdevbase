<title>上机作业1</title>
<link rel="stylesheet" href="../../css/style.css">
<h1>上机作业1</h1>

## 1. 前驱、后继字符 (无输入)
**【问题描述】**
给定字符，找出它的前驱和后继字符（按照ASCII码值排序），并按照从小到大的顺序输出这三个字符和对应的ASCII值。  
**【输入形式】**
直接给定字符b  
**【输出形式】**
按两行输出：  
第一行按照从小到大的顺序输出这三个字符，并以一个空格隔开；  
第二行按照从小到大的顺序输出三个字符对应的ASCII值，并以一个空格隔开。  
**【输出样例】**
```
a b c
97 98 99
```
<font color="red">注意：必须编码实现，直接输出不得分！</font>

```
public class B {
  public static void main(String[] args) {
    char x='b';
    System.out.println((char)(x-1)+" "+x+" "+(char)(x+1));
    System.out.println(x-1+" "+(int)x+" "+(x+1));
  }
}
```

## 2. 数值变换 (无输入)
**【问题描述】**
编程，将一个三位正整数369进行逆转，得到963。  
**【输入形式】**
直接给定一个三位数369  
**【输出形式】**
输出逆转后的结果963。  
注意：必须编程实现，否则不得分  
程序部分代码如下，不要修改给出的代码：

```java
public class NumberInverse {

	public static void main(String[] args) {

		int x = 369;

                int y; //逆转后的数

		//这里写逆转的代码

		System.out.println(y);

	}

}
```

```java
public class NumberInverse {

	public static void main(String[] args) {

		int x = 369;

                int y; //逆转后的数

		//这里写逆转的代码
		y=0;
		while(x>0) {
		  y=y*10+x%10;
		  x=x/10;
		}

		System.out.println(y);

	}

}

```

## 3. 交换两个数(有输入)
**【问题描述】**
<font color="red">输入两个数</font>，实现两个数的交换，并输出交换后的结果。  
要点提示：
1. 假设有两个整型变量a和b，设计一个临时变量temp辅助交换  
2. 交换过程如下：

```
     temp = a;
     a = b;
     b = temp;
```

**【输入形式】**
输入两个整数，放在一行，空格隔开  
**【输出形式】**
输出交换后的整数，，放在一行，空格隔开  
**【样例输入】**
2 14  
**【样例输出】**
14 2  
**【样例说明】**
无

```java
import java.util.Scanner;
public class Swap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,t;
    a=sc.nextInt();
    b=sc.nextInt();
    t=a;
    a=b;
    b=t;
    System.out.println(a+" "+b);
    sc.close();
  }
}
```
