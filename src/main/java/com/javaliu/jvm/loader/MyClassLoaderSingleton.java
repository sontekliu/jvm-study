package com.javaliu.jvm.loader;

public class MyClassLoaderSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1: " + Singleton.counter1);
        System.out.println("counter2: " + Singleton.counter2);
    }
}

class Singleton{
    // 输出 counter1:1，counter2:0
    private static Singleton singleton = new Singleton();
    public static int counter1;
    public static int counter2 = 0;


    // 输出 counter1:1，counter2:1
    //private static Singleton singleton = new Singleton();
    private Singleton(){
        counter1++;
        counter2++;
        // 输出 counter1:1，counter2:1
        System.out.println("counter1:" + counter1 + "-- counter2:" + counter2);
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
