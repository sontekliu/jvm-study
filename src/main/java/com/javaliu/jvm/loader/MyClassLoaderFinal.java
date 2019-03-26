package com.javaliu.jvm.loader;

/**
 * 常量在编译阶段会存入调用这个常量的方法所在类的常量池中。
 * 本质上，调用类并没有直接引用到常量所在类，因此不会触发定义常量的类的初始化。
 * 注意：这里指的是将 MyParent2 的常量 str 存放到了 MyClassLoaderFinal 类的常量池中，
 * 之后，MyClassLoaderFinal 与 MyParent2 无任何关系。甚至可以将 MyParent2 的class 文件删除，
 * 但是对程序无任何影响
 *
 *
 * javap -c com.xx.xxx.MyParent2 反编译
 * 助记符：
 * ldc 表示将 int、float或者是 String 类型的常量值从常量池中推送至栈顶
 * bipush   表示将单字节的(-128-127) 的常量值推送至栈顶
 * sipush   表示将一个短整型(-32768-32767) 的常量值推送至栈顶
 * iconst_1 表示将int类型1推送至栈顶，范围(iconst_0 ~ iconst_5)
 * iconst_m1 表示将int类型-1推送至栈顶。
 */
public class MyClassLoaderFinal {

    public static void main(String[] args) {
        System.out.println(MyParent2.m2);
    }
}


class MyParent2{
    public static final String str = "hello world";
    public static final short s = 124;
    public static final int i = 128;
    public static final int m = 1;
    public static final int m2 = -1;

    static {
        System.out.println("This is MyParent2 static block");
    }
}
