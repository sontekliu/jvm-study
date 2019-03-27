package com.javaliu.jvm.loader;

import java.util.UUID;

/**
 * 当一个常量值并非在编译期确定的，那么其值就不会被放入到调用类的常量池中，
 * 当调用程序时，就会导致主动使用这个常量所在的类，显然会导致这个类的初始化。
 */
public class MyClassLoaderDynamicFinal {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3{
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static block");
    }
}
