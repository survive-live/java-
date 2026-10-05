# 第4课 if 多分支与逻辑运算符

> 条件判断（续）

## 一、多个 else if：一条一条往下比

条件不止两个时，用 `else if` 串起来，从上往下判断，命中一个就走完跳出。

```java
if (score >= 90) {
    System.out.println("优秀");
} else if (score >= 80) {
    System.out.println("良");
} else if (score >= 60) {
    System.out.println("及格");
} else {
    System.out.println("挂科");
}
```

> **判断顺序很重要：** 先比大的（90），再比小的（80）。反过来就全错。

## 二、逻辑运算符

| 符号 | 含义 | 例子 |
|---|---|---|
| && | 并且（两边都成立） | age >= 18 && age <= 60 |
| \|\| | 或者（有一个成立） | score < 60 \|\| score > 100 |

## 三、完整示例：分数等级

```java
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score >= 0) {
            System.out.println("挂科");
        } else {
            System.out.println("加油");
        }
        sc.close();
    }
}
```

## ⚠️ 本课最容易踩的坑

- `&&` 是两个 &，`||` 是两个 |，别只写一个
- else if 的顺序必须从高到低，顺序错了结果就错
- "判断"用 `==`，"赋值"用 `=`，这是上一课的坑，复习一下

## 四、一句话总结

**多分支用 else if 串起来，顺序从高到低。&& 是并且，|| 是或者。**
