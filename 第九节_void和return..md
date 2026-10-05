# 第九节：void 和 return

> 2026-10-05 · Java 函数基础

---

## 一、核心概念

> **一句话讲透：`void` = 说出来就忘，`return` = 写在本子上**

函数干完活之后，有两种选择：

- **`void`**：干完就走，啥也不带回来，外面谁也拿不到结果。
- **`return`**：把结果"递"出来，主函数可以接着用。

---

## 二、void 版：干完就走

### 代码示例

```java
public static void showMax(int[] scores) {
    int max = scores[0];
    for (int i = 1; i < scores.length; i++) {
        if (scores[i] > max) {
            max = scores[i];
        }
    }
    System.out.println("最高分是：" + max);
    // 打完字，max 就消失了，外面谁也拿不到
}
```

**调用方式：**

```java
showMax(scores);  // 直接写，不接任何东西
```

**食堂打饭比方：** 你跟打饭阿姨说"帮我盛碗饭"，她盛好了直接放在你面前——你没伸手去接。你只能当场吃，饭吃完就没了，你手里啥也没有。

**特点：** 能打印，但不能拿这个数干别的事。

---

## 三、int 版：把结果递出来

### 完整代码

```java
public static int getMax(int[] scores) {
    int max = scores[0];
    for (int i = 1; i < scores.length; i++) {
        if (scores[i] > max) {
            max = scores[i];
        }
    }
    return max;  // 把 92 递出来
}

public static void main(String[] args) {
    int[] scores = {90, 85, 77, 92, 88};
    int max = getMax(scores);
    System.out.println("最高分是：" + max);
}
```

**输出：**

```
最高分是：92
```

**食堂打饭比方（int 版）：** 你跟打饭阿姨说"把饭递给我"，她把碗递到你手里——这碗饭现在是你的了。你端着它，可以端到桌上，也可以端到窗边，还可以把两碗饭放一起比比哪个多。

---

## 四、那为啥要分？

`void` 版只能在里面打印，打印完就废了。

`int` 版带回来的数，主函数还能接着用：

```java
int max = getMax(scores);
int min = getMin(scores);
System.out.println("分差：" + (max - min));  // 两个数都能用
```

> ⚠️ **void 版做不到这个**——它打印完就把数字扔了，外面再也拿不到那个值，也就没法拿它做进一步计算。

**"问同桌作业"比方：**

- **void 版：** 你问同桌"今天语文作业是啥？"他说"抄课文"，说完就低头玩手机了，你也没拿笔记——你想再问他"那抄几遍"，问不了了，他自己都忘了。
- **int 版：** 你问他，他说完，你还拿笔记在了本子上。本子上有字，你想干嘛都行："抄几遍？"翻本子看看。"要写几页？"翻本子看看。

> 本子 = 那个变量 `max`
> 记在本子上 = `return` 把数递出来
> 翻本子 = 后面用 `max * 2`、`max - 60`

---

## 五、对照表

| 前面的字 | 意思 | 必须配 |
|---|---|---|
| `void` | 不带东西回来 | 不写 return |
| `int` | 带一个整数回来 | `return 数字` |
| `double` | 带一个小数回来 | `return 小数` |

---

## 六、踩坑提醒

> ⚠️ **类名首字母要大写：** `Max.java` 配 `class Max`，文件名和类名必须一模一样。

> ⚠️ **函数名要和干的事对上：** 找最大值就叫 `getMax`，别叫 `getAvg`（那是求平均）。

> ⚠️ **`void` ↔ 没有 `return`；`int` ↔ `return` 一个数**，永远是成双成对的，少一个就报错。

---

## 七、本节总结

> **`void`：说出来就完了，谁也留不住。**
> **`return`：说出来，还给你写在本子上，你随时能用。**

`return` 的意思就是：**把结果装进等号左边的那个盒子。**

```java
int max = getMax(scores);
        └──────┬──────┘
               │
    这个 max，就是那个"带回来的东西"住的地方
```

---

*第九节 · void 和 return · 2026-10-05*
