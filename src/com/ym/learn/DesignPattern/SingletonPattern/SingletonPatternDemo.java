package com.ym.learn.DesignPattern.SingletonPattern;

import org.junit.jupiter.api.Test;

import static com.ym.learn.DesignPattern.SingletonPattern.SingleEnum.INSTANCE;

public class SingletonPatternDemo {
    @Test //饿汉
    public void getSingleObject() {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
        System.out.println(object);
    }

    @Test//懒汉(线程不安全)
    public void getSingleLazy() {
        SingleLazy instance = SingleLazy.getInstance();
        System.out.println(instance);
    }

    @Test//懒汉(线程安全)
    public void getSingleLazySafety() {
        SingleLazySafety instance = SingleLazySafety.getInstance();
        System.out.println(instance);
    }

    @Test//登记式/静态内部类
    public void getSingleRegister() {
        SingleRegister instance = SingleRegister.getInstance();
        System.out.println(instance);
    }

    @Test//双检锁/双重校验锁（DCL，即 double-checked locking）
    public void getSingleDCL() {
        SingleDCL instance = SingleDCL.getInstance();
        System.out.println(instance);
    }

    @Test//枚举
    public void getSingleEnum() {
        INSTANCE.whateverMethod();
    }

}
