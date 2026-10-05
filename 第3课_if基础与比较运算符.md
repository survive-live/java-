# 第3课 if 基础与比较运算符

> 条件判断

## 一、if 干啥用的

程序不是永远直着走。**if 就是"如果…就…"**，让程序会做选择。

## 二、语法

```java
if (条件) {
    // 条件成立才执行
} else {
    // 条件不成立才执行
}
```

## 三、比较运算符（背下来）

| 符号 | 含义 |
|---|---|
| > | 大于 |
| >= | 大于等于 |
| < | 小于 |
| <= | 小于等于 |
| == | 等于（判断用两个等号） |

> ⚠️ **判断相等是 `==`，不是 `=`！** `=` 是"赋值"（把右边塞给左边），`==` 才是"问相不相等"。

## 四、年龄判断示例

```java
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("成年人");
        } else {
            System.out.println("未成年");
        }
        sc.close();
    }
}
```

## 五、一句话总结

**if 让程序会拐弯。`==` 是判断，`=` 是赋值，千万别混。**
