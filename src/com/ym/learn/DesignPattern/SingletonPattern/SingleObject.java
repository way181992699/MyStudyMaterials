package com.ym.learn.DesignPattern.SingletonPattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private static int a = 2;

    private SingleObject() {
        System.out.println("【SingleObject构造方法】a=" + a);
        System.out.println("【SingleObject构造方法】instance=" + instance);
    }

    static {
        System.out.println("【SingleObject类静态块】instance=" + new SingleObject());
        System.out.println("【SingleObject类静态块】a=" + a);
    }

    public static SingleObject getInstance() {
        System.out.println("【SingleObject类实例】" + instance);
        System.out.println("【执行获取单例SingleObject对象的方法】a=" + a);
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
