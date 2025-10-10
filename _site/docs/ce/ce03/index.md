<title>课堂练习3</title>
<link rel="stylesheet" href="../../css/style.css">
<h1>课堂练习3</h1>

## 1. 循环编程练习-计算n以内的偶数和
**【问题描述】**
编程：计算n以内（不包括n）的偶数和。例如n为6，则6以内的偶数和为6，若n为100，则100以内偶数和为2450  
**【输入形式】**
输入n值  
**【输出形式】**
输出n以内的偶数和  
**【样例输入1】**
6  
**【样例输出1】**
6  
**【样例输入2】**
100  
**【样例输出2】**
2450  
**【样例说明】**
无  
**【评分标准】**

```java
import java.util.Scanner;

public class SumN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 0; i < n; i+= 2) {
      sum += i;
    }
    System.out.println(sum);
    sc.close();
  }
}
```

## 2. 找最大最小整数
**【问题描述】**
编写一个程序，用户输入若干整数，试找出其中的最大数和最小数。  
**【输入形式】**
用户在第一行待输入数据个数，在第二行输入数据。  
**【输出形式】**
程序在下一行输出数据的最大值和最小值  
**【样例输入】**
 ```
 5
 89 62 96 74 52
 ```    
**【样例输出】**
96 52    
**【样例说明】**
用户第一次输入的为数据个数，在下一行依次输入数据。输出为5个数中的最大值和最小值，输出时候两个数之间用空格分隔。

```java
import java.util.Scanner;

public class Maxin {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int min;
    int max;
    min = max = arr[0];
    for(int i = 1; i < n; i++) {
      if(min > arr[i]) {
        min = arr[i];
      }
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println(max+" "+min);
    sc.close();
  }
}
```
