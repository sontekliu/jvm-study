package com.javaliu.jvm.loader;

/**
 * [Lcom.javaliu.jvm.loader.MyParent4 对于数组实例来说，是由 Java 虚拟机在运行时动态生成的一种数据类型
 * [[Lcom.javaliu.jvm.loader.MyParent4 这个是二维数组
 * [[[Lcom.javaliu.jvm.loader.MyParent4 这个是三维数组
 *
 * 数组类型的父类就是 java.lang.Object，无论是几维数组
 *
 * 对于数组来说，JavaDoc 经常将构成数组的元素为 Component，实际上就是将数组降低一个维度后的类型
 *
 *
 * 助记符：
 * anewarray    表示创建一个引用类型的（如类，接口，数组）数组，并将其引用值压入栈顶
 * newarray     表示创建一个指定的原始类型（如int、float、char等）的数组，并将其引用值压入栈顶
 */
public class MyClassLoaderArray {
    public static void main(String[] args) {
        MyParent4[][][] myParent4 = new MyParent4[1][][];
        System.out.println(myParent4.getClass().getSuperclass());
        System.out.println(myParent4.getClass().getName());

/*        int[] ints = new int[1];      [I
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());*/

/*        char[] ints = new char[1];        // [C
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());*/

/*        boolean[] ints = new boolean[1];  // [Z
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());*/

/*        short[] ints = new short[1];        // [S
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());*/

/*        byte[] ints = new byte[1];        // [B
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());*/

        long[] ints = new long[1];        // [J
        System.out.println(ints.getClass().getSuperclass());
        System.out.println(ints.getClass());
    }
}

class MyParent4{
    static {
        System.out.println("MyParent4 static block");
    }
}
