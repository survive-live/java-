# 第2课 Scanner 输入

> 和用户对话

## 一、为什么要输入

上一课的值都是写死的。想让程序读用户打进去的数，就要用 **Scanner**。

## 二、三步走

```java
import java.util.Scanner;          // 第1步：导入

public class Talk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 第2步：创建

        System.out.println("请输入年龄:");
        int age = sc.nextInt();                // 第3步：读取

        System.out.println("你今年" + age + "岁");

        sc.close();                            // 用完关掉
    }
}
```

## 三、next 家族对照

| 方法 | 读什么 | 例子 |
|---|---|---|
| nextInt() | 整数 | 18 |
| nextDouble() | 小数 | 1.75 |
| nextLine() | 一整行文字 | 小明 |

## 四、print 和 println 的区别

```java
System.out.print("你好");   // 不换行，光标停在这行末尾
System.out.println("你好"); // 输出完自动换行
```

> **记法：** 带 **ln** = line（换行）。

## ⚠️ 本课最容易踩的坑

- `import` 漏写 → 编译报错"找不到 Scanner"
- 读整数用了 `nextInt()`，读文字必须用 `nextLine()`，别混
- 用完最好 `sc.close()`，养成习惯

## 五、一句话总结

**Scanner = 程序的耳朵。import 导入、创建、读取、关闭，四步走。**
