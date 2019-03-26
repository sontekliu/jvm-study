package com.javaliu.jvm.loader;

public class MyClassLoader {
    public static void main(String[] args) {
        // 对于静态字段来说，只有直接定义了该字段的类才会被初始化
        System.out.println(MyChild1.str);
        // 当一个类在初始化时，要求其父类必须全部初始化
        System.out.println(MyChild1.str2);
    }
}

class Parent1{
    public static String str = "hello world";

    static {
        System.out.println("Parent1 static block");
    }
}

class MyChild1 extends Parent1{
    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}
