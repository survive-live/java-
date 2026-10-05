# 第5课 循环 for / while / break / continue

> 重复干活

## 一、为什么用循环

同一件事要干很多次，抄一百遍不如用一个循环。**循环 = 让一段代码反复执行。**

## 二、for 循环

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

| 三段 | 含义 |
|---|---|
| int i = 0 | 起点：从 0 开始 |
| i < 10 | 条件：没到 10 就继续 |
| i++ | 每次走完加 1 |

## 三、while 循环

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

> **for 和 while 选哪个？** 知道次数用 for；不知道次数、靠条件停，用 while。

## 四、break 和 continue

| 关键字 | 作用 |
|---|---|
| break | 直接跳出整个循环 |
| continue | 跳过这一次，进入下一轮 |

> **记法：** break = 打断（不干了）；continue = 继续（跳过这次接着干）。

## 五、一句话总结

**循环让代码重复跑。for 知道次数，while 看条件。break 跳出去，continue 跳这次。**
