package com.javaliu.jvm.loader;

import java.util.Random;

/**
 * 当一个接口初始化时，并不需要其父接口完成了初始化，
 * 只有在真正使用到父接口的时候（如引用父接口中的常量），才初始化它们
 */
public class MyClassLoaderInterface {
    public static void main(String[] args) {

    }
}

interface MyParent5{
    /**
     * 接口中的属性均时 public static final 的，所以均可以省略
     */
    public static final int a = 5;
}

interface MyChild5 extends MyParent5{
    public static final int b = new Random().nextInt(7);
}
